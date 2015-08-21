package com.hotel.dao;

import com.hotel.po.InfoStaff;
import com.hotel.po.InfoStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoStaffMapper {
    int countByExample(InfoStaffExample example);

    int deleteByExample(InfoStaffExample example);

    int deleteByPrimaryKey(Long staffId);

    int insert(InfoStaff record);

    int insertSelective(InfoStaff record);

    List<InfoStaff> selectByExample(InfoStaffExample example);

    InfoStaff selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") InfoStaff record, @Param("example") InfoStaffExample example);

    int updateByExample(@Param("record") InfoStaff record, @Param("example") InfoStaffExample example);

    int updateByPrimaryKeySelective(InfoStaff record);

    int updateByPrimaryKey(InfoStaff record);
}