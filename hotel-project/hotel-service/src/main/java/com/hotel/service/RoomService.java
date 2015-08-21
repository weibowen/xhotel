package com.hotel.service;

import java.util.Map;

import com.hotel.service.vo.CheckinVo;


public interface RoomService {
	Map<String, Object> checkin(CheckinVo checkinVo);
}
