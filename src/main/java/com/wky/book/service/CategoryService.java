package com.wky.book.service;

import com.wky.book.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wky.book.domain.vo.CategoryQueryReqVo;
import com.wky.book.domain.vo.CategoryReqVo;
import com.wky.book.domain.vo.CategoryQueryResVo;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author wky
 * @since 2022-04-02
 */
public interface CategoryService extends IService<Category> {

    /**
     * 创建分类
     * @param categoryReqVo
     * @param s
     * @param bookId
     * @param request
     */
    void save(CategoryReqVo categoryReqVo, String s, @NotNull(message = "账本id不能为空") Long bookId, HttpServletRequest request);

    List<Category> findList(CategoryQueryReqVo categoryQueryReqVo);

    CategoryQueryResVo findBookIdList(Long bookId);

    void remove(Long categoryId);

}
