	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
<script>

</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    	int num = Integer.parseInt(request.getParameter("num"));
    %>
    <table style="width: 800px; margin: 0;" border = "1">
        <tr bgcolor=yellow>
	    <th colspan="2"><%=num + " 단 출력" %>
        </tr>
    <%
    	for(int i = 1 ; i <= 9 ; i++) {
    %>
        <tr>
            <th><%=num + " * " + i %></th>
            <th><%=num * i %></th>
        </tr>
    <%
    	}
    %>
    </table>
</body>
</html>