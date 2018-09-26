<%-- 
    Document   : marcaautoR
    Created on : 22/08/2018, 04:43:37 PM
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
String transmision = request.getParameter("txttransmision");


int filas = datos.insertarTransmision(transmision);
     
 if (filas ==1 )
        {
     %>
         
    <script>alert("Informacion Almacenada" );
     
    window.location.href='transmision.jsp';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Ha ocurido un error");
     
    window.location.href='transmision.jsp';

     </script> 
        <% }//else
 
         
}//try                     
      
catch (Exception e)
        {
    out.println("Error  "+ e.getMessage());
    
}//fin catch
        %>
        
    </body>
</html>
