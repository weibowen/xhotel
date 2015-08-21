package com.hotel.dao;

import com.hotel.po.RuleRoleMenu;
import com.hotel.po.RuleRoleMenuExample;
import com.hotel.po.RuleRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleRoleMenuMapper {
    int countByExample(RuleRoleMenuExample example);

    int deleteByExample(RuleRoleMenuExample example);

    int deleteByPrimaryKey(RuleRoleMenuKey key);

    int insert(RuleRoleMenu record);

    int insertSelective(RuleRoleMenu record);

    List<RuleRoleMenu> selectByExample(RuleRoleMenuExample example);

    RuleRoleMenu selectByPrimaryKey(RuleRoleMenuKey key);
    List<RuleRoleMenu> selectMenuByStaffIdStatus(RuleRoleMenuKey key);

    int updateByExampleSelective(@Param("record") RuleRoleMenu record, @Param("example") RuleRoleMenuExample example);

    int updateByExample(@Param("record") RuleRoleMenu record, @Param("example") RuleRoleMenuExample example);

    int updateByPrimaryKeySelective(RuleRoleMenu record);

    int updateByPrimaryKey(RuleRoleMenu record);
}