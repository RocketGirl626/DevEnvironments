<%@ page contentType="text/html; charset=UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Struts 2 - Development Environments App | Jeanette Fairless</title>  
</head>  
<body>  
<h2>Development Environments | Jeanette Fairless</h2>  
<s:actionerror />  
<s:form action="login.action" method="post">  
    <s:textfield name="devOS" key="label.devOS" size="20" />  
    <s:textfield name="devOSVersion" key="label.devOSVersion" size="20" />  
    <s:textfield name="devNotes" key="label.devNotes" size="40" />  
    <s:submit method="execute" key="label.login" align="center" />  
</s:form>  
</body>  
</html>  