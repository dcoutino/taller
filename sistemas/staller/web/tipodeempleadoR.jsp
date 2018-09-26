<%-- 
    Document   : tipodeempleadoR
    Created on : 22/08/2018, 03:03:56 PM
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
        <h1></h1>
         <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
     <%
     try
{   
   
String descripcion = request.getParameter("txttipodeempleado");

int filas = datos.insertarTipodeEmpleado(descripcion);
     if (filas ==1 )
        {
  //        %>
        <script>alert("Informacion Almacenada" );
     
    window.location.href='tipodeempleado.jsp';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Ha ocurido un error");
     
    window.location.href='tipodeempleado.jsp';

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
