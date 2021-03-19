<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Accident</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
          integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<%--    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>--%>
</head>
<body>
<div class="container">
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">#</th>
        </tr>
        </thead>
        <tbody>
        <%--@elvariable id="marks" type="java.util.List"--%>
        <c:forEach items="${marks}" var="mark">
            <tr>
                <th>
                    <c:out value="${mark}"/>
                </th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
Hello : Accident
</body>
</html>