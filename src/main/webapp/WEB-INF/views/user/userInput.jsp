<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>userInput.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
  <script>
    function fCheck() {
    	var name = document.getElementById("name").value;
    	var pwd = document.getElementById("pwd").value;
    	
    	if(name == "") {
    		alert("이름을 입력하세요!");
    		name.focus();
    	}
    	else if(pwd == "") {
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
    <h2>User 등록</h2>
    <table class="table table-bordered">
      <tr>
        <th>성명</th>
        <td><input type="text" name="name" id="name" class="form-control" autofocus /></td>
      </tr>
      <tr>
        <th>비밀번호</th>
        <td><input type=password" name="pwd" id="pwd" class="form-control"/></td>
      </tr>
      <tr>
        <th>나이</th>
        <td><input type="number" name="age" value="20" min="1" class="form-control"/></td>
      </tr>
      <tr>
        <td colspan="2" class="text-center">
          <input type="button" value="등록하기" onclick="fCheck()" class="btn btn-secondary"/>
          <input type="reset" value="다시입력" class="btn btn-secondary"/>
          <input type="button" value="돌아가기" onclick="history.back()" class="btn btn-secondary"/>
        </td>
      </tr>
    </table>
  </form>
</div>
<br/>
</body>
</html>