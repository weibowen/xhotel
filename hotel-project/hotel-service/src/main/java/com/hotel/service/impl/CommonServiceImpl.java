package com.hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.CodeListMapper;
import com.hotel.dao.CodeTypeMapper;
import com.hotel.po.CodeList;
import com.hotel.service.CommonService;
import com.hotel.service.vo.Param;

@Service
public class CommonServiceImpl implements CommonService {
	@Autowired
	private CodeListMapper codeListMapper;
	@Autowired
	private CodeTypeMapper codeTypeMapper;


	@Override
	public List<Param> queryParamByTypeCode(String typeCode) {
		if (null == codeTypeMapper.selectByPrimaryKey(typeCode)) {
			return null;
		}
		List<CodeList> codeLists = codeListMapper.selectByTypeCode(typeCode);
		List<Param> params = new ArrayList<>();
		for(CodeList codeList : codeLists){
			Param param = new Param();
			param.setParamCode(codeList.getCodeName());
			param.setParamValue(codeList.getCodeValue());
			params.add(param);
		}
		return params;
	}

}
