<%@page import="com.lwl.web.domain.Course"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width: 100%">
		<thead>
			<tr>
				<th>Cid</th>
				<th>Name</th>
				<th>Duration(Hours)</th>
				<th>Fee(INR)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clist}" var="c">
				<tr>
				<td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.duration}</td>
				<td>${c.fee}</td>
				</tr>
			</c:forEach>
			
			
		</tbody>
	</table>
</body>
</html>