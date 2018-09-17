<%-- 
    Document   : index
    Created on : Sep 6, 2018, 5:30:50 PM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
         <form action="LoginServlet" method="POST">
             
              <div class="row">
                <h1 class="text-center">Login</h1></div>
             
             <div class = "container">      
         
            Login
            <div class="input-group">
             <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input type="text" name="login" value="" class="form-control col-sm-4"><br>
            </div>
            Senha
            <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <input type="password" name="senha" value="" class="form-control col-sm-4"><br></div>
            <input type="submit" value="Login"  class="btn btn-primary">
        </form>
    </body>
</html>
