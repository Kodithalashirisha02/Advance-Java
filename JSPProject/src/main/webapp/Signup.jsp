<%@ page import="java.sql.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
</head>
<body>

<form action="Signup.jsp" method="post">
Name:<input type="text" name="name" value="omsha"><br>
Email:<input type="email" name="email" value="omsha@0202"><br>
Password:<input type="password" name="password" value="omsha"><br>
Number:<input type="tel" name="number" value="9347340236"><br>
<button type="submit">Signup</button>
</form>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("password");
String number = request.getParameter("number");

String requestType = request.getMethod();

if(name != null && !name.isEmpty() &&
   email != null && !email.isEmpty() &&
   password != null && !password.isEmpty() &&
   number != null && !number.isEmpty() &&
   requestType.equalsIgnoreCase("POST")) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
        		  "jdbc:mysql://localhost:3306/hospital1", "root", "password");

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO users(name,email,password,number) VALUES(?,?,?,?)");

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4, number);

        int i = ps.executeUpdate();

        if(i > 0) {
%>
            <h3>Signup Successful!</h3>
<%
        } else {
%>
            <h3>Signup Failed!</h3>
<%
        }

        con.close();

    } catch(Exception e) {
%>
      <h3>Error: <%= e.getMessage() %></h3>  
<%
    }
}
%>

</body>
</html>






