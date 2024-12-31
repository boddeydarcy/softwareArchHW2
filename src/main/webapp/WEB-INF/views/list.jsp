<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List</title>
</head>
<body>
<!--Header takes data name from the model -->
<h1>${dataName} List</h1>
<ul>
    <!--loops through each of the items of the data from the repo's-->
    <c:forEach var="item" items="${data}">
        <li>${item}</li>
    </c:forEach>
</ul>
<p><a href="/">Lists</a></p>
</body>
</html>