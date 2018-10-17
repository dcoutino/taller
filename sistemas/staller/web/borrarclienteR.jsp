

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        
       <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
       
        
        
        <%
            
        
try
{   

String nit= request.getParameter("txtnitcliente");



 int filas = datos.eliminarcliente(nit);
 
  
 
 if (filas ==1 )
        {
     %>
         
    <script>alert("Cliente Eliminado");
     
    window.location.href='borrarcliente.html';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Cliente no pudo ser borrado");
     
    window.location.href='borrarcliente.html';

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
