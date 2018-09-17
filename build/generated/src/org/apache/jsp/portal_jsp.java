package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ufpr.tads.web2.beans.LoginBean;

public final class portal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Portal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("               ");

            LoginBean log = (LoginBean) session.getAttribute("login");
            if (log == null) {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/erro.jsp");
                request.setAttribute("msg", "Usuário deve se autenticar para acessar o sistema");
                request.setAttribute("page", "/index.jsp");
                rd.forward(request, response);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      com.ufpr.tads.web2.beans.LoginBean login = null;
      synchronized (session) {
        login = (com.ufpr.tads.web2.beans.LoginBean) _jspx_page_context.getAttribute("login", PageContext.SESSION_SCOPE);
        if (login == null){
          login = new com.ufpr.tads.web2.beans.LoginBean();
          _jspx_page_context.setAttribute("login", login, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                  \n");
      out.write("                <h1 class=\"text-center\">Bem vindo</h1></div>\n");
      out.write("                    \n");
      out.write("     \n");
      out.write("   \n");
      out.write("                <div class=\"container\">   <h2>Bem vindo,");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.ufpr.tads.web2.beans.LoginBean)_jspx_page_context.findAttribute("login")).getNome())));
      out.write("</h2>\n");
      out.write("                 <li><a class=\"nav-link\" href=\"LogoutServlet\">Sair</a></li>\n");
      out.write("               \n");
      out.write("        \n");
      out.write("        <footer class=\"page-footer font-small teal pt-4\"    >\n");
      out.write("        ");
      com.ufpr.tads.web2.beans.ConfigBean configuracao = null;
      synchronized (application) {
        configuracao = (com.ufpr.tads.web2.beans.ConfigBean) _jspx_page_context.getAttribute("configuracao", PageContext.APPLICATION_SCOPE);
        if (configuracao == null){
          configuracao = new com.ufpr.tads.web2.beans.ConfigBean();
          _jspx_page_context.setAttribute("configuracao", configuracao, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        </footer>\n");
      out.write("                     \n");
      out.write("        <div class=\"alert alert-danger\"> <a class=\"alert-link\">Em caso de problemas contate o administrador");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.ufpr.tads.web2.beans.ConfigBean)_jspx_page_context.findAttribute("configuracao")).getEmail())));
      out.write("</a>  </div>  \n");
      out.write("  </div>\n");
      out.write("</body>\n");
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
