<%-- 
    Document   : tipodeempleado
    Created on : 22/08/2018, 03:03:32 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingreso Tipo de Empleado!</h1>
        
        <form name="frmtipoempleado" action="tipodeempleadoR.jsp">
            Tipo de Empleado: <input type="text" name="txttipodeempleado" value="" size="35" />
            <input type="submit" value="Guardar" name="btnenviar" />
        </form>
    </body>
</html>
