<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<f:form action="/student" method="Post" modelAttribute="student">
	Student Name : <f:input path="name" />
	<br>
	<br>
	<input type="radio" id="radio_yes" name="gender" value="Yes" /> Male
		 <input type="radio" id="radio_no" name="gender" value="No" checked="checked" />
		Female<br> 
		<br>
		<label> Choose the type of Subject</label><br>
		<input list="subject" name="subject"><br>
		<datalist id="subject">
			<option value="Science">
			<option value="Math">
			<option value="Social">
		</datalist>
		<button>Submit</button>
<br>
<br>

	</f:form>

</body>
</html>