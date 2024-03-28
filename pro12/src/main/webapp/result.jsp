<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String user_id = request.getParameter("user_id");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=user_id %>
<hr>
<% out.print(user_id); %>
<hr>
${hello}
<hr>
{안녕}
<hr>
${user_id}
<hr>
${empty ""}
<hr>
${false}++${null}++
<hr>
${empty null}
</body>
</html>