<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
			prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
			prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
	<h3>Add Student Details</h3>
	<from:form method ="post" action ="save">
	Date of Examination:
	<form:input type="date" path="dateOfExaminations" /> <br />
	<form:input path="id" placeholder="id?" /> <br />
	<form:input path="name" placeholder="Name" /> <br />
	<form:input path="subject1" placeholder="subject1" /> <br />
	<form:input path="number" path="marks1" 
				placeholder="Marks 1?" /><br />
				
	<form:input path="subject2" placeholder="Subject2" /> <br />
	<form:input path="number" path="marks2" 
				placeholder="Marks 2?" /><br />
				
	<form:input path="subject3" placeholder="Subject3" /> <br />
	<form:input path="number" path="marks3" 
				placeholder="Marks 3?" /><br />
	<input type="submit" value="save" />
	</from:form>
</body>
</html>