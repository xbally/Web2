package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ufpr.tads.web2.classes.Cliente;
import java.util.List;
import com.ufpr.tads.web2.dao.ClienteDAO;

public final class clientesAlterar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                     <nav class=\"navbar navbar-default\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Portal</span>\n");
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
      out.write("                                        <li><a href=\"clientesListar.jsp\">Lista</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                           <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"portal.jsp\">Volta</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("        ");
 
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.BuscaCliente();
        for( Cliente cliente:clientes ){
        
      out.write("    \n");
      out.write("       <div class=\"container\">\n");
      out.write("        <h1 class=\"text-center\">Cadastro Cliente</h1>\n");
      out.write("        <form class=\"form-horizontal\"  action=\"CadastroCliente\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label class=\"control-label\">CPF</label>\n");
      out.write("             <input type=\"text\" class=\"form-control  col-sm-3\" name=\"CPF\" value=\"\">");
      out.print( cliente.getCpf() );
      out.write("<br>\n");
      out.write("            \n");
      out.write("            Nome <input type=\"text\" class=\"form-control col-sm-7 \" name=\"nome\" value=\"\">");
      out.print( cliente.getNome() );
      out.write("<br>\n");
      out.write("           \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            Data <input type=\"date\" class =\"form-control col-sm-3 \" name=\"data\" value=\"\">");
      out.print( cliente.getData() );
      out.write("</div>           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            Email<input type=\"text\" class=\"form-control col-sm-7\" name=\"email\" value=\"\">");
      out.print( cliente.getEmail() );
      out.write("<br>\n");
      out.write("            \n");
      out.write("            Rua <input type=\"text\" class=\"form-control col-sm-7 \" name=\"rua\" value=\"\">");
      out.print( cliente.getRua() );
      out.write("<br>\n");
      out.write("            \n");
      out.write("            Numero <input type=\"text\" class=\"form-control col-sm-7 \" name=\"numero\" value=\"\">");
      out.print( cliente.getNumero() );
      out.write("<br>\n");
      out.write("            \n");
      out.write("            CEP <input type=\"text\" class=\"form-control col-sm-7 \" name=\"cep\" value=\"\">");
      out.print( cliente.getCep() );
      out.write("<br>\n");
      out.write("            \n");
      out.write("            Cidade <input type=\"text\" class=\"form-control col-sm-7 \" name=\"cidade\" value=\"\">");
      out.print( cliente.getCidade() );
      out.write("<br>\n");
      out.write("            \n");
      out.write("            UF <input type=\"text\" class=\"form-control col-sm-7 \" name=\"uf\" value=\"\">");
      out.print( cliente.getUf() );
      out.write("<br> ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value= \"Cadastrar\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
