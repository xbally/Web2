<%-- 
    Document   : clientesAlterar
    Created on : Sep 13, 2018, 9:16:04 AM
    Author     : gabri
--%>

<%@page import="com.ufpr.tads.web2.classes.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="com.ufpr.tads.web2.dao.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
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
                                <li><a href="portal.jsp">Volta</a></li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
  
       <div class="container">
        <h1 class="text-center">Cadastro Cliente</h1>
        <form class="form-horizontal"  action="CadastroCliente" method="POST">
            <div class="form-group">
            <label class="control-label">CPF</label>
             <input type="text" class="form-control  col-sm-3" name="CPF" value=""><br>
            
            Nome <input type="text" class="form-control col-sm-7 " name="nome" value=""><%= cliente.getNome() %><br>
           
            <div class="form-group">
            Data <input type="date" class ="form-control col-sm-3 " name="data" value="<%= cliente.getData() %>"></div>           
            
            
            Email<input type="text" class="form-control col-sm-7" name="email" value=""><%= cliente.getEmail() %><br>
            
            Rua <input type="text" class="form-control col-sm-7 " name="rua" value=""><%= cliente.getRua() %><br>
            
            Numero <input type="text" class="form-control col-sm-7 " name="numero" value=""><%= cliente.getNumero() %><br>
            
            CEP <input type="text" class="form-control col-sm-7 " name="cep" value=""><%= cliente.getCep() %><br>
            
            Cidade <input type="text" class="form-control col-sm-7 " name="cidade" value=""><%= cliente.getCidade() %><br>
            
            UF <input type="text" class="form-control col-sm-7 " name="uf" value=""><%= cliente.getUf() %><br> <%}%>
            </div>
            <input type="submit" value= "Cadastrar">
            </form>
        </div>
    </body>
</html>
