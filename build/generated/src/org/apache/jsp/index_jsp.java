package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("         <title>Login</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <form class=\"form-horizontal\" action=\"LoginServlet\" method=\"POST\">\r\n");
      out.write("               <div class=\"row\">   \r\n");
      out.write("                <div class=\"col-md-3\"></div>\r\n");
      out.write("                <div class=\"col-md-6\"> \r\n");
      out.write("                    <h1>Login</h1></div>\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("   \r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\"></div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"form-group has-danger\">\r\n");
      out.write("                        <label>Login</label>\r\n");
      out.write("                        <div class=\"input-group mb-2 mr-sm-2 mb-sm-0\">\r\n");
      out.write("                            <div class=\"input-group-addon\" style=\"width: 2.6rem\"><i class=\"fa fa-at\"></i></div>\r\n");
      out.write("                      <input type=\"text\" name=\"login\" class=\"form-control\" value=\"\">\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\"></div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"form-group\">    \r\n");
      out.write("                        <label>Senha</label> \r\n");
      out.write("                        <div class=\"input-group mb-2 mr-sm-2 mb-sm-0\"> <div class=\"input-group-addon\" style=\"width: 2.6rem\"><i class=\"fa fa-at\"></i></div>\r\n");
      out.write("            <input type=\"password\" name=\"senha\" class=\"form-control\" value=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        <div class=\"row\" style=\"padding-top: 1rem\">\r\n");
      out.write("                <div class=\"col-md-3\"></div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Login\" class=\"btn btn-success\"><i class=\"fa fa-sign-in\"></input></div>\r\n");
      out.write("            </div>\r\n");
      out.write("                    \r\n");
      out.write("        ");
      com.ufpr.tads.web2.beans.ErroBean erro = null;
      synchronized (request) {
        erro = (com.ufpr.tads.web2.beans.ErroBean) _jspx_page_context.getAttribute("erro", PageContext.REQUEST_SCOPE);
        if (erro == null){
          erro = new com.ufpr.tads.web2.beans.ErroBean();
          _jspx_page_context.setAttribute("erro", erro, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("erro"), request);
      out.write("\r\n");
      out.write("    <div  class=\"form-group col-md-6\">\r\n");
      out.write("    <div class=\"alert alert-danger\">\r\n");
      out.write("    <strong>\r\n");
      out.write("      ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.ufpr.tads.web2.beans.ErroBean)_jspx_page_context.findAttribute("erro")).getMsg())));
      out.write("</strong></div></div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
