<%-- 
    Document   : marcaauto
    Created on : 22/08/2018, 04:43:19 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Marcas</title>
    </head>
    <body>
        <h1>tIngreso de Marca de Autos!</h1>
        <form name="frmmarcaautos" action="marcaautoR.jsp">
            Marca del Automovil <input type="text" name="txtmarcaauto" value="" size="20" maxlength="20" required="true" />
            <input type="submit" value="Guardar" name="btnmarcaauto" />   
        </form>
    </body>
</html>
