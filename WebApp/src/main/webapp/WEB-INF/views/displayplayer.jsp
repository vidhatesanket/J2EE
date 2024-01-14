<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Player Details</h1>
<table border="2">
  <tr >
     <th>Player pid</th>
     <th>Player pname</th>
     <th>skills</th>
     <th>action</th>
  </tr>
  <c:forEach var="p" items="${plist}">
     <tr>
       <td>${p.pid}</td>
       <td>${p.name}</td>
       <td>${p.skills	}</td>
       <td><a href="delete/${p.pid}">delete</a>
       /
       <a href="edit/${p.pid}">edit</a></td>
     </tr>
  </c:forEach>
</table>
<a href="addPlayer">Add new Player</a>
</body>
</html>