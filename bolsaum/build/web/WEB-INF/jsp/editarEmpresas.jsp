<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Editar Empresas</title>

</head>
<body>
    <%@include file="menu.jsp" %>
    <div class="container">
	<center>
		<br /> <br /> <br /> <b>Editar Empresas</b><br /> <br />
		<div>
			<form:form method="post" action="/actualizarUsuario" modelAttribute="empresas">
                            <table class="table table-condensed table-striped">					
					
                                        <tr>
						<td>Descripcion :</td>
						<td><div class="col-xs-6 col-sm-4"><form:input path="descripcion" value="${map.empresas.descripcion}" />
                                                    </div></td>
					</tr>
                                        
                                        <tr>
						<td>Sector :</td>
						<td><div class="col-xs-6 col-sm-4">
                                                    <form:select path="sector" class="form-control xs" items="${map.empresas.sectorList}" />
                                                    </div>
                                                </td>
					</tr>
                                        
					<tr>
						<td>&nbsp;</td>
						<td><div class="col-xs-6 col-sm-4"><input class="btn btn-primary btn-xs" type="submit" value="Save" />
                                                    </div></td>
					</tr>
				</table>
				<form:hidden path="keyEmp" value="${map.empresas.keyEmp}" />

			</form:form>
		</div>
	</center>
    </div>
</body>
</html>