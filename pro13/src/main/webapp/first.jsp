<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
첫 페이지 <br>
<a href="second.jsp?name=홍길동">두번째 페이지</a>

<%-- <%
RequestDispatcher requestDispatcher = request.getRequestDispatcher("second.jsp");
requestDispatcher.forward(request, response);
%> --%>

<jsp:forward page="second.jsp"></jsp:forward>
</body>
</html>