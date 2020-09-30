<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.MyButton {
	width:210px;
	padding:20px;
	cursor:pointer;
	font-weight:bold;
	line-height:75px;
	font-size:100%;
	text-decoration:none;
	background:#3366cc;
	color:#fff;
	border:1px solid #3366cc;
	border-radius:10px;
	box-shadow:6px 6px 5px #999;
	
}
.MyButton:hover {
	color:#ffff00;
	background:#000;
	border:1px solid #fff;
}
</style>
</head>
<body bgcolor="grey">
<center>
<form>
			<div>
	<a class="MyButton" href="/studentForm.jsp" target="display">
			Add Student Details</a>
			</div>
			<div>
	<a class="MyButton" href="test.jsp" target="display">
			Get student details by id</a>
			</div>
			<div>
	<a class="MyButton" href="test.jsp" target="display">
			get all student details</a>
			</div>
			<div>
	<a class="MyButton" href="test.jsp" target="display">
			update the student detail</a>
			</div>
			<div>
	<a class="MyButton" href="test.jsp" target="display">
			remove the detail</a>
			</div>
			
<!-- 	<input class="MyButton" type ="button" value="Get Student Details by id"
			onClick = "window.location.href=''" />
			<br /><br />
	<input class="MyButton" type ="button" value="Get all student details"
			onClick = "window.location.href=''" />
			<br /><br />
	<input class="MyButton" type ="button" value="update Student Details"
			onClick = "window.location.href=''" />
			<br /><br />
	<input class="MyButton"type ="button" value="remove Student Details"
			onClick = "window.location.href=''" /> -->
			
			
			
</form>
</center>
</body>
</html>

<%-- -moz-box-shadow:6px 6px 5px #999;
	 -webkit-box-shadow:6px 6px 5px #999; --%>