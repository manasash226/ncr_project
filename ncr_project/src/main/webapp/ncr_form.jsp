<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="ncrservlet">
<label>Enter n value:</label>
<input name="n" type="number">
<label>Enter r value:</label>
<input name="" type="number">
<input type="submit" value="submit">
</form>
NCR_Ans= <%=request.getAttribute("NCR_Ans") %>

</body>
</html>