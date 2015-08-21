package com.hotel.dao;

import com.hotel.po.InfoOrder;
import com.hotel.po.InfoOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoOrderMapper {
    int countByExample(InfoOrderExample example);

    int deleteByExample(InfoOrderExample example);

    int deleteByPrimaryKey(Long orderNo);

    int insert(InfoOrder record);

    int insertSelective(InfoOrder record);

    List<InfoOrder> selectByExample(InfoOrderExample example);

    InfoOrder selectByPrimaryKey(Long orderNo);

    int updateByExampleSelective(@Param("record") InfoOrder record, @Param("example") InfoOrderExample example);

    int updateByExample(@Param("record") InfoOrder record, @Param("example") InfoOrderExample example);

    int updateByPrimaryKeySelective(InfoOrder record);

    int updateByPrimaryKey(InfoOrder record);
}