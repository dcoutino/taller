<%-- 
    Document   : tipotarjeta
    Created on : 22/08/2018, 04:32:33 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipo de Tajeta</title>
    </head>
    <body>
        <h1>Tipo de Tarjeta!</h1>
        <form name="frmtipotarjeta" action="tipotarjetaR.jsp">
        Tipo de Tarjeta <input type="text" name="txttipodetarjeta" value="" size="20" maxlength="20" required="true" />
            <input type="submit" value="Guardar" name="btntipodetarjeta" />    
        </form>
        
        
    </body>
</html>
