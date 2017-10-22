<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form process page</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name:<form:input path="firstName" /><br/><br/>
		Last name:<form:input path="lastName" /><br/><br/>
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select><br/><br/>
		Fav Lang: <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  /><br/><br/>
		Hobbies: <form:checkboxes path="favHobbies" items="${student.hobbies}"  /><br/><br/>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>
