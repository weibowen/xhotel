package com.hotel.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.SystemMapper;
import com.hotel.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {
	@Autowired
	SystemMapper systemMapper;

	@Override
	public Date getDbDate() {
		// TODO Auto-generated method stub
		return systemMapper.selectNow();
	}

}
