package com.hotel.dao;

import com.hotel.po.InfoOrderHis;
import com.hotel.po.InfoOrderHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoOrderHisMapper {
    int countByExample(InfoOrderHisExample example);

    int deleteByExample(InfoOrderHisExample example);

    int deleteByPrimaryKey(Long orderNo);

    int insert(InfoOrderHis record);

    int insertSelective(InfoOrderHis record);

    List<InfoOrderHis> selectByExample(InfoOrderHisExample example);

    InfoOrderHis selectByPrimaryKey(Long orderNo);

    int updateByExampleSelective(@Param("record") InfoOrderHis record, @Param("example") InfoOrderHisExample example);

    int updateByExample(@Param("record") InfoOrderHis record, @Param("example") InfoOrderHisExample example);

    int updateByPrimaryKeySelective(InfoOrderHis record);

    int updateByPrimaryKey(InfoOrderHis record);
}