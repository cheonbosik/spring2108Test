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
  <h2>회원 메인 화면</h2>
  <hr/>
  <p>아이디 : ${sMid} / ${mid}</p>
  <p>별명 : ${sNickName}</p>
  <c:if test="${sLevel == 0}"><c:set var="strLevel" value="관리자"/></c:if>
  <c:if test="${sLevel == 1}"><c:set var="strLevel" value="특별회원"/></c:if>
  <c:if test="${sLevel == 2}"><c:set var="strLevel" value="우수회원"/></c:if>
  <c:if test="${sLevel == 3}"><c:set var="strLevel" value="정회원"/></c:if>
  <c:if test="${sLevel == 4}"><c:set var="strLevel" value="준회원"/></c:if>
  <p>레벨 : ${strLevel}</p>
  <hr/>
  <pre>
    - 비회원(99)은 서비스 사용 금지
    - 준회원(4)은   '방명록'까지만 사용
    - 정회원(3)은   '방명록+게시판' 사용
    - 우수회원(2)/특별회원(1)은 '방명록+게시판+자료실' 사용
    - 관리자(0)는 모든 서비스와 '관리자'메뉴 사용
  </pre>
  <hr/>
  <p><img src="${ctp}/images/dog5.jpg" width="300px"/></p>
  <hr/>
</div>
</body>
</html>