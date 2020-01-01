package com.leyou.goods.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyou.goods.entity.Brand;
import com.leyou.goods.service.BrandService;
import com.leyou.result.ResponseMessage;
import com.leyou.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 前端控制器
 * </p>
 *
 * @author 丁强
 * @since 2020-01-01
 */
@Api(tags = "商品品牌|BrandController")
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService ;
    @ApiOperation(value = "测试")
    @GetMapping(value = "/page")
    public ResponseMessage<Page> page(Page<Brand> page){
        IPage res = brandService.page(page);
        page.setRecords(res.getRecords());
        return Result.success(page);
    }

}
