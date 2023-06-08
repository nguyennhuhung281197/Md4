<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/save" method="post">
    <h2>Sandwich Condiments</h2>
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    <input type="hidden" name="condiment">
    <input type="submit" value="Save">
</form>
</body>
</html>