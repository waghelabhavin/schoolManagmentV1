<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form  commandName="field" method="POST" action="addFields">
		<div class="row">
			<table>
				<tr>
					<td>School Management Fields</td>
					<td><form:input path="name" ></form:input></td>
					<td>Type</td>
					<td><form:input path="type" ></form:input></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Submit"/>
					</td>
				</tr>
			</table>
		</div>
</form:form>
</body>
</html>