<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<script type="text/javascript" src="<c:url value='/resources/jquery/1.6/jquery.js' />"></script>
<script >
  $(function(){
	  $("#checkAll").unbind("click");
	  $("#checkAll").bind("click",function(){
		  var checked=this.checked;
		  $("input[name='check']").each(function(){
			  $(this).attr('checked',checked);
		  });
	  });
  });
</script>
<body>
<hr/>
	<table border="1" style="width:100%">
		<tr>
			
			<td align='center'><input type="checkbox" name="checkAll" id="checkAll"></td>
			<td align='center'>id</td>
			<td align='center'>rolename</td>
			<td align='center'>roleDesc</td>
			<td align='center'>operation</td>
		</tr>
<c:forEach items="${roles }" var="role">
		<tr >
			<td align='center'><input type="checkbox" name="check"></td>
			<td>${role.id }</td>		
			<td>${role.roleName }</td>		
			<td>${role.roleDesc }</td>		
			<td>
				<a href="<c:url value='/role/show_modify/${role.id}' /> ">modify</a>
				&nbsp;&nbsp;
				<a href="<c:url value='/role/del/${role.id}' /> ">del</a>
				&nbsp;&nbsp;
				<a target="role" href="<c:url value='http://www.baidu.com' />  ">assign authority</a>
			</td>	
		</tr>
</c:forEach>

		<tr>
			<td>&nbsp;</td>		
			<td>&nbsp;</td>		
			<td>&nbsp;</td>		
			<td>&nbsp;</td>		
			<td><a href="<c:url value='/role/show_add' />">add</a></td>		
		</tr>

	</table>
	<hr/>
	<hr/>
</body>
</html>
