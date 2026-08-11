<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String step = request.getParameter("step");
    if (step == null) step = "menu";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* Basic Navbar Styling */
.navbar {
  display: flex;
  justify-content: space-evenually;
  align-items: center;
  background-color: #333;
 padding: 10px 20px;
  color: white;
}

.nav-links {
  display: flex;
  list-style: none;
}

.nav-links li {
  margin-left: 20px;
}

.nav-links a {
  color: white;
  text-decoration: none; /* Removes underline */
  font-size: 18px;
}

/* Hover Effect */
.nav-links a:hover {
  color: #04AA6D; /* Changes color on hover */
}

</style>
</head>
<body>
<nav class="navbar">
  <div class="logo">MyBrand</div>
  <ul class="nav-links">
    <li><a href="#home">Add</a></li>
    <li><a href="#about">Sub</a></li>
    <li><a href="#services">Multiplication</a></li>
    <li><a href="#contact">Division</a></li>
  </ul>
</nav>




<%-- ================= PAGE 1: MENU ================= --%>
<% if(step.equals("menu")) { %>

    <h2>Select Operation</h2>

    <form action="calculator.jsp" method="get">
        <input type="hidden" name="step" value="input">

        <input type="radio" name="operation" value="add" > Add <br>
        <input type="radio" name="operation" value="sub"> Subtract <br>
        <input type="radio" name="operation" value="mul"> Multiply <br>
        <input type="radio" name="operation" value="div"> Divide <br><br>

        <input type="submit" value="Next">
    </form>

<% } %>


<%-- ================= PAGE 2: INPUT ================= --%>
<% if(step.equals("input")) { 
    String op = request.getParameter("operation");
%>

    <h2>Enter Numbers</h2>

    <form action="calculator.jsp" method="post">
        <input type="hidden" name="step" value="result">
        <input type="hidden" name="operation" value="<%= op %>">

        Number 1: <input type="text" name="num1" required><br><br>
        Number 2: <input type="text" name="num2" required><br><br>

        <input type="submit" value="Calculate">
    </form>

<% } %>


<%-- ================= PAGE 3: RESULT ================= --%>
<% if(step.equals("result")) { 

    String op = request.getParameter("operation");

    double n1 = Double.parseDouble(request.getParameter("num1"));
    double n2 = Double.parseDouble(request.getParameter("num2"));

    double result = 0;

    if(op.equals("add")) {
        result = n1 + n2;
    } else if(op.equals("sub")) {
        result = n1 - n2;
    } else if(op.equals("mul")) {
        result = n1 * n2;
    } else if(op.equals("div")) {
        if(n2 != 0)
            result = n1 / n2;
        else {
%>
            <h3>Cannot divide by zero</h3>
            <a href="calculator.jsp">Go Back</a>
<%
            return;
        }
    }
%>

    <h2>Result</h2>
    <p>Operation: <%= op %></p>
    <p>Result: <%= result %></p>

    <br>
    <a href="calculator.jsp">Start Again</a>

<% } %>

</body>
</html>










