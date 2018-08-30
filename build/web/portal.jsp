<%-- 
    Document   : portal
    Created on : Aug 29, 2018, 8:30:10 AM
    Author     : gabri
--%>

<%@page import="com.ufpr.tads.web2.servlets.LoginBean"%>
<%@page import="com.ufpr.tads.web2.servlets.ConfigBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portal do mundo</title>
    </head>
    <body>
     <%
        LoginBean log = (LoginBean) session.getAttribute("login");
            if(log == null){
              
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/erro.jsp");
                request.setAttribute("msg", "Usuário não está logado");
                request.setAttribute("page", "Voltar para a página de login");
                rd.forward(request, response); %>
            }
          <jsp:useBean id="usuario" class="com.ufpr.tads.web2.servlets.LoginBean" scope="session"/>
          <a> href="portal.jsp">a</a>
            <h1>Bem vindo,</h1> <jsp:getProperty name="usuario" property="login"/>
                <a href="a" >Sair</a>
                <a href="LogoutServlet" >Sair</a>
     
                
            }
    </body>
</html>
