package com.leyou.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leyou.goods.entity.Brand;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 Mapper 接口
 * </p>
 *
 * @author 丁强
 * @since 2020-01-01
 */
public interface BrandMapper extends BaseMapper<Brand> {

}
