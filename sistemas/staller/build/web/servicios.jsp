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
        <title>servicios</title>
        <jsp:useBean id="datos" scope="session"  class="pconexionestaller.cconexionatallerf" />
        <%
            String bd ="tbldepartamento";
            ResultSet Rs = datos.mostrarinformacionBD(bd);
        %>
    </head>
    <body>
        <h1>Ingreso de nuevo Servicio!</h1>
        <form id="frmservicionuevo" name="frmservicionuevo" action="serviciosR.jsp">
            Descripcion<input type="text" name="txtdescripcion" value="" size="30" />
            Costo<input type="text" name="txtcosto" value="" size="20" />
             <Br>  <Br>
             Departamento:
             <select required="true" name="cbodepartamento" id="cbotipocliente"  
                     onchange="document.frmservicionuevo.txtdepartamento.value=document.frmservicionuevo.cbodepartamento.options[frmservicionuevo.cbodepartamento.selectedIndex].text;">     
                <option> Departamento</option>
                <%
                    while(Rs.next()){
                        
                  
                %>
                <option value="<%=Rs.getString("Id_Departamento")%>"><%=Rs.getString("Descripcion")%> </option>
                <%
                      }//while
                %>
            </select>
             <input id="txtdepartamento" type="text" hidden="false"  name="txtdepartamento" value="" size="40" />
            <Br>
            <Br>
            
            
            <input type="submit" value="Guardar Informacion" name="btnenviar" />
            
        </form>
        
        <BR/><a href="index.html">Borrar Servicio</a>
        <BR/><a href="index.html">Modificar Servicio</a>
        
    </body>
</html>
