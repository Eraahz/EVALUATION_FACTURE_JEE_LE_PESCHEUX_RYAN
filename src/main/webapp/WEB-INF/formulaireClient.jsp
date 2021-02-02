<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un client</title>
    <%@include file="commons/header.jsp"%>

</head>
<body>
 	<%@include file="commons/menu.jsp"%>

	 	<form action="create" method="post">
	 		<div class="container">
	 			<div class="center-align">
			 		<div class="row">
		    			<div class="input-field col offset-s4 s4">
		      				<label class="active" for="nomClient">Nom</label> 
			 				<input type="text" class="validate" name="nomClient" />
		    			</div>
		  			</div>
		  			<div class="row">
		    			<div class="input-field col offset-s4 s4">
			 				<label class="active" for="adresseClient">Adresse</label>
			 	 			<input type="text" class="validate" name="adresseClient" />
		    			</div>
		  			</div>
			 		
					<button class="btn waves-effect waves-light" type="submit" name="action">
						Envoyer
					</button>
				</div>
			</div>
		</form>

   	<%@include file="commons/footer.jsp"%> 
</body>
</html>