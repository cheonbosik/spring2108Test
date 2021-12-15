<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test3.jsp(url경로 : /1215/test3)</title>
</head>
<body>
<h2>이곳은 /WEB-INF/views/1215/test3.jsp</h2>
<p>주소창에 'contextPath명'/1215/test3 로 접속하였을때.!.!.</p>
<p>
  성명 : ${name}<br/>
  나이 : ${age}<br/>
  주소 : ${address}<br/>
</p>
</body>
</html>