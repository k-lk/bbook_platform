package com.wky.book.mapper;

import com.wky.book.domain.BookMoney;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wky.book.domain.vo.BookMoneyQueryReqVo;
import com.wky.book.domain.vo.ReportMoneyVo;
import com.wky.book.domain.vo.UserMoneyStatisticsRequestVo;
import com.wky.book.domain.vo.UserMoneyStatisticsRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 账本记账金额表 Mapper 接口
 * </p>
 *
 * @author wky
 * @since 2022-04-02
 */
public interface BookMoneyMapper extends BaseMapper<BookMoney> {

    /**
     * 用户头像等信息存在是，取代分类头像等信息
     *
     * @param bookMoneyQueryReqVo
     * @return
     */
    List<BookMoney> listMoney(@Param("bookMoneyQueryReqVo") BookMoneyQueryReqVo bookMoneyQueryReqVo);

    List<UserMoneyStatisticsRes> findUserStatistics(@Param("statistics") UserMoneyStatisticsRequestVo userMoneyStatisticsRequestVo);

    List<BookMoney> selectLists(ReportMoneyVo reportMoneyVo);
}
