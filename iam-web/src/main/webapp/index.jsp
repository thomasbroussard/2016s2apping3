<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<% 
			if (session.getAttribute("message") != null) {
		%>
		<div class="message">
			<%=session.getAttribute("message")%>
		</div>
		<%
			session.setAttribute("message", null);
			}
		%>
		<h1>Saisie d'une identité</h1>
		<form method="post" class="form-horizontal" action="Create">
			<div class="form-group">
				<label for="firstName" class="col-sm-2 control-label">First
					Name</label>

				<div class="col-sm-10">
					<input type="text" class="form-control" name="firstName"
						id="firstName" placeholder="First Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="lastName" class="col-sm-2 control-label">Last
					Name</label>

				<div class="col-sm-10">
					<input type="text" name="lastName" class="form-control"
						id="lastName" placeholder="Last Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="lastName" class="col-sm-2 control-label">Email</label>

				<div class="col-sm-10">
					<input type="email" name="email" class="form-control" id="email"
						placeholder="Email" />
				</div>
			</div>

			<div class="form-group">
				<label for="date" class="col-sm-2 control-label">Birth Date</label>

				<div class="col-sm-10">
					<input type="date" name="date" class="form-control" id="date"
						placeholder="Birth Date" />
				</div>
			</div>


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>