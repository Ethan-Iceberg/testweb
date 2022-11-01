package com.company.testweb.LoginMgt.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoginDAO {

	public List<Map<String, Object>> selectMember(HashMap<String, String> map) throws Exception;
}
