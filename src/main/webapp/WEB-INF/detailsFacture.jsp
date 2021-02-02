<%@page import="fr.epsi.entite.Facture"%>
<%@page import="fr.epsi.entite.LigneFacture"%>
<%@page import="java.util.List"%>
<%@ page language="java"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Détail d'une facture</title>
	<%@include file="commons/header.jsp"%>
</head>
<body>
 	<%@include file="commons/menu.jsp"%>
 	<div class="container center-align">
 		<div class="row">
	 		<div class="col s6">
	 			<div class="row">
	 				Date de facturation : <fmt:formatDate value="${facture.getDateFacture()}" type="date" pattern="dd/MM/yyyy"/>
	 			</div>
	 			<div class="row">
	 				Numéro de facture : ${facture.getNumero()}
	 			</div>
	 		</div>
	 		<div class="col s6">
	 			<div class="row">
	 				${facture.getClient().getNom()}
	 			</div>
	 			<div class="row">
	 				${facture.getClient().getAdresse()}
	 			</div>
	 		</div>
	 	</div>
		<table class="highlight">
			<tr>
				<th>Article</th>
				<th>Quantité</th>
				<th>Prix</th>
			</tr>
			<tr>
				<c:forEach var="ligneFacture" items="${listeLignesFacture}">
					<tr>
						<td>
							${ligneFacture.getArticle().getNom()}
						</td>
						<td>
							${ligneFacture.getQuantite()}
						</td>
						<td>
							${ligneFacture.getPrix()}
						</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
		<h3>Total : ${facture.getPrix()} euros</h3>
	</div>
	
	<%@include file="commons/footer.jsp"%> 
</body>
</html>