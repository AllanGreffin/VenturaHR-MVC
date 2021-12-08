<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>VenturaHR</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
    </head>
    <body>
        <h1>VenturaHR - Logar no Site</h1>
        <form action="login" method="post">
            <table border="1" cellpadding="10" cellspacing="0">
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email" size="30" maxLenght="30"/></td>
                </tr>
                <tr>
                    <td>Senha:</td>
                    <td><input type="text" name="senha" size="10" maxLenght="10"/></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Login"/>
                        <input type="button" value="Criar Conta" onclick="location.href='usuarui/manter.jsp'"/>
                    </td>
                </tr>
            </table>
        </form>
        <h4 style="color: red">${erro}</h4>
    </body>
</html>
