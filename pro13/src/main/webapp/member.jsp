<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*"%>
  <jsp:useBean id="memberVO" class="sec01.ex01.MemberVO"></jsp:useBean>
  <jsp:setProperty property="*" name="memberVO"/>
  
<%-- <jsp:setProperty property="id" name="memberVO" param="id"/>
 <jsp:setProperty property="pwd" name="memberVO" param="pwd"/>
 <jsp:setProperty property="name" name="memberVO" param="name"/>
 <jsp:setProperty property="email" name="memberVO" param="email"/> --%>
 
    
<%
/*
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String name = request.getParameter("name");
String email = request.getParameter("email");
*/

/* MemberVO memberVO = new MemberVO(id, pwd, name, email);*/
MemberDAO dao = new MemberDAO();
//dao.addMember(memberVO);
List<MemberVO> memberLists = dao.listMembers();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table align="center"  width="100%">
	 <tr align="center" bgcolor="#99ccff">
	      <td width="7%" >아이디</td>
	      <td width="7%">비밀번호</td>
	      <td width="5%" >이름</td>
	      <td width="11%" >이메일</td>
	   </tr>
	   <tr align="center">
	  <td> <jsp:getProperty name="m"  property="id"  /> </td>
          <td> <jsp:getProperty name="m"  property="pwd"  />  </td>
          <td> <jsp:getProperty name="m"  property="name"     /> </td>
          <td> <jsp:getProperty name="m"  property="email"  /> </td>
	   </tr>
	   <tr height="1" bgcolor="#99ccff">
	      <td colspan="5"></td>
	   </tr>
	</table>
</body>
</html>