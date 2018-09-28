<%-- 
    Document   : portal
    Created on : 29/08/2018, 00:19:22
    Author     : Ronaldo
--%>

<%@page import="com.ufpr.tads.web2.beans.LoginBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Portal</title>
    </head>
    <body>
     
          <%
            LoginBean log = (LoginBean) session.getAttribute("login");
            if (log == null) {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/erro.jsp");
                request.setAttribute("msg", "Usuário deve se autenticar para acessar o sistema");
                request.setAttribute("page", "/index.jsp");
                rd.forward(request, response);
            }
        %>


            <jsp:useBean id="login" class="com.ufpr.tads.web2.beans.LoginBean" scope="session"/>
                 <div class="row">
                  
                <h1 class="text-center">Bem vindo,<jsp:getProperty name="login" property="nome"/></h1></div><br>
                    
     
   
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Portal</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="portal.jsp">Inicio</a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">                  
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cliente <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="Cadastro.jsp">Cadastra</a></li>
                                        <li><a href="clientesListar.jsp">Lista</a></li>
                                        </ul>
                                </li>
                            </ul>
                           <ul class="nav navbar-nav navbar-right">
                                <li><a href="LogoutServlet">Sair</a></li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>

                                       
                            
        
        <footer class="page-footer font-small teal pt-4"    >
        <jsp:useBean id="configuracao" class="com.ufpr.tads.web2.beans.ConfigBean" scope="application"/>
        </footer>
                     
        <div class="alert alert-danger"><a class="alert-link "><p class = "text-center">Em caso de problemas contate o administrador<br><p class = "text-center"><jsp:getProperty name="configuracao" property="email"/></p></a></p>  </div>  
  </div>
</body>
</html>
