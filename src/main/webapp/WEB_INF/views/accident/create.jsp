<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="accidentType" type="ru.job4j.accident.model.AccidentType"--%>
<%--@elvariable id="types" type="java.util.Collection"--%>
<html>
<body>
<form action="<c:url value='/save'/>" method='POST'>
    <table>
        <tr>
            <td>Название:</td>
            <td><input type='text' name='title'></td>
        </tr>
        <tr>
            <td>Описание:</td>
            <td><input type='text' name='description'></td>
        </tr>
        <tr>
            <td>Номер автомобиля:</td>
            <td><input type='text' name='carNumber'></td>
        </tr>
        <tr>
            <td>Адрес:</td>
            <td><input type='text' name='address'></td>
        </tr>
        <tr>
            <td>Фотографии:</td>
            <td><input type='file' name='photos' multiple></td>
        </tr>
        <tr>
            <td>Тип:</td>
            <td>
                <select name="accidentType">
                    <c:forEach var="accidentType" items="${types}">
                            <option value="${accidentType.name()}">${accidentType.name()}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="Сохранить"/></td>
        </tr>
    </table>
</form>
</body>
</html>
