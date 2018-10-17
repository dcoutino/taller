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
String id= request.getParameter("txtidcliente");
String nombres = request.getParameter("txtnombres");
String apellidos = request.getParameter("txtapellidos");
String telefono = request.getParameter("txttelefono");
String correo = request.getParameter("txtmail");
String nit = request.getParameter("txtnit");
String direccion = request.getParameter("txtdireccion");
String tipocliente = request.getParameter("txttipocliente");
String bd="tbltipo_cliente";
String campo ="Descripcion";



 int filas = datos.actualizarCliente(id,nombres,apellidos,telefono,correo,nit,direccion,tipocliente,bd,campo);
        //nombres, apellidos, telefono, correo, nit, 
      //   direccion, tipocliente
  
    

 if (filas ==1 )
        {
  //  %>
         
    <script>alert("Cfliente Actualizada" );
     
    window.location.href='index.html';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Cliente No se actualizo");
     
    window.location.href='clientesactualiza.jsp';

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
