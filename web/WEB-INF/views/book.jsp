<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<%@ page session="false" %>
<html>
<head>
	<title>book</title>
</head>
<body>

<spring:form modelAttribute="book">
    <spring:label path="title">Title:</spring:label><spring:input path="title"></spring:input>
    <spring:label path="isbn">ISBN:</spring:label><spring:input path="isbn"></spring:input>
    <spring:label path="content">Content:</spring:label><spring:input path="content"></spring:input>
    <input type="submit" value="Add"/>
</spring:form>

<h3>Books</h3>
<c:forEach items="${books}" var="book">
  <li><c:out value="${book.title}"/></li>
</c:forEach>

</body>
</html>
