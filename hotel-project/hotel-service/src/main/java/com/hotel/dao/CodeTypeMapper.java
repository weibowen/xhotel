package com.hotel.dao;

import com.hotel.po.CodeType;
import com.hotel.po.CodeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeTypeMapper {
    int countByExample(CodeTypeExample example);

    int deleteByExample(CodeTypeExample example);

    int deleteByPrimaryKey(String typeCode);

    int insert(CodeType record);

    int insertSelective(CodeType record);

    List<CodeType> selectByExample(CodeTypeExample example);

    CodeType selectByPrimaryKey(String typeCode);

    int updateByExampleSelective(@Param("record") CodeType record, @Param("example") CodeTypeExample example);

    int updateByExample(@Param("record") CodeType record, @Param("example") CodeTypeExample example);

    int updateByPrimaryKeySelective(CodeType record);

    int updateByPrimaryKey(CodeType record);
}