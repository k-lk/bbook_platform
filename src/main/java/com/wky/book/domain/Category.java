package com.wky.book.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author wky
 * @since 2022-04-02
 */
@AllArgsConstructor
@Data
@TableName("tb_category")
@ApiModel(value = "Category对象", description = "分类表")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    public Category() {
    }

    @ApiModelProperty("系统id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty("账本id")
    private Long bookId;

    @ApiModelProperty("启用状态（0-禁用 ，1-启用）")
    private Integer status;

    @ApiModelProperty("分类名称")
    private String name;

    @ApiModelProperty("分类高亮图标url")
    private String weightIcon;

    @ApiModelProperty("分类图标url")
    private String icon;

    @ApiModelProperty("分类类型（0-收入 1-支出）")
    private Long type;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private Long updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("排序字段")
    private Integer sort;

    @Override
    public String toString() {
        return "Category{" +
            "id=" + id +
            ", status=" + status +
            ", name=" + name +
            ", createBy=" + createBy +
            ", createTime=" + createTime +
            ", updateBy=" + updateBy +
            ", updateTime=" + updateTime +
        "}";
    }
}
