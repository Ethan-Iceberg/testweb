package com.company.testweb.LoginMgt.mapper.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.company.testweb.LoginMgt.mapper.LoginDAO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.company.testweb.LoginMgt.mapper.LoginDAO";
	
	@Override
	public List<Map<String, Object>> selectMember(HashMap<String, String> map) throws Exception {

		return sqlSession.selectList(Namespace+".selectMember",map);
	}

}
