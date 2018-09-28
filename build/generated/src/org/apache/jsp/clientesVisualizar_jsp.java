package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ufpr.tads.web2.beans.ClienteBean;
import java.util.List;
import com.ufpr.tads.web2.dao.ClienteDAO;
import java.*;

public final class clientesVisualizar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>         <nav class=\"navbar navbar-default\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"portal.jsp\">Inicio</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">                  \n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Cliente <span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"Cadastro.jsp\">Cadastra</a></li>\n");
      out.write("                                        <li><a href=\"#\">Buscar</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                           <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"portal.jsp\">Volta</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                  \n");
      out.write("        <h1 class = \"text-center\">Listagem</h1>\n");
      out.write("     \n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <table class=\"table table-dark table-striped\"><thread>\n");
      out.write("        <tr><th>CPF</th>\n");
      out.write("        <th>Nome</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        <th>Data</th>\n");
      out.write("        <th>Rua</th>\n");
      out.write("        <th>Numero</th>\n");
      out.write("        <th>Cep</th>\n");
      out.write("        <th>Cidade</th>\n");
      out.write("        <th>UF</th></tr>\n");
      out.write("        ");
 
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.Visualizar();
        for( Cliente cliente:clientes ){
        
      out.write(" \n");
      out.write("         <body><tr>\n");
      out.write("                       <td>");
      out.print( cliente.getCpf() );
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getNome() );
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getEmail());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getData());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getRua());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getNumero());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getCep());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getCidade());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( cliente.getUf());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                 ");
 }
      out.write("\n");
      out.write("    </body>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
