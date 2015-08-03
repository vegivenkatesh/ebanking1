<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
	<jsp:include page="../header.jsp"/> 
	<div id="menu">
		<ul>
			<li><a href="home">Profile</a></li>
			<li class="current_page_item"><a href="#">Time Sheet</a> </li>
			<li><a href="projectdetails">Project details</a></li> 
		</ul>
	</div>
	<!-- end #menu -->
	<div id="container">
			<h4>TIME SHEET</h4>
			<p>some content related to time sheet of the employee</p> 
		<div style="clear: both;">&nbsp;</div>
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
</div>
</body>
<jsp:include page="../footer.jsp"/> 
</html>