package com.leyou.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leyou.goods.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 Mapper 接口
 * </p>
 *
 * @author 丁强
 * @since 2019-12-26
 */
public interface CategoryMapper extends BaseMapper<Category> {
    List<Category> listByPid(@Param("pid") int pid);

}
