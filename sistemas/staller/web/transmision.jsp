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
        <title>Transmision</title>
    </head>
    <body>
        <h1>tIngreso de Marca de Autos!</h1>
        <form name="frmmarcaautos" action="transmisionR.jsp">
            Transmision del Automovil <input type="text" name="txttransmision" value="" size="40" maxlength="40" required="true" />
            <input type="submit" value="Guardar" name="btnguardar" />   
        </form>
    </body>
</html>
