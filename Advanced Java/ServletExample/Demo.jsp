<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>JSP Scripting Elements Example</title>
</head>
<body>
    <h3>Last Lab Advanced Java- Kishor</h3>
    
    <%-- Declaration Tag: Declaring a method and a variable --%>
    <%! 
        int counter = 0; 
        String greet(String name) {
            return "Hello, " + name + "!";
        }
    %>
    <%-- Scriptlet Tag: Java code execution --%>
    <%
        counter++;  // increase counter
        String username = "Kishor";  
    %>
    <%-- Expression Tag: Directly print values --%>
    <p>Welcome Message: <%= greet(username) %></p>
    <p>Page visited count: <%= counter %></p>
    <p>Today's Date: <%= new java.util.Date() %></p>
</body>
</html>
