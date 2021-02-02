<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des articles</title>
	<%@include file="commons/header.jsp"%>
</head>
<body>
 	<%@include file="commons/menu.jsp"%>
 	<div class="container center-align">
		<table class="highlight">
			<tr>
				<th>Nom</th>
				<th>Prix</th>
			</tr>
			<tr>
				<c:forEach var="article" items="${articles}">
					<tr>
						<td>
							${article.getNom()}
						</td>
						<td>
							${article.getPrix()}
						</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
		<div class="row pt-5">
			<div class="right-align">
				<a href=articles/create class="waves-effect waves-light btn">Ajouter un article</a>
			</div>
		</div>
	</div>
	
	<%@include file="commons/footer.jsp"%> 
</body>
</html>