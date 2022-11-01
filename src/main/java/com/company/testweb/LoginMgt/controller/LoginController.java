package com.company.testweb.LoginMgt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.testweb.LoginMgt.service.LoginService;
import com.company.testweb.LoginMgt.vo.LoginVO;
import com.company.testweb.LoginMgt.controller.LoginController;
/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	private LoginService service;
	
	@RequestMapping(value = "/test.do")
	public String home(LoginVO vo,Locale locale, Model model,HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		logger.info("LoginController Call");
		
		HashMap<String,String> map = new HashMap();
		
		map.put("id","admin");
		map.put("pw","tmxkgkwk");
		
		List<Map<String,Object>> memberList = service.selectMember(map);
		
		System.out.println("+++++"+memberList);
		
		model.addAttribute("memberList", memberList);

		return "test";
	}
	
	@RequestMapping(value = "/login.do")
	
	public String login(LoginVO vo,Locale locale, Model model,HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		String id = request.getParameter("username");
		String pw = request.getParameter("password");

		HashMap<String,String> map = new HashMap();
		
		String Result = "";
		int count = 0;
		
		map.put("id",id);
		map.put("pw",pw);
		
		List<Map<String,Object>> memberList = service.selectMember(map);
		
		System.out.println(memberList);
		
		count = memberList.size();
		
		if(count != 0)
		{
			request.getSession().setAttribute("loginInfo",map);
			
			response.sendRedirect("/testweb/admin_main.do");

			return "admin_main";
		}else {
			
			System.out.println("fail");
			
			return "login";
			
		}
		
	}
	
	@RequestMapping(value = "/logout.do")
	public String loginout(LoginVO vo,Locale locale, Model model,HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		request.getSession().invalidate();
		
		 return "redirect:/login.jsp";
	}
	
	@RequestMapping(value ="/admin_main.do")
	public String admin_main(LoginVO vo,Locale locale, Model model,HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		Map<String, String> map = new HashMap();
		
		map.put("id","admin");
		
		List<Map<String,String>> memberList = (List<Map<String,String>>) new ArrayList();
		
		memberList.add(map);
		
		model.addAttribute("memberList", memberList);
		
	    return "admin_main";
	}

	
}