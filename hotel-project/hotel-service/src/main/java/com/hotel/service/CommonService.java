package com.hotel.service;

import java.util.List;

import com.hotel.service.vo.Param;

public interface CommonService {
	public List<Param> queryParamByTypeCode(String typeCode);
}
