<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="login" commandName="loginForm">
<table>
<tr><td><form:errors path="fName"></form:errors></td>
</tr></table>
<table>
<tr><td>
<form:label path="fName" />First Name:</td>
<td><form:input path="fName"/></td></tr></table>
<table><tr><td><form:errors path="lName"></form:errors></td></table>
<table><tr><td>
<form:label path="lName" title=""/>Last Name:</td>
<td><form:input path="lName"/></td></tr>
</table><table>
<tr><td><input type="submit" value="Submit"></input></td></tr></table>
</form:form>

</body>
</html>