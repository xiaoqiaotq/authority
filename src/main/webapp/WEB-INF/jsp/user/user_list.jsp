<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<hr/>
	<table border="1" style="width:100%">
		<tr>
			<td align='center'>id</td>
			<td align='center'>username</td>
			<td align='center'>age</td>
			<td align='center'>operation</td>
		</tr>
<c:forEach items="${users }" var="user">
		<tr >
			<td>${user.id }</td>		
			<td>${user.username }</td>		
			<td>${user.age }</td>		
			<td>
				<a href="<c:url value='/user/show_modify/${user.id}' /> ">modify</a>
				&nbsp;&nbsp;
				<a href="<c:url value='/user/del/${user.id}' /> ">del</a>
				&nbsp;&nbsp;
				<a target="role" href="<c:url value='http://www.baidu.com' />  ">assign role</a>
			</td>	
		</tr>
</c:forEach>

		<tr>
			<td>&nbsp;</td>		
			<td>&nbsp;</td>		
			<td>&nbsp;</td>		
			<td><a href="<c:url value='/user/show_add' />">add</a></td>		
		</tr>

	</table>
	<hr/>
	<hr/>
	<iframe name="role"></iframe>
</body>
</html>
