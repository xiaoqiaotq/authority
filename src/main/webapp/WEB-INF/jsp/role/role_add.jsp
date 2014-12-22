<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>new role</h2>
<form action="<c:url value='/role/save' />" method="post">
   roleName:<input type="text"  name="roleName"  /><br/>
   roleDesc:<input type="text" name="roleDesc" /><br/>
   <input type="submit" value="add" />
</form>
</body>
</html>
