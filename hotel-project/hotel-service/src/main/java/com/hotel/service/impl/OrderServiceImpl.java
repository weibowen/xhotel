package com.hotel.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.service.CustService;
import com.hotel.service.OrderService;
import com.hotel.service.vo.CheckinVo;
import com.hotel.service.vo.InfoCustVo;

@Service
public class OrderServiceImpl implements OrderService {
	@Resource
	CustService custService;

	@Override
	@Transactional
	public Map<String, Object> checkin(CheckinVo checkinVo) {
		// TODO Auto-generated method stub
		if (null == checkinVo) {
			return null;
		}
		InfoCustVo infoCustVo = checkinVo.getInfoCustVo();
		if (null == infoCustVo) {
			return null;
		}
		InfoCustVo infoCustVo2 = custService.queryCustByIdTypeIdCode(
				infoCustVo.getIdType(), infoCustVo.getIdCode());
		if(null==infoCustVo2){
			//创建客户
		}else{
			//修改客户
		}
		//房源状态变更
		//创建订单和账户
		//记录操作日志
		return null;
	}

}
