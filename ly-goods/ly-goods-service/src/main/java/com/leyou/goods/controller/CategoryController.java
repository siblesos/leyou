package com.leyou.goods.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyou.goods.entity.Category;
import com.leyou.goods.service.CategoryService;
import com.leyou.result.ResponseMessage;
import com.leyou.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 前端控制器
 * </p>
 *
 * @author 丁强
 * @since 2019-12-26
 */
@Api(tags = "商品类目|CategoryController")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService ;

    @ApiOperation(value = "测试")
    @GetMapping(value = "/hello")
    public ResponseMessage<String> hello(){
        return Result.success();
    }

    @ApiOperation(value = "测试")
    @GetMapping(value = "/page")
    public ResponseMessage<Page> page(Page<Category> page){
        IPage res = categoryService.page(page);
        page.setRecords(res.getRecords());
        return Result.success(page);
    }

    @ApiOperation(value = "根据弗雷目展示子类目列表")
    @GetMapping(value = "/list")
    public ResponseMessage<List<Category>> list(int pid){

        return Result.success(categoryService.listByPid(pid));
    }

}
