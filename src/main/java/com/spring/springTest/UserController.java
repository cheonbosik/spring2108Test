package com.spring.springTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.service.UserService;
import com.spring.springTest.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
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
		userService.setUserInput(vo);
		
		return "redirect:/user/userList";
	}
	
	@RequestMapping("/userDelete")
	public String userDeleteGet(int idx) {
		userService.setUserDelete(idx);
		
		return "redirect:/user/userList";
	}
	
	@RequestMapping(value="/userUpdate", method = RequestMethod.GET)
	public String userUpdateGet(Model model, int idx) {
		UserVO vo = userService.setUserUpdate(idx);
		model.addAttribute("vo", vo);
		
		return "user/userUpdate";
	}
	
	@RequestMapping(value="/userUpdate", method = RequestMethod.POST)
	public String userUpdatePost(UserVO vo) {
		userService.setUserUpdateOk(vo);
		
		return "redirect:/user/userList";
	}
	
	@RequestMapping("/userSearch")
	public String userSearchGet(Model model, String name) {
		List<UserVO> vos = userService.getUserSearch(name);
		model.addAttribute("vos", vos);
		
		return "user/userList";
	}
}
