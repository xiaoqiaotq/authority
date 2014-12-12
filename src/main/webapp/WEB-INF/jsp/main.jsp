<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<img  src="http://www.baidu.com"  >
	<form action="" method="post">
		<input name="para1" ><br/>
		<input name="para2"><br/>
		
		<input type="submit" >
	</form>
	
	${user }
	<select name="">
		<c:forEach items="${habits }" var="habit">
			<option>${habit }</option>
		
		</c:forEach>
	</select>
	${habits }
	<%
	Enumeration<String> enumeration=request.getAttributeNames();
	while (enumeration.hasMoreElements()) {
		String string = (String) enumeration.nextElement();
		System.err.println(string+":"+request.getAttribute(string));
	}
	%>
</body>
</html>