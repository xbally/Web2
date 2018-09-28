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
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <div class="container">
            <form class="form-horizontal" action="LoginServlet" method="POST">
               <div class="row">   
                <div class="col-md-3"></div>
                <div class="col-md-6"> 
                    <h1>Login</h1></div>
            </div>
          
   
         <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div class="form-group has-danger">
                        <label>Login</label>
                        <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                            <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-at"></i></div>
                      <input type="text" name="login" class="form-control" value="">
                        </div>    
                    </div>
                </div>
                </div>
        <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div class="form-group">    
                        <label>Senha</label> 
                        <div class="input-group mb-2 mr-sm-2 mb-sm-0"> <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-at"></i></div>
            <input type="password" name="senha" class="form-control" value="">
                        </div>
                        </div>  
                    </div>
                </div>
        <div class="row" style="padding-top: 1rem">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <input type="submit" value="Login" class="btn btn-success"><i class="fa fa-sign-in"></input></div>
            </div>
                    
        <jsp:useBean id="erro" class="com.ufpr.tads.web2.beans.ErroBean" scope="request"/>
        <jsp:setProperty name="erro" property="*"/>
    <div  class="form-group col-md-6">
    <div class="alert alert-danger">
    <strong>
      <jsp:getProperty name="erro" property="msg"/></strong></div></div>
      
      
   
         
        </div>
        </form>
    </body>
</html>
