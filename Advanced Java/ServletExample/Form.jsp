<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <h2>Enter Student Details</h2>
    <form action="FormResult.jsp" method="post">
        Name: <input type="text" name="name" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        Grade: <input type="text" name="grade" required><br><br>
        Address: <input type="text" name="address"><br><br>
        Phone: <input type="text" name="phone"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
