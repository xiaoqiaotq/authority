<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<img  src="http://www.baidu.com" >
<a>df</a>
<input>
	<form action="" method="post">
		<input name="para1"><br/>
		<input name="para2"><br/>
		
		<input type="submit" >
	</form>
	
	<select name="">
		<c:forEach items="${ habits}" var="aa">
			<option>${aa }</option>
		
		</c:forEach>
	</select>
</body>
</html>