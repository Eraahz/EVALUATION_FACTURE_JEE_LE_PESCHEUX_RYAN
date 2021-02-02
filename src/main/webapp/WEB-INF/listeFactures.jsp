<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des factures</title>
	<%@include file="commons/header.jsp"%>
</head>
<body>
<jsp:useBean id="date" class="java.util.Date"/>
 	<%@include file="commons/menu.jsp"%>
 	<div class="container center-align">
		<table class="highlight">
			<tr>
				<th>Numero</th>
				<th>Date</th>
				<th>Client</th>
				<th>Prix</th>
			</tr>
			<tr>
				<c:forEach var="facture" items="${factures}">
					<tr>
						<td>
							<a href="details-facture?id=${facture.getId()}">${facture.getNumero()}</a>
						</td>
						<td>
							<fmt:formatDate value="${facture.getDateFacture()}" type="date" pattern="dd/MM/yyyy"/>
						</td>
						<td>
							${facture.getClient().getNom()}
						</td>
						<td>
							${facture.getPrix()}
						</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
	</div>
	
	<%@include file="commons/footer.jsp"%> 
</body>
</html>