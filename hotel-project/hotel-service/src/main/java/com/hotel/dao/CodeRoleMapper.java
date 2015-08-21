package com.hotel.dao;

import com.hotel.po.CodeRole;
import com.hotel.po.CodeRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeRoleMapper {
    int countByExample(CodeRoleExample example);

    int deleteByExample(CodeRoleExample example);

    int deleteByPrimaryKey(String roleCode);

    int insert(CodeRole record);

    int insertSelective(CodeRole record);

    List<CodeRole> selectByExample(CodeRoleExample example);

    CodeRole selectByPrimaryKey(String roleCode);

    int updateByExampleSelective(@Param("record") CodeRole record, @Param("example") CodeRoleExample example);

    int updateByExample(@Param("record") CodeRole record, @Param("example") CodeRoleExample example);

    int updateByPrimaryKeySelective(CodeRole record);

    int updateByPrimaryKey(CodeRole record);
}