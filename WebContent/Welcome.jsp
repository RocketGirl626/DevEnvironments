<%@ page contentType="text/html; charset=UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Current Development Environments</title>  
</head>  
   
<body>  
	<h2>Development Environments</h2>
	<ul>
		<li>
			OS:  <s:property value="devOS"></s:property>
			<ul>
				<li>OS Version:  <s:property value="devOSVersion"></s:property></li>
				<li>OS Notes:  <s:property value="devNotes"></s:property></li>
			</ul>
		</li>
	</ul>
 
</body>  
</html> 