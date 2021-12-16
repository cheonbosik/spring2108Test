package com.spring.springTest;

import java.security.SecureRandom;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import t1215.Test6VO;
import t1215.TestVO;

@Controller
@RequestMapping("/1215")
public class T1215Controller {
	
	//@RequestMapping("/test1")
	//@RequestMapping({"/test1","/t1"})
	@RequestMapping(value={"/test1","/t1"}, method=RequestMethod.GET)
	public String test1Get() {
		//String url = "1215/test1";
		//return url;		// 화면에 보여줄 jsp파일의 경로와 파일명
		return "1215/test1";
	}
	
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String test2Get() {
		return "1215/test2";
	}
	
	@RequestMapping(value="/test3", method = RequestMethod.GET)
	public String test3Get(HttpServletRequest request) {
		
		request.setAttribute("name", "홍길동");
		request.setAttribute("age", 25);
		request.setAttribute("address", "서울시 강남구 논현동");
		
		return "1215/test3";
	}
	
	@RequestMapping(value="/test31", method = RequestMethod.GET)
	public String test31Get(Model model) {
		
		model.addAttribute("name", "홍길동 31");
		model.addAttribute("age", 25);
		model.addAttribute("address", "서울시 강남구 논현동 31");
		
		return "1215/test3";
	}
	
	@RequestMapping(value="/test32", method = RequestMethod.GET)
	public String test32Get(HttpSession session) {
		
		session.setAttribute("name", "홍길동 32");
		session.setAttribute("age", 25);
		session.setAttribute("address", "서울시 강남구 논현동 32");
		
		return "1215/test3";
	}
	
	@RequestMapping(value="/test33", method = RequestMethod.GET)
	public String test33Get(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		String address = request.getParameter("addess");
		String name = request.getParameter("name")==null ? "없음" : request.getParameter("name");
		int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address")==null ? "미기재" : request.getParameter("address");
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("address", address);
		
		return "1215/test3";
	}
	
	@RequestMapping(value="/test34", method = RequestMethod.GET)
	public String test34Get(HttpServletRequest request, Model model) {
		String name = request.getParameter("name")==null ? "없음" : request.getParameter("name");
		int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address")==null ? "미기재" : request.getParameter("address");
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		
		return "1215/test3";
	}
	
	@RequestMapping(value="/test35", method = RequestMethod.GET)
	public String test35Get(HttpServletRequest request, Model model, String name, String age, String address) {
//	public String test35Get(Model model, String name2, String age2, String address2) {
		
		request.setAttribute("name", name);
//		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		
		return "1215/test3";
	}
	
	@RequestMapping(value="/test4/{mid}")
	public String test4Get(HttpServletRequest request, @PathVariable String mid, String pwd) {
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		return "1215/test4";
	}
	
	@RequestMapping(value="/test41/{mid}/{pwd}")
	public String test41Get(HttpServletRequest request, @PathVariable String mid, @PathVariable String pwd) {
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		return "1215/test4";
	}
	
	@RequestMapping(value="/test42/{mid}/{pwd}")
	public String test42Get(HttpServletRequest request, @PathVariable String mid, @PathVariable String pwd) {
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		
		if(mid.equals("admin") && pwd.equals("1234")) {
			return "1215/test4Ok";
		}
		else {
			return "1215/test4No";
		}
	}
	
//	@RequestMapping(value="/{mid}/test43/{pwd}")
	@RequestMapping(value="/{pwd}/test43/{mid}")
	public String test43Get(HttpServletRequest request, @PathVariable String mid, @PathVariable String pwd) {
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		
		if(mid.equals("admin") && pwd.equals("1234")) {
			return "1215/test4Ok";
		}
		else {
			return "1215/test4No";
		}
	}
	
	@RequestMapping(value="/test44/{mid}/{pwd}")
	public String test44Get(HttpServletRequest request, @PathVariable String mid, @PathVariable String pwd) {
		// 난수를 발생시켜서 접속자에게 먼저 보내준후, 그 번호로 접속할 수 있도록 유도한다.
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.setSeed(new Date().getTime());
		int secureNum = secureRandom.nextInt(100) + 1;  // 1~100사이의 난수 발생..
		// 앞에서 발생된 난수값을 user에 전송후 접속할 수 있도록 처리한다.
		System.out.println("생성된 비번 : " + secureNum);
		System.out.println("----------------------");
		
		//String secureStr = secureNum + "";
		//String secureStr = Integer.toString(secureNum);
		String secureStr = "1215";
		
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		
		if(mid.equals("admin") && pwd.equals(secureStr)) {
			return "1215/test4Ok";
		}
		else {
			return "1215/test4No";
		}
	}
	
	@RequestMapping("/test5")
	public String test5Get() {
		return "1215/test5";
	}
	
	@RequestMapping("/test5Ok")
	public String test5OkGet(HttpServletRequest request, String mid, String pwd) {
		
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		
		return "1215/test5Ok";
	}
	
	@RequestMapping("/test51Ok")
	public String test51OkGet(HttpServletRequest request, 
			@RequestParam("mid") String memberId, 
			@RequestParam("pwd") String password) {
		
		request.setAttribute("mid", memberId);
		request.setAttribute("pwd", password);
		
		return "1215/test5Ok";
	}
	
