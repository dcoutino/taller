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
        <h1>Ingreso Serie de Faturas!</h1>
        <form name="frmmseriefacturas" action="facturaserieR.jsp">
           No. de Serie de la Factura <input type="text" name="txtserie" value="" size="10" maxlength="10" required="true" />
           <Br>
           Inicio de Facturas <input type="text" name="txtiniciofacturas" value="" size="7" maxlength="7" required="true" />
           Fin de Facturas <input type="text" name="txtfinfacturas" value="" size="7" maxlength="7" required="true" />
           
            <input type="submit" value="Guardar" name="btnestado" />   
        </form>
    </body>
</html>
