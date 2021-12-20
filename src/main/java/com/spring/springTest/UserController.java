package com.spring.springTest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.service.UserService;
import com.spring.springTest.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	String msgFlag = "";
	
	@Autowired
	UserService userService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping(value="/userList")
	public String userListGet(Model model) {
		List<UserVO> vos = userService.getUserList();
		model.addAttribute("vos", vos);
		
		return "user/userList";
	}
	
	@RequestMapping(value="/userInput", method = RequestMethod.GET)
	public String userInputGet() {
		return "user/userInput";
	}
	
	@RequestMapping(value="/userInput", method = RequestMethod.POST)
	public String userInputPost(UserVO vo) {
//		String pwd = bCryptPasswordEncoder.encode("1234");
//		System.out.println("1.pwd : " + pwd);
		
		/*
		String pwd = vo.getPwd();
		pwd = bCryptPasswordEncoder.encode(pwd);
		vo.setPwd(pwd);
		*/
		vo.setPwd(bCryptPasswordEncoder.encode(vo.getPwd()));
		
		userService.setUserInput(vo);
		
		//return "redirect:/user/userList";
		return "redirect:/msg/userInputOk";
	}
	
	@RequestMapping("/userDelete")
	public String userDeleteGet(int idx) {
		userService.setUserDelete(idx);
		
		//return "redirect:/user/userList";
		return "redirect:/msg/userDeleteOk";
	}
	
	@RequestMapping(value="/userPwdCheck", method = RequestMethod.GET)
	public String userPwdCheckGet(Model model, int idx) {
		model.addAttribute("idx", idx);
		
		return "user/userPwdCheck";
	}
	
	@RequestMapping(value="/userPwdCheck", method = RequestMethod.POST)
	public String userPwdCheckPost(UserVO vo, HttpSession session) {
		int idx = vo.getIdx();
		String pwd = vo.getPwd();
		session.setAttribute("sPwd", pwd);
		
		String dbPwd = userService.getUserPwdSearch(idx);
		
		if(vo != null && bCryptPasswordEncoder.matches(pwd, dbPwd)) {
			System.out.println("비밀번호가 맞습니다.");
			return "redirect:/user/userUpdate?idx="+idx;
		}
		else {
			System.out.println("비밀번호가 틀립니다.");
			//return "redirect:/user/userPwdCheck?idx="+idx;
			msgFlag = "userPwdCheckNo$idx="+idx;
			
			return "redirect:/msg/" + msgFlag;
		}
	}
	
	@RequestMapping(value="/userUpdate", method = RequestMethod.GET)
	public String userUpdateGet(int idx, HttpSession session, UserVO vo, Model model) {
		vo = userService.setUserUpdate(idx);
		String pwd = (String) session.getAttribute("sPwd");
		vo.setPwd(pwd);
		//session.removeAttribute("sPwd");
		model.addAttribute("vo", vo);
		
		return "user/userUpdate";
	}
	
	
	@RequestMapping(value="/userUpdate", method = RequestMethod.POST)
	public String userUpdatePost(UserVO vo) {
		System.out.println("idx(컨트롤러) : " + vo.getIdx());
		
		vo.setPwd(bCryptPasswordEncoder.encode(vo.getPwd()));
		userService.setUserUpdateOk(vo);
		
		//return "user/userUpdate";
		//return "redirect:/msg/userUpdateOk";
		//return "redirect:/msg/?msgFlag=userUpdateOk&idx="+vo.getIdx();
		
		msgFlag = "userUpdateOk$idx="+vo.getIdx();
		
		return "redirect:/msg/" + msgFlag;
	}
	
	@RequestMapping("/userSearch")
	public String userSearchGet(Model model, String name) {
		List<UserVO> vos = userService.getUserSearch(name);
		model.addAttribute("vos", vos);
		
		return "user/userList";
	}
}
