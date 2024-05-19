<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transferencias</title>
</head>
<body>
    <h2>Generar Transferencia</h2>
    <form action="TransferenciaServlet" method="post">
        <label for="rutCliente">RUT Cliente:</label>
        <input type="text" id="rutCliente" name="rutCliente"><br><br>
        <label for="monto">Monto:</label>
        <input type="text" id="monto" name="monto"><br><br>
        <input type="submit" value="Transferir">
    </form>
</body>
</html>