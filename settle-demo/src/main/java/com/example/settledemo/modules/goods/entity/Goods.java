package com.example.settledemo.modules.goods.entity;
import java.math.BigDecimal;
import com.example.settledemo.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
/**
 * <p>
 * 商品表
 * </p>
 *
 * @author xiaomalover
 * @since 2019-02-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Goods extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 有赞商品ID
     */
    private Integer goodsId;

    /**
     * 有赞商品封面图
     */
    private String goodsImage;

    /**
     * 有赞商品别名
     */
    private String goodsAlias;

    /**
     * 有赞商品详情链接
     */
    private String goodsDetailUrl;

    /**
     * 等级
     */
    private Boolean goodsLevel;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 排序
     */
    private Integer sortNo;

    /**
     * 商品销量
     */
    private Integer goodsSales;

    /**
     * 商品价格(单位：元)
     */
    private BigDecimal goodsPrice;

    /**
     * 会员商品价格(单位：元)
     */
    private BigDecimal memberPrice;

    /**
     * 店铺等级
     */
    private Integer shopLevel;

    /**
     * 分润比例
     */
    private BigDecimal profitRate;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;

}
