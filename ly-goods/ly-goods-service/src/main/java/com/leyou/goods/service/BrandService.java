package com.leyou.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leyou.goods.entity.Brand;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务类
 * </p>
 *
 * @author 丁强
 * @since 2020-01-01
 */
public interface BrandService extends IService<Brand> {

}
