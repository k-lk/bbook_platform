package com.wky.book.controller;


import com.wky.book.service.BookCategoryService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 账本分类表 前端控制器
 * </p>
 *
 * @author wky
 * @since 2022-04-02
 */
@RestController
@RequestMapping("/api/bookCategory")
public class BookCategoryController {


    @Resource
    BookCategoryService bookCategoryService;

}
