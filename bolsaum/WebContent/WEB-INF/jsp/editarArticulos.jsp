<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Editar Articulos</title>

</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Editar Articulos</b><br /> <br />
		<div>
			<form:form method="post" action="/actualizarArticulos" modelAttribute="articulos">
				<table> <tr>
						<td>Nombre :</td>
						<td><form:input path="descripcion" value="${map.articulos.descripcion}" />
						</td>
					</tr>
  
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				

			</form:form>
		</div>
	</center>
</body>
</html>