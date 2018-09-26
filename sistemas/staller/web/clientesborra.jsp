<%-- 
    Document   : clientesborra
    Created on : 3/09/2018, 04:16:45 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EliminarCliente</title>
        
      <script language="javascript" type="text/javascript">

jQuery(function(){
$("#txtnombres").autocomplete("regupdate.jsp");
});
</script>  
    </head>
    <body>
        <div>Busqueda de Clientes </div>
        
        <form name="FRMcliente" action="clientesborraR.jsp">
           <br>
           
           Nombre a Borar <input required="true" type="text"  name="txtnombres" value=" " size="70" id="txtnombres" />
       
           
         
        <br><input type="submit" value="Guardar" name="btnenviar" />
            
        </form>
        
        <BR/><a href="index.html">INICIO</a>
        
    </body>
</html>
