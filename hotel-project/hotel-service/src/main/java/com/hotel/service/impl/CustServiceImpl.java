package com.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.InfoCustMapper;
import com.hotel.po.InfoCust;
import com.hotel.service.CustService;
import com.hotel.service.vo.InfoCustVo;
import com.hotel.util.MyBeanUtils;

@Service
public class CustServiceImpl implements CustService {
	@Autowired
	InfoCustMapper infoCustMapper;

	@Override
	public InfoCustVo queryCustByIdTypeIdCode(int idType, String idCode) {
		// TODO Auto-generated method stub
		InfoCust infoCust = infoCustMapper.selectByCustByIdTypeIdCode(idType,
				idCode);
		return (InfoCustVo) MyBeanUtils.copyProperties4Obj(infoCust,
				InfoCustVo.class);
	}

}
