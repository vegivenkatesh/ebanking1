<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page import="java.util.*" %>
<!DOCTYPE html><!--HTML5 doctype-->
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"> 
<meta name="keywords" content="" />
<meta name="description" content="" />
<title>E-Worker Tracker</title>
<!--  <link href="style.css" rel="stylesheet" type="text/css" media="screen" /> -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />   
<link href='css/medium.css' rel='stylesheet' type="text/css" media='screen and (min-width: 701px) and (max-width: 900px)'/>
<link rel='stylesheet' media='screen and (max-width: 700px)' href='css/narrow.css' />
</head>
<body>
<div id="wrapper">
	<jsp:include page="header.jsp"/> 
	<div id="container">
			<div style="clear: both;">&nbsp;</div>
			<div style="clear: both;">&nbsp;</div>
			<div style="clear: both;">&nbsp;</div>
			<h4>ERROR PAGE</h4>
			<div style="clear: both;">&nbsp;</div>
			<p>OOPS...! Sorry...! Something went wrong. </br>
			<h5>Error message: <% out.println(request.getAttribute("errormsg")); %></h5>
			Please check your username and password are correct or please try again later.</p> 
		<div style="clear: both;">&nbsp;</div>
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
</div>
</body>
<jsp:include page="footer.jsp"/> 
</html>