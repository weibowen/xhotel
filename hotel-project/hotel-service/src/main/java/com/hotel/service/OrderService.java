package com.hotel.service;

import java.util.Map;

import com.hotel.service.vo.CheckinVo;


public interface OrderService {
	Map<String, Object> checkin(CheckinVo checkinVo);
}
