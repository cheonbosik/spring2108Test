<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test4No.jsp(url경로 : /1215/test4)</title>
</head>
<body>
<h2>이곳은 /WEB-INF/views/1215/test4.jsp</h2>
<p>주소창에 'contextPath명'/1215/test4 로 접속하였을때.!.!.</p>
<p>
  <h2>관리자 인증 실패.....ㅜㅜ....</h2>
  아이디 : ${mid}<br/>
  비밀번호 : ${pwd}<br/>
</p>
</body>
</html>