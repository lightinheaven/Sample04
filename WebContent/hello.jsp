<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Page</title>
<script language="javascript" src="validate.js">
</script>
</head>
<body>
<h2><font color="green">Sample04: JSP + Spring MVC + Service + DAO + Hibernate</font></h2>
<form action="hello.do" method="post" onsubmit="return validate_Form(this)">
	<table>
		<tr>
			<td>Name: </td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>Age: </td>
			<td><input type="text" name="age"/></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="reset" value="Clear"/>
				<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>