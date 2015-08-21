package com.hotel.dao;

import com.hotel.po.CodeList;
import com.hotel.po.CodeListExample;
import com.hotel.po.CodeListKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CodeListMapper {
    int countByExample(CodeListExample example);

    int deleteByExample(CodeListExample example);

    int deleteByPrimaryKey(CodeListKey key);

    int insert(CodeList record);

    int insertSelective(CodeList record);

    List<CodeList> selectByExample(CodeListExample example);

    CodeList selectByPrimaryKey(CodeListKey key);

    int updateByExampleSelective(@Param("record") CodeList record, @Param("example") CodeListExample example);

    int updateByExample(@Param("record") CodeList record, @Param("example") CodeListExample example);

    int updateByPrimaryKeySelective(CodeList record);

    int updateByPrimaryKey(CodeList record);

	List<CodeList> selectByTypeCode(String typeCode);
}