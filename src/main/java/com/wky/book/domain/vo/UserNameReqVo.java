package com.wky.book.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * 修改用户别名，真实姓名
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "修改用户别名，真实姓名对象", description = "修改用户别名，真实姓名入参实体")
public class UserNameReqVo {

    @ApiModelProperty("用户id")
    @NotNull(message = "用户id不能为空")
    private String userId;

    @ApiModelProperty("账本id不能为空")
    @NotNull(message = "用户id不能为空")
    private Long bookId;

    @ApiModelProperty("真实姓名")
    @NotNull(message = "真实姓名不能为空")
    private String userName;

    @ApiModelProperty("用户别名")
    @NotNull(message = "用户别名不能为空")
    private String reallyName;
}
