package com.hotel.dao;

import com.hotel.po.CodeMenu;
import com.hotel.po.CodeMenuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CodeMenuMapper {
	int countByExample(CodeMenuExample example);

	int deleteByExample(CodeMenuExample example);

	int deleteByPrimaryKey(Long menuCode);

	int insert(CodeMenu record);

	int insertSelective(CodeMenu record);

	List<CodeMenu> selectByExample(CodeMenuExample example);

	List<CodeMenu> selectLevel();

	List<CodeMenu> selectByLevel(Integer integer);

	List<CodeMenu> selectMenuByStaffIdParentMenuCode(
			@Param("staffId") long staffId,
			@Param("parentMenuCode") long parentMenuCode);

	CodeMenu selectByPrimaryKey(Long menuCode);

	int updateByExampleSelective(@Param("record") CodeMenu record,
			@Param("example") CodeMenuExample example);

	int updateByExample(@Param("record") CodeMenu record,
			@Param("example") CodeMenuExample example);

	int updateByPrimaryKeySelective(CodeMenu record);

	int updateByPrimaryKey(CodeMenu record);
}