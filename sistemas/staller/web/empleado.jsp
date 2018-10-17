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
        <title>empleado</title>
        <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
        <%
            String bd ="tbltipo_empleado";
            ResultSet Rs = datos.mostrarinformacionBD(bd);
        %>
    </head>
    <body>
        <h1>Ingreso de nuevo Empleado!</h1>
        <form id="frmempleadosnuevos" name="frmempleadosnuevos" action="empleadoR.jsp">
            Nombres:<input type="text" name="txtnombres" value="" size="20" />
            Apellidos:<input type="text" name="txtapellidos" value="" size="20" />
            Sexo<input type="text" name="txtsexo" value="" size="14" />
            DPI<input type="text" name="txtdpi" value="" size="14" />
            
            <Br>  <Br>
            Direccion:<input type="text" name="txtdireccion" value="" size="70" />
            
            Telefono:<input type="text" name="txttelefono" value="" size="17" />
            <Br> <Br>
            Correo Electronico:<input type="text" name="txtmail" value="" size="15" />
            Tipo de Empleado
             <select required="true" name="cbotipoempleado" id="cbotipoempleado"  
                     onchange="document.frmempleadosnuevos.txttipoempleado.value=document.frmempleadosnuevos.cbotipoempleado.options[frmempleadosnuevos.cbotipoempleado.selectedIndex].text;">     
                <option> Tipo de empleado</option>
                <%
                    while(Rs.next()){
                        
                  
                %>
                <option value="<%=Rs.getString("Id_Tipo_Empleado")%>"><%=Rs.getString("Descripcion")%> </option>
                <%
                      }//while
                %>
            </select>
             <input id="txttipoempleado" type="text" hidden="false"  name="txttipoempleado" value="" size="40" />
            <Br>
            <Br>
            
            
            <input type="submit" value="Guardar Informacion" name="btnenviar" />
            
        </form>
        
        <BR/><a href="index2.html">Borrar Empleado</a>
        <BR/><a href="index2.html">Modificar Empleado</a>
        
    </body>
</html>
