<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List</title>
</head>
<body>
<h1>${dataName} List</h1>
<ul>
    <c:forEach var="item" items="${data}">
        <li>${item}</li>
    </c:forEach>
</ul>
<p><a href="/">Lists</a></p>
</body>
</html>