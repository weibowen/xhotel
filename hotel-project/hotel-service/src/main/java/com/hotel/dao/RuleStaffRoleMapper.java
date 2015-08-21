package com.hotel.dao;

import com.hotel.po.RuleStaffRoleExample;
import com.hotel.po.RuleStaffRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleStaffRoleMapper {
    int countByExample(RuleStaffRoleExample example);

    int deleteByExample(RuleStaffRoleExample example);

    int deleteByPrimaryKey(RuleStaffRoleKey key);

    int insert(RuleStaffRoleKey record);

    int insertSelective(RuleStaffRoleKey record);

    List<RuleStaffRoleKey> selectByExample(RuleStaffRoleExample example);
    List<RuleStaffRoleKey> selectByStaffId(@Param("staffId")long staffId);

    int updateByExampleSelective(@Param("record") RuleStaffRoleKey record, @Param("example") RuleStaffRoleExample example);

    int updateByExample(@Param("record") RuleStaffRoleKey record, @Param("example") RuleStaffRoleExample example);
}