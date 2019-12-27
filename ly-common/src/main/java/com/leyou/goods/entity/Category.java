package com.leyou.goods.entity;

    import com.baomidou.mybatisplus.annotation.*;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.util.Date;
    import java.io.Serializable;

    import com.fasterxml.jackson.annotation.JsonFormat;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系
    * </p>
*
* @author 丁强
* @since 2019-12-26
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("tb_category")
    public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

            /**
            * 类目id
            */
            @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

            /**
            * 类目名称
            */
    private String name;

            /**
            * 父类目id,顶级类目填0
            */
    private Long parentId;

            /**
            * 是否为父节点，0为否，1为是
            */
    private Boolean isParent;

            /**
            * 排序指数，越小越靠前
            */
    private Integer sort;

            /**
            * 是否删除
            */
        @TableLogic
    private Integer deleted;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date updateTime;

    @Version
    private Integer version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
