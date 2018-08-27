<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="/update" method="post">
    <div><label>编号：</label><input type="text" name="id"/></div>
    <div><label>品牌：</label><input type="text" name="brand"/></div>
    <div><label>价钱：</label><input type="text" name="price"/></div>
    <div><label>大小：</label><input type="text" name="size"/></div>
    <div><label>说明：</label><input type="text" name="info"/></div>
    <div><label>产地：</label><input type="text" name="address"/></div>
    <div><label>店铺名：</label><input type="text" name="store"/></div>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
