package com.hotel.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.CodeMenuMapper;
import com.hotel.dao.CodeRoleMapper;
import com.hotel.dao.InfoStaffMapper;
import com.hotel.dao.LogLoginMapper;
import com.hotel.dao.RuleRoleMenuMapper;
import com.hotel.dao.RuleStaffRoleMapper;
import com.hotel.po.CodeMenu;
import com.hotel.po.RuleStaffRoleKey;
import com.hotel.service.StaffService;
import com.hotel.service.vo.Menu;
import com.hotel.util.MyBeanUtils;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	CodeMenuMapper codeMenuMapper;
	@Autowired
	CodeRoleMapper codeRoleMapper;
	@Autowired
	InfoStaffMapper infoStaffMapper;
	@Autowired
	LogLoginMapper loginMapper;
	@Autowired
	RuleRoleMenuMapper ruleRoleMenuMapper;
	@Autowired
	RuleStaffRoleMapper ruleStaffRoleMapper;

	@Override
	public Map<String, Object> queryStaffMenu(long staffId, long parentMenuCode) {
		// TODO Auto-generated method stub
		// 根据id查询员工角色
		List<RuleStaffRoleKey> ruleStaffRoleKeys = ruleStaffRoleMapper
				.selectByStaffId(staffId);
		if (MyBeanUtils.isEmpty(ruleStaffRoleKeys)) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		List<Menu> menus = new ArrayList<>();
		List<CodeMenu> codeMenus = codeMenuMapper
				.selectMenuByStaffIdParentMenuCode(staffId, parentMenuCode);
		for (CodeMenu codeMenu : codeMenus) {
			Menu menu = new Menu();
			menu.setExpanded(true);
			menu.setId(codeMenu.getMenuCode());
			if (codeMenu.getLevel() % 2 == 1) {
				menu.setLeaf(true);
			} else {
				menu.setLeaf(false);
			}
			menu.setText(codeMenu.getMenuName());
			menu.setURL(codeMenu.getUrl());
			menus.add(menu);
		}
		if (menus.size() <= 0) {
			return null;
		}
		map.put("children", menus);
		return map;
	}
}
