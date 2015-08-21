package com.hotel.dao;

import com.hotel.po.CodeParam;
import com.hotel.po.CodeParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeParamMapper {
    int countByExample(CodeParamExample example);

    int deleteByExample(CodeParamExample example);

    int deleteByPrimaryKey(String paramCode);

    int insert(CodeParam record);

    int insertSelective(CodeParam record);

    List<CodeParam> selectByExample(CodeParamExample example);

    CodeParam selectByPrimaryKey(String paramCode);

    int updateByExampleSelective(@Param("record") CodeParam record, @Param("example") CodeParamExample example);

    int updateByExample(@Param("record") CodeParam record, @Param("example") CodeParamExample example);

    int updateByPrimaryKeySelective(CodeParam record);

    int updateByPrimaryKey(CodeParam record);
}