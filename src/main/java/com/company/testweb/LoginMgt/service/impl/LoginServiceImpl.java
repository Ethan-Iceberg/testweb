package com.company.testweb.LoginMgt.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.company.testweb.LoginMgt.mapper.LoginDAO;
import com.company.testweb.LoginMgt.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Inject
	private LoginDAO dao;
	
	@Override
	public List<Map<String, Object>> selectMember(HashMap<String, String> map) throws Exception{

		return dao.selectMember(map);
	}

}
