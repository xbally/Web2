<%-- 
    Document   : erro
    Created on : Aug 29, 2018, 10:05:45 AM
    Author     : gabri
--%>

<%@page import="com.ufpr.tads.web2.beans.ErroBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
         <style>
  .bg-1 { 
      background-color: #1abc9c;
      color: #ffffff;
  }
  .bg-2 { 
      background-color: #474e5d;
      color: #ffffff;
  }
  .bg-3 { 
      background-color: #ffffff;
      color: #555555;
  }
  .bg-4 { 
      background-color: #2f2f2f;
      color: #fff;
  }
  .container-fluid {
      padding-top: 70px;
      padding-bottom: 70px;
  }
  .navbar {
      padding-top: 15px;
      padding-bottom: 15px;
      border: 0;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 12px;
      letter-spacing: 5px;
  }
  .navbar-nav  li a:hover {
      color: #1abc9c !important;
  }
  </style>
        <title>JSP Page</title>
    </head>
    <body>
                <%@ page isErrorPage="true" %>
        <h1 class="text-center">Ops ocorreu um erro!</h1>
              <jsp:useBean id="erro" class="com.ufpr.tads.web2.beans.ErroBean" scope="request"/>
        <jsp:setProperty name="erro" property="*"/>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4 alert alert-danger" role="alert">
                <p><jsp:getProperty name="erro" property="msg"/></p>
            </div>
        </div>
   
        <jsp:useBean id="configuracao" class="com.ufpr.tads.web2.beans.ConfigBean" scope="application"/>
       
        <footer class="container-fluid bg-4 text-center">
         <a class="alert-link" ><p>Em caso de problemas contate o administrador<jsp:getProperty name="configuracao" property="email"/></a></p> 
         <a href="index.jsp"<jsp:getProperty name="erro" property="page"/>>Voltar para a tela de login</a>
        </footer>
        
        
  
    </body>
</html>
