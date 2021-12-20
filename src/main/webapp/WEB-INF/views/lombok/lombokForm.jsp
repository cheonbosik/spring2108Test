<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>lombokForm.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"/>
  <script>
    function fCheck() {
    	var mid = document.getElementById("mid").value;
    	var pwd = document.getElementById("pwd").value;
    	
    	/*
    	if(mid == "") {
    		alert("아이디를 입력하세요!");
    		document.getElementById("mid").focus();
    	}
    	else if(pwd == "") {
    		alert("비밀번호를 입력하세요!");
    		document.getElementById("pwd").focus();
    	}
    	else {
    		myform.submit();
    	}
    	*/
    	myform.submit();
    }
  </script>
  <style>
    th {
      text-align: center;
      background-color: #ccc;
    }
  </style>
</head>
<body>
<p><br></p>
<div class="container">
  <form name="myform" method="post">
    <h2>Lombok 연습</h2>
    <table class="table table-bordered">
      <tr>
        <th>아이디</th>
        <td><input type="text" name="mid" id="mid" class="form-control" autofocus /></td>
      </tr>
      <tr>
        <th>비밀번호</th>
        <td><input type=password" name="pwd" id="pwd" class="form-control"/></td>
      </tr>
      <tr>
        <th>나이</th>
        <td><input type="text" name="age" value="20" class="form-control"/></td>
      </tr>
      <tr>
        <th>프로젝트시작일</th>
        <td>
          <c:set var="now" value="<%=new java.util.Date()%>"/>
          <c:set var="sDate"><fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/></c:set>
          <input type="date" name="sDate" value="${sDate}" class="form-control"/>
        </td>
      </tr>
      <tr>
        <td colspan="2" class="text-center">
          <input type="button" value="등록하기" onclick="fCheck()" class="btn btn-secondary"/> &nbsp;
          <input type="reset" value="다시입력" class="btn btn-secondary"/> &nbsp;
          <input type="button" value="돌아가기" onclick="history.back()" class="btn btn-secondary"/>
        </td>
      </tr>
    </table>
    <input type="hidden" name="wDate" value="2021-12-9"/> 
  </form>
</div>
<br/>
</body>
</html>