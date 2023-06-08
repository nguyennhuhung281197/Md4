<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary</h1>
<form action="/search" method="post">
    <%--@declare id="word"--%><label for="word">Word:</label>
    <input type="text" name="word" required><br>
    <input type="submit" value="Search">
</form>
<h2>${result}</h2>
</body>
</html>
