<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Actualiza Alumnos</title>
<%@include file="menu.jsp" %>

</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Edit User Details </b><br /> <br />
		<div>
			<form:form method="post" action="/actualizarAlumnos" modelAttribute="alumnos">
				<table>					
					
					
                                        	<tr>
						<td>Nombre :</td>
						<td><form:input path="nombre" value="${map.alumnos.nombre}" />
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