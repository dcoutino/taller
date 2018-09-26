<%-- 
    Document   : tipodepagoR
    Created on : 22/08/2018, 04:12:35 PM
    Author     : dcoutino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
     
     <%
            
        
try
{   
String tipodepago = request.getParameter("txttipodepago");


int filas = datos.insertarTipodePago(tipodepago);
     
 if (filas ==1 )
        {
     %>
         
    <script>alert("Informacion Almacenada" );
     
    window.location.href='tipodepago.jsp';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Ha ocurido un error");
     
    window.location.href='tipodepago.jsp';

     </script> 
        <% }//else
 
         
}//try                     
      
catch (Exception e)
        {
    out.println("Error  "+ e.getMessage());
    
}//fin catch
        %>
        
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
