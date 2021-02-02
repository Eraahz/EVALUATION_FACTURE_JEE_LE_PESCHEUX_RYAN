<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des clients</title>
	<%@include file="commons/header.jsp"%>
</head>
<body>
 	<%@include file="commons/menu.jsp"%>
 	<div class="container center-align">
		<table class="highlight">
			<tr>
				<th>Nom</th>
				<th>Adresse</th>
			</tr>
			<tr>
				<c:forEach var="client" items="${clients}">
					<tr>
						<td>
							${client.getNom()}
						</td>
						<td>
							${client.getAdresse()}
						</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
		<div class="row pt-5">
			<div class="right-align">
				<a href="clients/create" class="waves-effect waves-light btn">Ajouter un client</a>
			</div>
	</div>
	</div>
	
	<%@include file="commons/footer.jsp"%> 
</body>
</html>