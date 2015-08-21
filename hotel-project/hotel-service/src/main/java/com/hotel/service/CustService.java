package com.hotel.service;

import com.hotel.service.vo.InfoCustVo;

public interface CustService {
	InfoCustVo queryCustByIdTypeIdCode(int idType, String idCode);
}
