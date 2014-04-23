<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Empresas</title>
<link rel="icon" href="images/icon.ico" />
<link href="principal/html/stylesempresa.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="topContentWrap">
 <div id="topContent"></div>
</div>
<div id="middleWrap">
 <div id="middlePanel">
  <div class="left">
   <form action="index.jsp"><button> -- Home --</button></form>
   <h2>Empresas</h2>
   <p><span>Si ya cuenta con su usuario solo ingrese</span></p>
   <p><span>Si no tiene cuenta, cree una...</span></p>
   <form action="formularioEmpresa.jsp"><button> Crear Cuenta </button></form>
   <p>&nbsp;  </p>
  </div>
  <div id="loginPanel">
   <h2>Login</h2>
   <form method="post" action="entradaEmpresa">
   <h3>- Enter Your Name -</h3><div class="blank"></div>
   <input name="user" type="text" />
    <h3>- Enter Your Password -</h3><div class="blank"></div>
   <input name="password" type="password" />
   <p><a href="#">Forgot Password ?</a></p>
   <button class="login">Login</button>
   </form>
  </div>
 </div>
</div>

    </div>
 </div>
</div>



</body>
</html>
