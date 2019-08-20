<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
<p>Welcome to the todos page</p>
<Ol>
<c:forEach items="${todos}" var="todo">
	<li>${todo.name}</li>
</c:forEach>
</Ol>

</body>
</html>