<%@ page contentType="text/html; charset=UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Current Development Environments</title>  
</head>  
   
<body>  
	<h2>Development Environments | View All Records</h2>

	<s:iterator  value="list">  
		<fieldset>  
			<s:property value="devOS"/><br/>  
			<s:property value="devOSVersion"/><br/>  
			<s:property value="devNotes"/><br/>    
		</fieldset>  
	</s:iterator>  
	
	
	<a href="Login.jsp">Add a Record</a><br />
	<a href="index.jsp">Home</a>
	
</body>  
</html> 