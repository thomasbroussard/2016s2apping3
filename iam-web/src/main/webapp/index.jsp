<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<%
		Date dateDuJour = new Date();
	%>

	<%=String.valueOf(dateDuJour)%>
    <h3>Saisie d'un formulaire</h3>
	<form action="Create" method="post">
		<div>
			<label>Nom</label> <input name="nom" type="text">
		</div>
		<div>
			<label>Pr�nom</label> <input name="prenom" type="text">
		</div>
        <input type="submit">
	</form>

</body>
</html>