package com.hotel.dao;

import com.hotel.po.InfoPay;
import com.hotel.po.InfoPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoPayMapper {
    int countByExample(InfoPayExample example);

    int deleteByExample(InfoPayExample example);

    int deleteByPrimaryKey(Long feeNo);

    int insert(InfoPay record);

    int insertSelective(InfoPay record);

    List<InfoPay> selectByExample(InfoPayExample example);

    InfoPay selectByPrimaryKey(Long feeNo);

    int updateByExampleSelective(@Param("record") InfoPay record, @Param("example") InfoPayExample example);

    int updateByExample(@Param("record") InfoPay record, @Param("example") InfoPayExample example);

    int updateByPrimaryKeySelective(InfoPay record);

    int updateByPrimaryKey(InfoPay record);
}