<<<<<<< HEAD
<<<<<<< HEAD
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Bolsa de Trabajo UM</title>
<link rel="icon" href="images/icon.ico" />
<link href="principal/html/stylesNice.css" rel="stylesheet" type="text/css" />
</head>

<body>
<h4>&nbsp;</h4>
<div id="contenedor">
   <div id="empresas">
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>Empresas</h2>
   <h3>Iniciar session como empresa   </h3>
   <form action="empresas.jsp">
   <input type="submit" value="Entrar">
   </input>
   </form>
</div>
  <div id="egresados">
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>&nbsp;</h2>
   <h2>Egresados</h2>
   <h3>Iniciar session como egresados</h3>
  <form name="egresados" action="egresados.jsp">
    <input type="submit" value="Entrar">
   </input>
 </form>
  </div>
 <div id= "logo"> 
 <img src="principal/html/images/UM.gif" width="422" height="96" alt="logo" /></div>
 
 <div id="tituloUM">
 	<p class="titulo"> BOLSA DE TRABAJO UM</p>
    
 </div>
 <div class="letra1" id="menudeOfertas">
   <p class="letra1">Para ver las ofertas de trabajo </p>
  <form name="egresados" action="verOfertas.jsp">
    <input type="submit" value="Entrar">
   </input>
 </form>
 </div>
  <div id="administrador">

  <p class="letra1" id="letra1"> Inicia Session como Administrador </p>
<button> Entrar</button>
</div>
</div>





<div id="footWrap">
 <div id="footPanel">
  <div id="footNav">
   <ul>
    <li><a href="#">Client Testimonials</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">Latest Events</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">Our Online Support</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">Solutions</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">Forum</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">What Our Future Plans</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">Projects</a></li>
    <li><div class="blank">|</div></li>
    <li><a href="#">Contact Us</a></li>
   </ul>
  </div>
  </div>
</div>
</div>
</body>
</html>
=======
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
>>>>>>> origin/master
=======
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
>>>>>>> origin/master
