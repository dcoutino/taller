<%-- 
    Document   : clientenuevoR
    Created on : 9/08/2018, 09:20:19 PM
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

  int filas = datos.insertarProcedimiento();

 if (filas ==1 )
        {
  //  %>
         
    <script>alert("Informacion Almacenada" );
     
    window.location.href='clientenuevo.jsp';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Cliente ya Existe");
     
    window.location.href='clientenuevo.jsp';

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
