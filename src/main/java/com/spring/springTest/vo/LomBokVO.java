package com.spring.springTest.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

//@Getter
//@Setter
//@ToString
//public class LomBokVO {
public @Data class LomBokVO {
	private String mid;
	private String pwd;
	private int age;
	
	private String op;
	private int su1;
	private int su2;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")  // url에서 입력시에 '2021-1-5'와 같은 형식으로 받는다
	private Date sDate;		// EL표기법으로 호출시는 ${vo.SDate} 로 호출한다.
}
