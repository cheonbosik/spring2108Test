package com.spring.springTest;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	
	// 로그인 처리 메소드(GET)
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginGet() {
		return "member/login";
	}
	
	// 로그인 처리 메소드(POST) - 로그인후 메일화면으로 이동
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv,
			HttpSession session,
			String mid, String pwd, String nickName) {
		if(pwd.equals("1234")) {
			session.setAttribute("sMid", mid);
			session.setAttribute("sNickName", nickName);
			
			mv.addObject("mid", mid);
			mv.setViewName("main/tilesMain");
			return mv;
		}
		else {
			System.out.println("로그인 인증 실패~~~~");
			mv.setViewName("member/login");
			return mv;
		}
	}
	
	@RequestMapping("/logout")
	public String logoutGet(HttpSession session) {
//		session.removeAttribute("sMid");
//		session.removeAttribute("sNickName");
		session.invalidate();
		
		return "redirect:/"; 
	}
	
	// 로그인후 메일화면으로 이동
	@RequestMapping(value="/tilesMain", method = RequestMethod.GET)
	public ModelAndView tilesMainGet(ModelAndView mv) {
		mv.setViewName("main/tilesMain");
		return mv;
	}
	
	// 방명록 리스트
	@RequestMapping("/guestList")
	public ModelAndView guestListGet(ModelAndView mv) {
		mv.setViewName("guest/guestList");
		return mv;
	}
	
	// 게시판 리스트
	@RequestMapping("/boardList")
	public ModelAndView boardListGet(ModelAndView mv) {
		mv.setViewName("board/boardList");
		return mv;
	}
	
	// 자료실 리스트
	@RequestMapping("/pdsList")
	public ModelAndView pdsListGet(ModelAndView mv) {
		mv.setViewName("pds/pdsList");
		return mv;
	}
}
