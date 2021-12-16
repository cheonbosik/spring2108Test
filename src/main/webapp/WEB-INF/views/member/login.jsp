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
        <th>레 벨</th>
        <td>
        <!--
          - 비회원(99)은 서비스 사용 금지
          - 준회원(4)은   '방명록'까지만 사용
          - 정회원(3)은   '방명록+게시판' 사용
          - 우수회원(2)/특별회원(1)은 '방명록+게시판+자료실' 사용
          - 관리자(0)는 모든 서비스와 '관리자'메뉴 사용
        -->
          <select name="level" class="form-control">
            <option value="3">정회원</option>
            <option value="2">우수회원</option>
            <option value="1">특별회원</option>
            <option value="0">관리자</option>
            <option value="4">준회원</option>
            <!-- <option value="99">비회원</option> -->
          </select>
        </td>
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