package com.spring.springTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springTest.dao.UserDAO;
import com.spring.springTest.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;

	@Override
	public List<UserVO> getUserList() {
		return userDAO.getUserList();
	}

	@Override
	public void setUserInput(UserVO vo) {
		userDAO.setUserInput(vo);
	}

	@Override
	public void setUserDelete(int idx) {
		userDAO.setUserDelete(idx);
	}

	@Override
	public UserVO setUserUpdate(int idx) {
		return userDAO.setUserUpdate(idx);
	}

	@Override
	public void setUserUpdateOk(UserVO vo) {
		userDAO.setUserUpdateOk(vo);
	}

	@Override
	public List<UserVO> getUserSearch(String name) {
		return userDAO.getUserSearch(name);
	}

	@Override
	public String getUserPwdSearch(int idx) {
		return userDAO.getUserPwdSearch(idx);
	}

}
