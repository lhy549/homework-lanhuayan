<%@ page import="com.nf.phone.entity.Phone" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<%List<Phone> list = (List<Phone>) request.getAttribute("phones");%>
<body>
<form>
<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>牌子</th>
        <th>价格</th>
        <th>大小</th>
        <th>说明</th>
        <th>发货地</th>
        <th>店名</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="phone" items="${phones}" >
        <tr>
            <td><input name="id" value="${phone.getId()}"/></td>
            <td><input name="brand" value="${phone.getBrand()}"/></td>
            <td><input name="price" value="${phone.getPrice()}"/></td>
            <td><input name="size" value="${phone.getSize()}"/></td>
            <td><input name="info" value="${phone.getInfo()}"/></td>
            <td><input name="address" value="${phone.getAddress()}"/></td>
            <td><input name="store" value="${phone.getStore()}"/></td>
            <td><a href="#">删除</a><a href="#">更新</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</form>
</body>
</html>
