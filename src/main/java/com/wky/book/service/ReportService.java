package com.wky.book.service;

import com.wky.book.domain.vo.ReportMoneyVo;
import com.wky.book.domain.vo.ReportMoneyRes;

import java.util.List;

/**
 * @author weikaiyu
 * @date 2023/1/31 11:30
 */
public interface ReportService {
    List<ReportMoneyRes> list(ReportMoneyVo reportMoneyVo) ;
}
