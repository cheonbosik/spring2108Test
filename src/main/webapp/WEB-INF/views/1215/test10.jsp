<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test10.jsp(url경로 : /1215/test10)</title>
</head>
<body>
<h2>이곳은 /WEB-INF/views/1215/test10.jsp</h2>
<p>주소창에 'contextPath명'/1215/test10 로 접속하였을때.!.!.</p>
<form method="post">
	<p>
	  아이디 : <input type="text" name="mid" value="${vo.mid}"/><br/>
	  비밀번호 : <input type="password" name="pwd" value="${vo.pwd}"/><br/>
	  <input type="submit" value="전송"/>
	</p>
	<p>현재상태 : ${flag}</p>
</form>
</body>
</html>
