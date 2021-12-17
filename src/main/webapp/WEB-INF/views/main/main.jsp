<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>main.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
</head>
<body>
<p><br/></p>
<h2>길동이네 집.....</h2>
<hr/>
<p>
  <a href="${ctp}/tiles/login" class="btn btn-secondary">로그인</a> &nbsp;
  <a href="${ctp}/user/userList" class="btn btn-secondary">User리스트</a>
</p>
</body>
</html>