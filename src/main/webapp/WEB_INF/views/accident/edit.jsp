<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="accident" type="ru.job4j.accident.dto.AccidentDto"--%>

<html>
<body>
<form action="<c:url value='/update'/>" method='POST'>
    <table>
        <tr>
            <td><input type='text' name='id' value="<c:out value="${accident.id}"/>" hidden></td>
        </tr>
        <tr>
            <td>Название:</td>
            <td><input type='text' name='title' value="<c:out value="${accident.title}"/>"></td>
        </tr>
        <tr>
            <td>Описание:</td>
            <td><input type='text' name='description' value="<c:out value="${accident.description}"/>"></td>
        </tr>
        <tr>
            <td>Номер автомобиля:</td>
            <td><input type='text' name='carNumber' value="<c:out value="${accident.carNumber}"/>"></td>
        </tr>
        <tr>
            <td>Адрес:</td>
            <td><input type='text' name='address' value="<c:out value="${accident.address}"/>"></td>
        </tr>
        <tr>
            <td>Фотографии:</td>
            <td><input type='file' name='photos' multiple value="<c:out value="${accident.photos}"/>"></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="Сохранить Изменения"/></td>
        </tr>
    </table>
</form>
</body>
</html>
