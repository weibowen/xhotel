package com.hotel.dao;

import com.hotel.po.InfoStaffBill;
import com.hotel.po.InfoStaffBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoStaffBillMapper {
    int countByExample(InfoStaffBillExample example);

    int deleteByExample(InfoStaffBillExample example);

    int insert(InfoStaffBill record);

    int insertSelective(InfoStaffBill record);

    List<InfoStaffBill> selectByExample(InfoStaffBillExample example);

    int updateByExampleSelective(@Param("record") InfoStaffBill record, @Param("example") InfoStaffBillExample example);

    int updateByExample(@Param("record") InfoStaffBill record, @Param("example") InfoStaffBillExample example);
}