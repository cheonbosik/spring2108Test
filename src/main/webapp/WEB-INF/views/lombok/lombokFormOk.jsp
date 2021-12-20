<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>lombokFormOk.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
</head>
<body>
<p><br></p>
<div class="container">
  <h2>데이터 검증값</h2>
  <p>아이디 : ${vo.mid}</p>
  <p>비밀번호 : ${vo.pwd}</p>
  <p>나이 : ${vo.age}</p>
  <hr/>
  <p>${vo.su1} + ${vo.su2} = ${hap}</p>
  <hr/>
  <p>오늘 날짜는? ${vo.SDate} / <fmt:formatDate value="${vo.SDate}" pattern="yyyy-MM-dd"/> </p>
  <hr/>
  <p><a href="${ctp}/tiles/lombokForm" class="btn btn-secondary">돌아가기</a></p>
</div>
<br/>
</body>
</html>