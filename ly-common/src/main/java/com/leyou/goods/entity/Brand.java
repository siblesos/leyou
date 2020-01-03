package com.leyou.goods.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.util.Date;
    import com.baomidou.mybatisplus.annotation.Version;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableLogic;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 品牌表，一个品牌下有多个商品（spu），一对多关系
    * </p>
*
* @author 丁强
* @since 2020-01-03
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("tb_brand")
    public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

            /**
            * 品牌id
            */
            @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

            /**
            * 品牌名称
            */
    private String name;

            /**
            * 品牌图片地址
            */
    private String image;

            /**
            * 品牌的首字母
            */
    private String letter;

    private Date createTime;

    private Date updateTime;

        @TableLogic
    private Integer deleted;

        @Version
    private Integer version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
