<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un article</title>
    <%@include file="commons/header.jsp"%>

</head>
<body>
 	<%@include file="commons/menu.jsp"%>

	 	<form action="create" method="post">
	 		<div class="container">
	 			<div class="center-align">
			 		<div class="row">
		    			<div class="input-field col offset-s4 s4">
		      				<label class="active" for="nomArticle">Nom</label> 
			 				<input type="text" class="validate" name="nomArticle" />
		    			</div>
		  			</div>
		  			<div class="row">
		    			<div class="input-field col offset-s4 s4">
			 				<label class="active" for="prixArticle">Prix</label>
			 	 			<input type="text" class="validate" name="prixArticle" />
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