	@RequestMapping("/test52Ok")
	public String test52OkGet(HttpServletRequest request, 
			@RequestParam("mid") String memberId, 
			@RequestParam("pwd") String password) {
		
		request.setAttribute("mid", memberId);
		request.setAttribute("pwd", password);
		
		return "1215/test5Ok";
	}
	
	@RequestMapping("/test6")
	public String test6Get() {
		return "1215/test6";
	}
	
	@RequestMapping("/test6Ok")
	public String test6OkGet(HttpServletRequest request, 
			@RequestParam("mid1") String mid1, 
			@RequestParam("mid2") String mid2, 
			@RequestParam("mid3") String mid3, 
			@RequestParam("mid4") String mid4, 
			@RequestParam("mid5") String mid5, 
			@RequestParam("pwd") String pwd) {
		
		request.setAttribute("mid1", mid1);
		request.setAttribute("mid2", mid2);
		request.setAttribute("mid3", mid3);
		request.setAttribute("mid4", mid4);
		request.setAttribute("mid5", mid5);
		request.setAttribute("pwd", pwd);
		
		return "1215/test6Ok";
	}
	
	@RequestMapping("/test61Ok")
	public String test61OkGet(HttpServletRequest request, 
			String mid1, 
			String mid2, 
			String mid3, 
			String mid4, 
			String mid5, 
			String pwd) {
		
		request.setAttribute("mid1", mid1);
		request.setAttribute("mid2", mid2);
		request.setAttribute("mid3", mid3);
		request.setAttribute("mid4", mid4);
		request.setAttribute("mid5", mid5);
		request.setAttribute("pwd", pwd);
		
		return "1215/test6Ok";
	}
	
	@RequestMapping("/test62Ok")
	public String test62OkGet(HttpServletRequest request, 
			String mid1, 
			String mid2, 
			String mid3, 
			String mid4, 
			String mid5, 
			String pwd) {
		
		Test6VO vo = new Test6VO();
		vo.setMid1(mid1);
		vo.setMid2(mid2);
		vo.setMid3(mid3);
		vo.setMid4(mid4);
		vo.setMid5(mid5);
		vo.setPwd(pwd);
		
		request.setAttribute("vo", vo);
		return "1215/test6Ok";
	}
	
	@RequestMapping("/test63Ok")
	public String test63OkGet(Model model, Test6VO vo) {
		model.addAttribute("vo", vo);
		return "1215/test6Ok";
	}
	
	@RequestMapping("/test64Ok")
	public String test64OkGet(Model model, Test6VO vo) {
		vo.setImsiId("임시아이디입니다.");
		model.addAttribute("vo", vo);
		
		String imsi = "임시연습입니다.";
		model.addAttribute("imsi", imsi);
		
		return "1215/test6Ok";
	}
	
	// ModelAndView()
	@RequestMapping("/test7")
	public ModelAndView test7Get() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("1215/test7");
		
		return mv;
	}
	
	@RequestMapping("/test7Ok")
	public ModelAndView test7OkGet(ModelAndView mv,
			@RequestParam("mid") String mid,
			String pwd) {
		mv.addObject("mid", mid);
		mv.addObject("pwd", pwd);
		
		mv.setViewName("1215/test7Ok");
		return mv;
	}
	
	@RequestMapping("/test8")
	public ModelAndView test8Get() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("1215/test8");
		
		return mv;
	}
	
	@RequestMapping("/test8Ok")
	public String test8OkGet(Model model, TestVO vo) {
		model.addAttribute("vo", vo);
		
		return "1215/test8Ok";
	}
	
	@RequestMapping("/test9")
	public String test9Get(Model model, TestVO vo) {
		model.addAttribute("vo", vo);
		
		return "1215/test9";
	}
	
	@RequestMapping(value="/test9", method = RequestMethod.POST)
	public String test9Post(Model model, TestVO vo) {
		model.addAttribute("vo", vo);
		return "1215/test9Ok";
	}
	
	@RequestMapping(value="/test10", method=RequestMethod.GET)
	public String test10Get(Model model, String flag) {
		if(flag!=null && flag.equals("NO"))	model.addAttribute("flag", "정보를 확인하세요");
		return "1215/test10";
	}
	
	@RequestMapping(value="/test10", method=RequestMethod.POST)
	public String test10Post(Model model, TestVO vo) {
		model.addAttribute("vo", vo);
		
		if(vo.getMid().equals("admin") && vo.getPwd().equals("1234")) {
			return "1215/test10Ok";
		}
		else {
			//return "1215/test10";
			return "redirect:/1215/test10?flag=NO";
		}
	}
	
	@RequestMapping(value="/test11", method=RequestMethod.GET)
	public String test11Get() {
		return "1215/test11";
	}
	
	@RequestMapping(value="/test11", method=RequestMethod.POST)
	public String test11Post(Model model,
			@RequestParam(name="mid", defaultValue = "abcd", required=false) String mid,
			@RequestParam(name="pwd", defaultValue="1234",  required=false) String pwd,
		  @RequestParam(name="pag", defaultValue="1",  required=false) int pag) {
		
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		
		return "1215/test11Ok";
	}
}
