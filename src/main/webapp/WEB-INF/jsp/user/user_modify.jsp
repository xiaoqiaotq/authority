<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>update user</h2>
<form action="<c:url value='/user/save' />" method="post">
   <input type="hidden" name="id"  value="${user.id} "/><br/>
   name:<input type="text" name="username"  value="${user.username} "/><br/>
   age:<input type="text" name="age"  value="${user.age} "/><br/>
   <input type="submit" value="update" />
</form>


</body>
</html>
