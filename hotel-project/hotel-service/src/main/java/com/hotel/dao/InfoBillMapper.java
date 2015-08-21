package com.hotel.dao;

import com.hotel.po.InfoBill;
import com.hotel.po.InfoBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoBillMapper {
    int countByExample(InfoBillExample example);

    int deleteByExample(InfoBillExample example);

    int deleteByPrimaryKey(Long billNo);

    int insert(InfoBill record);

    int insertSelective(InfoBill record);

    List<InfoBill> selectByExample(InfoBillExample example);

    InfoBill selectByPrimaryKey(Long billNo);

    int updateByExampleSelective(@Param("record") InfoBill record, @Param("example") InfoBillExample example);

    int updateByExample(@Param("record") InfoBill record, @Param("example") InfoBillExample example);

    int updateByPrimaryKeySelective(InfoBill record);

    int updateByPrimaryKey(InfoBill record);
}