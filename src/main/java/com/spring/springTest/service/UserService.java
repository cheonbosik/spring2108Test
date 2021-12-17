package com.spring.springTest.service;

import java.util.List;

import com.spring.springTest.vo.UserVO;

public interface UserService {

	public List<UserVO> getUserList();

	public void setUserInput(UserVO vo);

	public void setUserDelete(int idx);

	public UserVO setUserUpdate(int idx);

	public void setUserUpdateOk(UserVO vo);

	public List<UserVO> getUserSearch(String name);

}
