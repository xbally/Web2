<%-- 
    Document   : clientesVisualizar
    Created on : Sep 16, 2018, 9:28:51 PM
    Author     : gabri
--%>


<%@page import="com.ufpr.tads.web2.classes.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="com.ufpr.tads.web2.dao.ClienteDAO"%>
<%@page import="java.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <th>Data</th>
        <th>Rua</th>
        <th>Numero</th>
        <th>Cep</th>
        <th>Cidade</th>
        <th>UF</th></tr>
  
         <body><tr>
                       <td> ${visualizarcliente.cpf}</td>
                       <td> ${visualizarcliente.nome}</td>
                       <td> ${visualizarcliente.email}</td>
                       <td> ${visualizarcliente.data}</td>
                       <td> ${visualizarcliente.rua}</td>
                       <td> ${visualizarcliente.numero}</td>
                       <td> ${visualizarcliente.cep}</td>
                       <td> ${visualizarcliente.cidade}</td>
                       <td> ${visualizarcliente.uf}</td>
                    </tr>
                
    </body>
    </body>
</html>

