<% //response.sendRedirect("register");%>
<% //response.sendRedirect("agregarArticulos");%>
<%--
    Document   : index
    Created on : 2013-12-15, 7:54:48
    Author     : elopez
--%>
<% //response.sendRedirect("register");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>BOLSA DE TRABAJO UM</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">


    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
   

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="../assets/ico/favicon.png">
                                   
                                   
      <!-- Le styles -->
<link href="images/css/bootstrap.css" rel="stylesheet" media="screen, projection">

<link href="images/css/bootstrap.min.css" rel="stylesheet">
<link href="images/js/bootstrap.js" rel="stylesheet">
                                
  </head>

  <body>

    <div class="container">
     
        <table class="table table-condensed table-striped">
            <tr>
                <td>
                    BOLSA DE TRABAJO UM
                </td>
            </tr>
            
        </table>
        
        
      <form class="form-signin" action="login.jsp" method="POST">
        <h2 class="form-signin-heading">Identifíquese!</h2>
        <input type="text" class="input-block-level" name="email" placeholder="Email address">
        <input type="password" class="input-block-level" name="password" placeholder="Password">
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Recordar
        </label>
        <button class="btn btn-xs btn-primary" type="submit" name="ingresar" value="Sign in">Entrar</button>
      </form>

    </div> <!-- /container -->
  </body>
</html>