<%-- 
    Document   : tipocliente
    Created on : 15/08/2018, 04:44:08 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipo de Cliente</title>
    </head>
    <body>
        <h1>Tipos de Cliente</h1>
        <form name="frmtipocliente" action="tipoclienteR.jsp">
            Descripcion<input type="text" name="txtdescripcion" value="" size="75" maxlength ="75" required="true"  />
            <Br>  <Br>
            Descuento<input type="text" name="txtdescuento" value="" size="10" maxlength ="10" required="true"  />
            <Br> <Br>
            <input type="submit" value="Guardar Informacion" name="btnenviar" />
            
        </form>
        
        <BR/><a href="index.html">Borrar Cliente</a>
        <BR/><a href="index.html">Modificar Cliente</a>
        
    </body>
</html>
