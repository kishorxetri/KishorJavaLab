<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
    <h2>Student Details</h2>
    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String grade = request.getParameter("grade");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
    %>

    <p><strong>Name:</strong> <%= name %></p>
    <p><strong>Email:</strong> <%= email %></p>
    <p><strong>Grade:</strong> <%= grade %></p>
    <p><strong>Address:</strong> <%= address %></p>
    <p><strong>Phone:</strong> <%= phone %></p>
</body>
</html>
