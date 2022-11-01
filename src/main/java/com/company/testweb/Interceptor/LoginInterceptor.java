package com.company.testweb.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.company.testweb.LoginMgt.controller.LoginController;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	   @Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	        	logger.info("======================================          START         ======================================");
	        	logger.info(" Request URI \t:  " + request.getRequestURI());
	        	
	        	 try {
	                 if(request.getSession().getAttribute("loginInfo") == null ){
	                         response.sendRedirect("/testweb/login.jsp"); 
	                         return false;
	                 }
	             } catch (Exception e) {
	                 e.printStackTrace();
	             }

	        return super.preHandle(request, response, handler);
	    }
	     
	    @Override
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	        	logger.info("======================================           END          ======================================\n");
	        	logger.info(" Request URI \t:  " + request.getRequestURI());
	    }
}