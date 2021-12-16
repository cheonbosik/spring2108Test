<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>nav.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
</head>
<body>
<div style="width:100%; background-color:yellow; text-align:center;">
  <a href="${ctp}/tiles/tilesMain">홈으로</a> |
  <a href="${ctp}/tiles/guest/guestList">방명록</a> |
  <a href="${ctp}/tiles/board/boardList">게시판</a> |
  <a href="${ctp}/tiles/pds/pdsList">자료실</a> |
  <c:if test="${sLevel == 0}"><a href="${ctp}/tiles/admin/adminList">관리자</a> |</c:if>
  <a href="${ctp}/tiles/login">로그아웃</a>
</div>
</body>
</html>