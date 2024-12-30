<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List</title>
</head>
<body>
<h1>Data List</h1>
<ul>
    <%--@elvariable id="data" type="java.util.List"--%>
    <c:forEach var="item" items="${data}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>