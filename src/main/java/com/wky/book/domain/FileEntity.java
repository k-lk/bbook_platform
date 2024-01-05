package com.wky.book.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>
 * 账本表
 * </p>
 *
 * @author wky
 * @since 2022-04-02
 */
@Data
@NoArgsConstructor
@TableName("tb_file")
@ApiModel(value = "File对象", description = "文件表")
public class FileEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("base64的图片信息")
    @NotNull(message = "base64的图片信息")
    private String imageBase64;

    public FileEntity(String imageBase64) {
        this.imageBase64 = imageBase64;
    }
}
