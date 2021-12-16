package com.spring.springTest.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class PdsInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		int level = session.getAttribute("sLevel")==null ? 99 : (Integer) session.getAttribute("sLevel");
		System.out.println("----------------");
		System.out.println("자료실로 들어갑니다. 현재레벨 : " + level);
	  // 자료실은 우수회원(level=2) 이하만 가능하다.(level이 0,1,2)
		if(level > 2) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/tiles/tilesMain");
			dispatcher.forward(request, response);
			System.out.println("'우수회원/특별회원/관리자'만 사용할 수 있습니다.");
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("자료실을 나갑니다.");
		System.out.println("----------------");
	}
}
