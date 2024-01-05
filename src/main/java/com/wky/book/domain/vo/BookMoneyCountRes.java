package com.wky.book.domain.vo;

import com.wky.book.domain.BookMoney;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author weikaiyu
 * @Date 2022/4/19 17:29
 */
@Data
@AllArgsConstructor
public class BookMoneyCountRes {
    // 支出，
    private Long exSum;

    //    收入
    private Long enterSum;

    private List<CategorySelectList> categorySelectList;

    private ResultPage<BookMoney> bookMoneyList;

    // 根据分类过滤的支出
    private Long selectIncome;

    // 根据分类过滤的支收入
    private Long selectExpenditure;
}
