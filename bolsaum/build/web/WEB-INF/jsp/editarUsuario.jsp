<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Editar Usuarios</title>

</head>
<body>
    <%@include file="menu.jsp" %>
    <div class="container">
	<center>
		<br /> <br /> <br /> <b>Editar Usuarios</b><br /> <br />
		<div>
			<form:form method="post" action="/actualizarUsuario" modelAttribute="usuarios">
                            <table class="table table-condensed table-striped">					
					
                                        <tr>
						<td>Nombre :</td>
						<td><form:input path="nombre" value="${map.usuarios.nombre}" />
						</td>
					</tr>
                                        
                                       <tr>
						<td>aPaterno :</td>
						<td><form:input path="aPaterno" value="${map.usuarios.aPaterno}" />
						</td>
					</tr>
                                        
                                         <tr>
						<td>aMaterno :</td>
						<td><form:input path="aMaterno" value="${map.usuarios.aMaterno}" />
						</td>
					</tr>
                                        
                                         <tr>
						<td>email :</td>
						<td><form:input path="email" value="${map.usuarios.email}" />
						</td>
					</tr>
                                        
                                        
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="folio" value="${map.usuarios.folio}" />

			</form:form>
		</div>
	</center>
    </div>
</body>
</html>