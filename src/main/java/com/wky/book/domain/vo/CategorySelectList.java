package com.wky.book.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author weikaiyu
 * @date 2023/1/10 17:37
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
public class CategorySelectList {

    private String categoryName;

    private Long categoryId;

}
