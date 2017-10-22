<!DOCTYPE html>
<html>

<head>

	<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/res/css/my-test.css">

    <script src="${pageContext.request.contextPath}/res/js/simple-test.js"></script>

</head>

<body>

<h2>Spring MVC Demo - Home Page</h2>

<a href="showForm">Show form</a>
<a href="studentForm">Show Student Form</a>

<br><br>

<img src="${pageContext.request.contextPath}/res/images/spring-logo.png" />

<br><br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>

</body>

</html>