package com.hotel.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.service.RoomService;
import com.hotel.service.vo.CheckinVo;

@Service
public class RoomServiceImpl implements RoomService {

	@Override
	@Transactional
	public Map<String, Object> checkin(CheckinVo checkinVo) {
		// TODO Auto-generated method stub
		return null;
	}

}
