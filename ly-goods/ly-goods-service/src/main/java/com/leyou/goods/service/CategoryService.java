package com.leyou.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leyou.goods.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务类
 * </p>
 *
 * @author 丁强
 * @since 2019-12-26
 */
public interface CategoryService extends IService<Category> {

    List<Category> listByPid( int pid);

}
