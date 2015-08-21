package com.hotel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotel.service.CommonService;

@Controller
@RequestMapping("/Common/")
public class CommonController {
	private static final Logger LOG = LoggerFactory
			.getLogger(CommonController.class);
	@Resource
	private CommonService commonService;

	@RequestMapping("queryComboxStore.do")
	public @ResponseBody
	List<com.hotel.service.vo.Param> queryComboxStore(
			@Param(value = "comboxKey") String comboxKey) {
		return commonService.queryParamByTypeCode(comboxKey);
	}

}
