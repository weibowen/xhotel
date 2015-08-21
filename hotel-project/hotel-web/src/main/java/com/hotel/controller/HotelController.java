package com.hotel.controller;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotel.service.StaffService;
import com.hotel.service.SystemService;

@Controller
@RequestMapping("/")
public class HotelController {
	private static final Logger LOG = LoggerFactory
			.getLogger(HotelController.class);
	@Resource
	private StaffService staffService;
	@Resource
	private SystemService systemService;

	@RequestMapping("index.do")
	public String index() {
		LOG.debug("=======================");
		return "WEB-INF/index.jsp";
	}

	@RequestMapping("json.do")
	public @ResponseBody
	Map<String, String> json() {
		LOG.debug(systemService.getDbDate().toString());
		LOG.debug("=======================");
		return null;
	}

	@RequestMapping("getDBDate.do")
	public @ResponseBody
	String getDBDate() throws InterruptedException {
		Thread.sleep(2000);
		java.text.DateFormat format1 = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		return format1.format(systemService.getDbDate());
	}

	@RequestMapping("menu.do")
	public @ResponseBody
	Map<String, Object> menu(
			@RequestParam(value = "node", required = true) String nodeId) {
		long id;
		if ("root".equals(nodeId)) {
			id = 0;
		} else {
			id = Long.valueOf(nodeId);
		}
		return staffService.queryStaffMenu(1, id);
	}

}
