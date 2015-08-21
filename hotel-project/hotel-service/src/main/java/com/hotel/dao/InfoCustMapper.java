package com.hotel.dao;

import com.hotel.po.InfoCust;
import com.hotel.po.InfoCustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoCustMapper {
    int countByExample(InfoCustExample example);

    int deleteByExample(InfoCustExample example);

    int deleteByPrimaryKey(Long custNo);

    int insert(InfoCust record);

    int insertSelective(InfoCust record);

    List<InfoCust> selectByExample(InfoCustExample example);

    InfoCust selectByPrimaryKey(Long custNo);
    InfoCust selectByCustByIdTypeIdCode(@Param("idType")int idType,@Param("idCode")String idCode);

    int updateByExampleSelective(@Param("record") InfoCust record, @Param("example") InfoCustExample example);

    int updateByExample(@Param("record") InfoCust record, @Param("example") InfoCustExample example);

    int updateByPrimaryKeySelective(InfoCust record);

    int updateByPrimaryKey(InfoCust record);
}