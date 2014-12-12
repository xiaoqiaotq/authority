<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>new user</h2>
<form action="<c:url value='/user/save' />" method="post">
   name:<input type="text"  name="username"  /><br/>
   age:<input type="text" name="age" /><br/>
   <input type="submit" value="add" />
</form>
</body>
</html>
