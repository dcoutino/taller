

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
    String nitdelcliente = request.getParameter("txtnitcliente");        
    
    String bdcliente ="tblcliente";//bd a buscar informacion
    String campocondicion ="Nit";   //campo a comparar con el ingresado por el usuario
    String parametro =request.getParameter("txtnitcliente");//campo que ingresa el usuario
    

String nit= request.getParameter("txtnitcliente");
String bd ="tbltipo_cliente";
ResultSet Rs = datos.mostrarinformacionBD(bd);
ResultSet Rscliente = datos.mostrarinformacionBDparaJSP(bdcliente, campocondicion, parametro);

         

        
%>  

<h1>Ingreso de nuevo Cliente!</h1>
        <form id="frmclientesnuevos" name="frmactualizaciones" action="clientesactualizavisualizaR.jsp">
           
            
            Nombres:<input type="text" name="txtnombres" value="<%=Rscliente.getNString(2) %>  " size="20" />
            Apellidos:<input type="text" name="txtapellidos" value="<%=Rscliente.getNString(3) %>" size="20" />
            <Br>  <Br>
            Direccion:<input type="text" name="txtdireccion" value="<%=Rscliente.getNString(7) %>" size="70" />
            Nit:<input type="text" name="txtnit" value="<%=Rscliente.getNString(6) %>" size="14" />
            Telefono:<input type="text" name="txttelefono" value="<%=Rscliente.getNString(4) %>" size="17" />
            <Br> <Br>
            Correo Electronico:<input type="text" name="txtmail" value="<%=Rscliente.getNString(5) %>" size="15" />
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
           <input type="text" hidden="false" id="txtidcliente" name="txtidcliente" value="<%=Rscliente.getInt(1) %>" size="20" />
            
             <Br>
            <Br>
            
            
            <input type="submit" value="Guardar Informacion" name="btnenviar" />
            
        </form>
        
        <BR/><a href="index2.html">Retornar Inicio</a>
       
    </body>
</html>
