<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>tilesMain.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
</head>
<body>
<p><br></p>
<div class="container">
  <h2>회원 메일 화면</h2>
  <hr/>
  <p>아이디 : ${sMid} / ${mid}</p>
  <p>별명 : ${sNickName}</p>
  <hr/>
  <p><img src="${ctp}/images/dog5.jpg" width="300px"/></p>
  <hr/>
</div>
</body>
</html>