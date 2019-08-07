<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Tiny Home</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark" > 
 <div class="collapse navbar-collapse" id="navbarColor02">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Tiny List <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/complete">Complete List</a>
      </li>
     
    </ul>
    
  </div>
</nav>

<header  style="text-align:center;  "><h1>Tiny Inventors</h1></header>

<div class="container">

<table class= "table">
<tr>
<th>Name</th>
<th>Invention</th>
<th>Year</th> 
</tr>
<c:forEach items="${list}" var="person">
<tr>
<td>${person.name}</td>
<td>${person.invention}</td>
<td>${person.year }</td>
</tr>
</c:forEach>


</table>
</div>
</body>
</html>