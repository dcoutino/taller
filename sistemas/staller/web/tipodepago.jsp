<%-- 
    Document   : tipodepago
    Created on : 22/08/2018, 04:12:17 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipo de Pago </title>
    </head>
    <body>
        <h1>Ingrese los Tipo de Pago!</h1>
        <form name="frmtipodepago" action="tipodepagoR.jsp">
            Tipo de Pago: <input type="text" name="txttipodepago" value="" size="20" maxlength="20" required="true" />
            <input type="submit" value="Guardar" name="btntipodepago" />
        </form>
    </body>
</html>
