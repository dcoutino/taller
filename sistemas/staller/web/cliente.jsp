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
        <title>Cliente Nuevo</title>
        <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
        <%
            String bd ="tbltipo_cliente";
            ResultSet Rs = datos.mostrarinformacionBD(bd);
        %>
    </head>
    <body>
        <h1>Ingreso de nuevo Cliente!</h1>
        <form id="frmclientesnuevos" name="frmclientesnuevos" action="clienteR.jsp">
            Nombres:<input type="text" name="txtnombres" value="" size="20" />
            Apellidos:<input type="text" name="txtapellidos" value="" size="20" />
            <Br>  <Br>
            Direccion:<input type="text" name="txtdireccion" value="" size="70" />
            Nit:<input type="text" name="txtnit" value="" size="14" />
            Telefono:<input type="text" name="txttelefono" value="" size="17" />
            <Br> <Br>
            Correo Electronico:<input type="text" name="txtmail" value="" size="15" />
            Tipo de Cliente:
             <select required="true" name="cbotipocliente" id="cbotipocliente"  
                     onchange="document.frmclientesnuevos.txttipocliente.value=document.frmclientesnuevos.cbotipocliente.options[frmclientesnuevos.cbotipocliente.selectedIndex].text;">     
                <option> Tipo de cliente</option>
                <%
                    while(Rs.next()){
                        
                  
                %>
                <option value="<%=Rs.getString("Id_Tipo_Cliente")%>"><%=Rs.getString("Descripcion")%> </option>
                <%
                      }//while
                %>
            </select>
             <input id="txttipocliente" type="text" hidden="false"  name="txttipocliente" value="" size="40" />
            <Br>
            <Br>
            
            
            <input type="submit" value="Guardar Informacion" name="btnenviar" />
            
        </form>
        
        <BR/><a href="clientesborra.jsp">Borrar Cliente</a>
        <BR/><a href="clienteactualiza.html">Modificar Cliente</a>
        <BR/><a href="index.html">Inicio</a>
        
    </body>
</html>
