<%-- 
    Document   : clientesListar
    Created on : Sep 7, 2018, 10:29:43 AM
    Author     : gabri
--%>

<%@page import="javax.*"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.ufpr.tads.web2.dao.ClienteDAO"%>
<%@page import="com.ufpr.tads.web2.classes.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>         <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
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
                                        <li><a href="#">Buscar</a></li>
                                        </ul>
                                </li>
                            </ul>
                           <ul class="nav navbar-nav navbar-right">
                                <li><a href="portal.jsp">Volta</a></li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>


                  
        <h1 class = "text-center">Listagem</h1>
     

  <div class="container">
      <table class="table table-dark table-striped"><thread>
        <tr><th>CPF</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Ação</th>
        <th>Ação</th>
        <th>Ação</th>
        <% 
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.BuscaCliente();
        for( Cliente cliente:clientes ){
        %>         
         <body><tr>
                       <td><%= cliente.getCpf() %></td>
                       <td><%= cliente.getNome() %></td>
                       <td><%= cliente.getEmail()%></td>
                       <td><a href="VisualizarClienteServlet?id=10" class="glyphicon glyphicon-check">Visualizar</a></td>
                       <td><a href="FormAlterarClienteServlet?id=10" class="glyphicon glyphicon-user">Alterar</a></td>
                       <td><a href="RemoverClienteServlet?id=4" class="glyphicon glyphicon-trash"</a>Excluir</td>
                       </tr>
                 <% }%>
    </body>
</html>
