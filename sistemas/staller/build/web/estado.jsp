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
        <h1>Estado del Auto!</h1>
        <form name="frmmestado" action="estadoR.jsp">
           Estados: <input type="text" name="txtestado" value="" size="20" maxlength="20" required="true" />
            <input type="submit" value="Guardar" name="btnestado" />   
        </form>
    </body>
</html>
