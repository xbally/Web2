<%-- 
    Document   : clientesNovo
    Created on : Sep 16, 2018, 9:29:06 PM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Novo cliente</title>
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
        <h1 class="text-center">Novo Cliente</h1>
        <form action="NovoClienteServlet" method="POST">
           <div class="form-row">
           <div class="form-group col-md-6"><label>CPF</label>
            <input type="text" class="form-control"  placeholder="CPF" name="CPF" value=""></div>
            
            <div class="form-group col-md-6">
                <label>Nome</label>
            <input type="text" class="form-control " placeholder="Nome" name="nome" value=""></div>
           
            <div class="form-group col-md-2">
            Data <input type="date" class ="form-control"  name="data" value=""></div>           
            
            <div class="form-group col-md-4">           
            Email<input type="text" class="form-control" placeholder="Email@gmail.com" name="email" value=""></div>
            
            <div class="form-group col-md-6">  
            Rua <input type="text" class="form-control" placeholder="Rua : Fernando Assunção" name="rua" value=""></div>
            
            <div class="form-group col-md-2">
            Numero <input type="text" class="form-control" placeholder="123" name="numero" value=""></div>
            
            <div class="form-group col-md-3">
            CEP <input type="text" class="form-control" placeholder="xxxxx-xxx" name="cep" value=""></div>
            
            <div class="form-group col-md-3">
            Cidade <input type="text" class="form-control" placeholder="São Paulo" name="cidade" value=""></div>
            
            <div class="form-group col-md-1">
            UF <input type="text" class="form-control" placeholder="Pr" name="uf" value=""></div><br><br>
                              <input type="submit" value= "Salvar">
         
            <input type="submit" value="Cancela">
          </form>
         </div>

       
    </body>
</html>
