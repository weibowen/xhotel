package com.hotel.dao;

import com.hotel.po.LogLogin;
import com.hotel.po.LogLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogLoginMapper {
    int countByExample(LogLoginExample example);

    int deleteByExample(LogLoginExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(LogLogin record);

    int insertSelective(LogLogin record);

    List<LogLogin> selectByExample(LogLoginExample example);

    LogLogin selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") LogLogin record, @Param("example") LogLoginExample example);

    int updateByExample(@Param("record") LogLogin record, @Param("example") LogLoginExample example);

    int updateByPrimaryKeySelective(LogLogin record);

    int updateByPrimaryKey(LogLogin record);
}