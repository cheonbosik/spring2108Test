<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>userPwdCheck.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
  <script>
    function fCheck() {
    	var pwd = document.getElementById("pwd").value;
    	
    	if(pwd == "") {
    		alert("비밀번호를 입력하세요!");
    		pwd.focus();
    	}
    	else {
    		myform.submit();
    	}
    }
  </script>
</head>
<body>
<p><br></p>
<div class="container">
  <form name="myform" method="post">
    <h2>User Password 확인</h2>
    <table class="table table-bordered">
      <tr>
        <th>비밀번호</th>
        <td><input type=password" name="pwd" id="pwd" class="form-control"/></td>
      </tr>
      <tr>
        <td colspan="2" class="text-center">
          <input type="button" value="비밀번호확인" onclick="fCheck()" class="btn btn-secondary"/>
          <input type="reset" value="다시입력" class="btn btn-secondary"/>
          <input type="button" value="돌아가기" onclick="location.href='${ctp}/user/userList';" class="btn btn-secondary"/>
        </td>
      </tr>
    </table>
    <input type="hidden" name="idx" value="${vo.idx}"/>
  </form>
</div>
<br/>
</body>
</html>