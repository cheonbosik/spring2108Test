package com.spring.springTest.vo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class ValidatorVO {
	/*
	  @Digits(integer=, fraction=)  : @숫자(정수, 소수이하자릿수)
	  @Pattern(regex=, flag=)				: 정규식
	  @Past :	과거 날짜이냐?    ,  @Future : 미래 날짜냐?
	  @NotEmpty()  : 넘어온 값이 비지 않았으면 처리...
	  @Size(min=, max=, message=) : @길이체크(최소길이, 최대길이, 메세지)
	  @Range(min=, max=, message=): @범위체크(최소길이, 최대길이, 메세지)
	*/
	
	@NotEmpty(message = "아이디를 입력하세요?")
	@Size(min=4, max=20, message="아이디는 최소 4글자 이상, 20글자 이하로 작성하세요")
	private String mid;
	
	@NotEmpty(message = "비밀번호를 입력하세요?")
	@Size(min=4, max=20, message="비밀번호는 최소 4글자 이상, 20글자 이하로 작성하세요")
	private String pwd;
	
	@Range(min=20, max=99, message="나이는 20~99세까지 가입 가능합니다.")
	private int age;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ValidatorVO [mid=" + mid + ", pwd=" + pwd + ", age=" + age + "]";
	}
}
