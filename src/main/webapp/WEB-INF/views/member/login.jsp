<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>login.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
</head>
<body>
<p><br></p>
<div class="container">
  <form method="post">
    <h2>로 그 인</h2>
    <table class="table table-bordered">
      <tr>
        <th>아 이 디</th>
        <td><input type="text" name="mid" class="form-control" autofocus /></td>
      </tr>
      <tr>
        <th>비밀번호</th>
        <td><input type="password" name="pwd" class="form-control"/></td>
      </tr>
      <tr>
        <th>별 명</th>
        <td><input type="text" name="nickName" class="form-control"/></td>
      </tr>
      <tr>
        <td colspan="2" class="text-center">
          <span class="row">
            <span class="col-2"></span>
	          <input type="submit" value="로그인" class="btn btn-secondary col-2"/>
            <span class="col-1"></span>
	          <input type="reset" value="취소" class="btn btn-secondary col-2"/>
            <span class="col-1"></span>
	          <input type="button" value="돌아가기" onclick="location.href='${ctp}/';" class="btn btn-secondary col-2"/>
            <span class="col-2"></span>
          </span>
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>