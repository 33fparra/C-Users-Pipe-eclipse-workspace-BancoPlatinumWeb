<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inicio de sesi�n</title>
</head>
<body>
    <h2>Inicio de sesi�n</h2>
    <form action="LoginServlet" method="post">
        <label for="username">Nombre de usuario:</label>
        <input type="text" id="username" name="username"><br><br>
        <label for="password">Contrase�a:</label>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Ingresar">
    </form>
</body>
</html>