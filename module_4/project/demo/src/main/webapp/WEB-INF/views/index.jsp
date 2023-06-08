<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>USD to VND Conversion</title>
</head>
<body>
<h1>USD to VND Conversion</h1>
<form action="/convert" method="post">
    <%--@declare id="rate"--%><%--@declare id="usd"--%><label for="rate">Exchange Rate:</label>
    <input type="number" name="rate" step="0.01" required><br>
    <label for="usd">USD Amount:</label>
    <input type="number" name="usd" step="0.01" required><br>
    <input type="submit" value="Convert">
</form>
</body>
</html>
