package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cliente Nuevo</title>\n");
      out.write("        ");
      pconexionestaller.cconexionatallerf datos = null;
      synchronized (session) {
        datos = (pconexionestaller.cconexionatallerf) _jspx_page_context.getAttribute("datos", PageContext.SESSION_SCOPE);
        if (datos == null){
          datos = new pconexionestaller.cconexionatallerf();
          _jspx_page_context.setAttribute("datos", datos, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

            String bd ="tbltipo_cliente";
            ResultSet Rs = datos.mostrarinformacionBD(bd);
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Ingreso de nuevo Cliente!</h1>\n");
      out.write("        <form id=\"frmclientesnuevos\" name=\"frmclientesnuevos\" action=\"clienteR.jsp\">\n");
      out.write("            Nombres:<input type=\"text\" name=\"txtnombres\" value=\"\" size=\"20\" />\n");
      out.write("            Apellidos:<input type=\"text\" name=\"txtapellidos\" value=\"\" size=\"20\" />\n");
      out.write("            <Br>  <Br>\n");
      out.write("            Direccion:<input type=\"text\" name=\"txtdireccion\" value=\"\" size=\"70\" />\n");
      out.write("            Nit:<input type=\"text\" name=\"txtnit\" value=\"\" size=\"14\" />\n");
      out.write("            Telefono:<input type=\"text\" name=\"txttelefono\" value=\"\" size=\"17\" />\n");
      out.write("            <Br> <Br>\n");
      out.write("            Correo Electronico:<input type=\"text\" name=\"txtmail\" value=\"\" size=\"15\" />\n");
      out.write("            Tipo de Cliente:\n");
      out.write("             <select required=\"true\" name=\"cbotipocliente\" id=\"cbotipocliente\"  \n");
      out.write("                     onchange=\"document.frmclientesnuevos.txttipocliente.value=document.frmclientesnuevos.cbotipocliente.options[frmclientesnuevos.cbotipocliente.selectedIndex].text;\">     \n");
      out.write("                <option> Tipo de cliente</option>\n");
      out.write("                ");

                    while(Rs.next()){
                        
                  
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(Rs.getString("Id_Tipo_Cliente"));
      out.write('"');
      out.write('>');
      out.print(Rs.getString("Descripcion"));
      out.write(" </option>\n");
      out.write("                ");

                      }//while
                
      out.write("\n");
      out.write("            </select>\n");
      out.write("             <input id=\"txttipocliente\" type=\"text\" hidden=\"false\"  name=\"txttipocliente\" value=\"\" size=\"40\" />\n");
      out.write("            <Br>\n");
      out.write("            <Br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Guardar Informacion\" name=\"btnenviar\" />\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <BR/><a href=\"borrarcliente.html\">Borrar Cliente</a>\n");
      out.write("        <BR/><a href=\"index.html\">Modificar Cliente</a>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
