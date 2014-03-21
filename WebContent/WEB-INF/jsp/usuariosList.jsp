<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Usuarios</title>
 <%@include file="menu.jsp" %>
    
</head>
<body>
    <div class="container">
	<center>
		<br /> <br /> <br /> <b>Lista de Usuarios</b><br /> <br />
			
		

		<table class="table table-condensed table-hover">
			<tr>
				<td class="heading">folio</td>
				<td class="heading">Usuario</td>
				<td class="heading">Nombre</td>
				<td class="heading">aPaterno</td>
                                <td class="heading">aMaterno</td>
                                <td class="heading">email</td>
                                <td class="heading"></td>
                                <td class="heading"></td>
                                
			</tr>
			<c:forEach var="usuarios" items="${usuariosList}">
				<tr>
					<td>${usuarios.folio}</td>
					<td>${usuarios.usuario}</td>
					<td>${usuarios.nombre}</td>
                                        <td>${usuarios.aPaterno}</td>
                                        <td>${usuarios.aMaterno}</td>
                                        <td>${usuarios.email}</td>
					
                                        <td ><div align="right"><a href="editarUsuario?folio=${usuarios.folio}">Edit</a></div></td>
                                        <td ><div align="right"><a href="delete?folio=${usuarios.folio}">Delete</a></div></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="formaInsertarUsuarios">Agrega Usuario</a></td></tr>
		</table>

	</center>
    </div>
</body>
</html>