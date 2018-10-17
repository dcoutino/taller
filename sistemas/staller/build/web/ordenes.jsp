<%-- 
    Document   : clientenuevo
    Created on : 9/08/2018, 09:20:03 PM
    Author     : dcoutino
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ordenes</title>
        <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
        <%
            String bd1 ="tblmarca";
            ResultSet Rs1 = datos.mostrarinformacionBD(bd1);
            
            String bd2 ="tbltransmision";
            ResultSet Rs2 = datos.mostrarinformacionBD(bd2);
            
            String bd3 ="tblcliente";
            ResultSet Rs3 = datos.mostrarinformacionBD(bd3);
        %>
   
        
  <link rel="stylesheet" type="text/css" href="style.css" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script src="js/jquery.autocomplete.js"></script>
<script language="javascript" type="text/javascript">      
        
        
        <script language="javascript" type="text/javascript">

jQuery(function(){
$("#txtplacas").autocomplete("busquedasenbds.jsp");
});
</script>
    </head>
    <body>
        <h1>Ingreso Datos de la Orden!</h1>
        <form id="frmordenes" name="frmvehiculo" action="ordenesR.jsp">
            Codigo de Orden<input type="text" name="txtcodigoorden" value="" size="20" />
            Placa del Vehiculo<input type="text" name="txtplacas"  id="txtplacas"  value="" size="14" />
            Nit Cliente<input type="text" name="txtnit" value="" size="14" />
           <Br>  <Br>
            Kilometraje del Vehiculo<input type="text" name="txtkilometraje" value="" size="14" />
            Observaciones<input type="text" name="txtobservaciones" value="" size="50" />
           
            <Br>  <Br>
            Observaciones<input type="text" name="txtobservaciones" value="" size="70" />
             <Br> <Br>
              <select required="true" name="cbomarca" id="cbomarca"  
                     onchange="document.frmvehiculo.txtmarca.value=document.frmvehiculo.cbomarca.options[frmvehiculo.cbomarca.selectedIndex].text;">     
                <option> Marca </option>
                <%
                    while(Rs1.next()){
                %>
                <option value="<%=Rs1.getString("Id_Marca")%>"><%=Rs1.getString("Descripcion")%> </option>
                <%
                      }//while
                %>
            </select>
            
            <select required="true" name="cbotransmision" id="cbotransmision"  
                     onchange="document.frmvehiculo.txttransmision.value=document.frmvehiculo.cbotransmision.options[frmvehiculo.cbotransmision.selectedIndex].text;">     
                <option> Tipo de Transmision</option>
                <%
                    while(Rs2.next()){
                %>
                <option value="<%=Rs2.getString("Id_Transmision")%>"><%=Rs2.getString("Descripcion")%> </option>
                <%
                      }//while
                %>
            </select>
            
            <select required="true" name="cbocliente" id="cbocliente"  
                     onchange="document.frmvehiculo.txtcliente.value=document.frmvehiculo.cbocliente.options[frmvehiculo.cbocliente.selectedIndex].text;">     
                <option> Nit Cliente</option>
                <%
                    while(Rs3.next()){
                %>
                <option value="<%=Rs3.getString("Id_Cliente")%>"><%=Rs3.getString("Nit")%> </option>
                <%
                      }//while
                %>
            </select>
             <input id="txtmarca" type="text" hidden="false"  name="txtmarca" value="" size="40" />
            <input id="txttransmision" type="text" hidden="false"  name="txttransmision" value="" size="40" />
            <input id="txtcliente" type="text" hidden="false"  name="txtcliente" value="" size="40" />
            
             
            
            
            <input type="submit" value="Guardar Informacion" name="btnenviar" />
            
        </form>
        
        <BR/><a href="index2.html">Borrar Empleado</a>
        <BR/><a href="index2.html">Modificar Empleado</a>
        
    </body>
</html>
