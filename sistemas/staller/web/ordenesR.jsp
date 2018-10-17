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
        <title></title>
    </head>
    <body>
        <h1></h1>
    
     <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
     
     <%
            
        
try
{   
String linea = request.getParameter("txtlinea");
String modelo = request.getParameter("txtmodelo");
String placa = request.getParameter("txtolacas");
String color = request.getParameter("txtcolor");
String observaciones = request.getParameter("txtobservaciones");

String campomarca = request.getParameter("txtmarca");
String camptransimision = request.getParameter("txttransmision");
String campoempleado = request.getParameter("txtcliente");





 int filas = datos.insertarVehiculos(linea,modelo,placa,color,observaciones,campomarca,camptransimision,campoempleado);
        //nombres, apellidos, telefono, correo, nit, 
      //   direccion, tipocliente
  
    

 if (filas ==1 )
        {
  //  %>
         
    <script>alert("Informacion Almacenada" );
     
    window.location.href='vehiculo.jsp';

     </script> 
     <%
         
 }//if filas                   
  else 
           {%>
     <script>alert("Empleado ya Existe");
     
    window.location.href='vehiculo.jsp';

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
