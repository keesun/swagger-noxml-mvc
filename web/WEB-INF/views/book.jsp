<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<%@ page session="false" %>
<html>
<head>
	<title>book</title>
</head>
<body>

<h3>Books</h3>
<c:forEach items="${books}" var="book">
  <li><c:out value="${book.title}"/></li>
</c:forEach>

</body>
</html>
