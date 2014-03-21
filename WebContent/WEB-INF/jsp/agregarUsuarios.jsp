<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Agregar Alumnos</title>

</head>
<body>
    
    <div class="container">
        <%@include file="menu.jsp" %>
        
	<center>
		<br /> <br /> <br /> <h1 class="jumbotron">Agregar Alumnos</h1> <br />
		<br />
		<div>
			<form:form method="post" action="/insertarUsuarios" modelAttribute="usuarios">
				<table class="table table-condensed table-hover">
					<tr>
						<td>Usuario :</td>
						<td><form:input path="usuario" /></td>
					</tr>
					<tr>
						<td>Nombre :</td>
						<td><form:input path="nombre" /></td>
					</tr>
					<tr>
						<td>A Paterno :</td>
						<td><form:input path="aPaterno" /></td>
					</tr>
					<tr>
						<td>A Materno :</td>
						<td><form:input path="aMaterno" /></td>
					</tr>
                                        
                                        
                                        
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Guardar" /></td>
					</tr>
					<tr>
						
						<td colspan="2"><a href="listaUsuarios">Lista Usuarios</a></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>
    </div>
</body>
</html>