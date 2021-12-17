package com.spring.springTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.springTest.vo.UserVO;

public interface UserDAO {

	public List<UserVO> getUserList();

	public void setUserInput(@Param("vo") UserVO vo);

	public void setUserDelete(@Param("idx") int idx);

	public UserVO setUserUpdate(@Param("idx") int idx);

	public void setUserUpdateOk(@Param("vo") UserVO vo);

	public List<UserVO> getUserSearch(@Param("name") String name);

}
