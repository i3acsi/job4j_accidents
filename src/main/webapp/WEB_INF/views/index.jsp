<%@ page contentType="text/html;charset=UTF-8"%>
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
            <th>Title</th>
            <th>Address</th>
            <th>Car Number</th>
            <th>Photo</th>
            <th>Status</th>
            <th>Updated</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%--@elvariable id="accidents" type="java.util.List"--%>
        <%--@elvariable id="accident" type="ru.job4j.accident.dto.AccidentDto"--%>
        <c:forEach items="${accidents}" var="accident">
            <tr>
                <th><c:out value="${accident.id}"/></th>
                <th><c:out value="${accident.title}"/></th>
                <th><c:out value="${accident.address}"/></th>
                <th><c:out value="${accident.carNumber}"/></th>
                <th><c:out value="${accident.photo}"/></th>
                <th><c:out value="${accident.status}"/></th>
                <th><c:out value="${accident.updated}"/></th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="<c:url value='/create'/>">Добавить инцидент</a>
</div>
Hello : Accident
</body>
</html>