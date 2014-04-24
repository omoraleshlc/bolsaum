<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Agregar Empresa</title>

</head>
<body>
    
    <div class="container">
        <%@include file="menu.jsp" %>
        
	<center>
		<br /> <br /> <br /> <h1 class="jumbotron">Agregar Ofertas</h1> <br />
		<br />
		<div>
			<form:form method="post" action="/insertarOfertas" modelAttribute="empresas">
				<table class="table table-condensed table-hover">
					<tr>
						<td>Descripcion :</td>
						<td>
                                                    <div class="col-xs-6 col-sm-4">
                                                    <form:input class="form-control" path="descripcion" />
                                                    </div></td>
					</tr>
                                        <tr>
						<td>Sector :</td>
						<td><div class="col-xs-6 col-sm-4">
                                                    <form:select path="sector" class="form-control xs" items="${map.sectorList}" />
                                                    </div>
                                                </td>
					</tr>
					<tr>
						<td>Status :</td>
						<td><div class="col-xs-6 col-sm-4">
                                                    <form:input class="form-control" path="status" />
                                                    </div></td>
					</tr>
                                        
                                   
					
					<tr>
						<td>&nbsp;</td>
						<td><input class="btn btn-primary btn-sm" type="submit" value="Guardar" /></td>
					</tr>
					<tr>
						
						<td colspan="2"><a href="listaEmpresas">Lista Empresas</a></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>
    </div>
</body>
</html>