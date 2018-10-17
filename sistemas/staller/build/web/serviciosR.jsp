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
String descripcion = request.getParameter("txtdescripcion");
String costo = request.getParameter("txtcosto");
String departamento = request.getParameter("txtdepartamento");
String bd="tbldepartamento";
String campo ="Descripcion";



 int filas = datos.InsertarServicios(descripcion,costo,departamento,bd,campo);
        //nombres, apellidos, telefono, correo, nit, 
      //   direccion, tipocliente
  
    

 if (filas ==1 )
        {
  //  %>
         
    <script>alert("Informacion Almacenada" );
     
    window.location.href='servicios.jsp';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Cliente ya Existe");
     
    window.location.href='cliente.jsp';

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
