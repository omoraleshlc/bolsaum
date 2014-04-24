<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Empresas</title>
 <%@include file="menu.jsp" %>
    
</head>
<body>
    <div class="container">
	<center>
		<br /> <br /> <br /> <b>Lista de Ofertas</b><br /> <br />
			
		

		<table class="table table-condensed table-hover">
                    <thead>
				<td class="heading">#</td>
				<td class="heading">Descripcion</td>
				<td class="heading">Sector</td>
				<td class="heading">status</td>
                                
                                <td class="heading"></td>
                                <td class="heading"></td>
                                
			</thead>
			<c:forEach var="empresas" items="${empresasList}">
				<tr>
					<td>${empresas.keyEmp}</td>
					<td>${empresas.descripcion}</td>
					<td>${empresas.sector}</td>
                                        <td>${empresas.status}</td>
                                       
					
                                        <td ><div align="right"><a href="editarEmpresas?keyEmp=${empresas.keyEmp}">Editar</a></div></td>
                                        <td ><div align="right"><a href="eliminarEmpresas?keyEmp=${empresas.keyEmp}">Eliminar</a></div></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="formaInsertarEmpresas">Agrega Empresa</a></td></tr>
		</table>

	</center>
    </div>
</body>
</html>