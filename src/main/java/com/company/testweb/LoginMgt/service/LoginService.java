package com.company.testweb.LoginMgt.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoginService {
	
	public List<Map<String, Object>> selectMember(HashMap<String, String> map) throws Exception;
}
