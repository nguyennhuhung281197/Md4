<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/cucalator" method="post">
<input type="number" name="num1">
<input type="number" name="num2">
    <br>
    <br>
    <input type="submit" name="run" value="Addition">
    <input type="submit" name="run" value="Subtraction">
    <input type="submit" name="run" value="Multiplication">
    <input type="submit" name="run" value="Division">
    <br>
    Result : ${result}
    <span style="color: red"> ${index}</span>
</form>
</body>
</html>