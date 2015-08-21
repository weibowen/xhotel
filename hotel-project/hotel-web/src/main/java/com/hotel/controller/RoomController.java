package com.hotel.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.hotel.service.vo.CheckinVo;

@Controller
@RequestMapping("/Room/")
public class RoomController {
	private static final Logger LOG = LoggerFactory
			.getLogger(RoomController.class);
	@Resource
	private OrderService orderService;

	@RequestMapping("checkin.do")
	public @ResponseBody
	Map<String, Object> checkin(CheckinVo checkinVo) {
		return orderService.checkin(checkinVo);
	}

}
