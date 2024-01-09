<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<tr>
   <th>Employee id</th>
   <th>Employee name</th>
   <th>Employee Sal</th>
   <th>Edit/Delete</th>
</tr>

<c:forEach var="emp" items="${elist}">
   <tr>
   <td>${elist.id}</td>
   <td>${elist.name}</td>
   <td>${elsit.sal}</td>
   <td><a>Edit</a>/<a>Delete</a><td>
   </tr>
</c:forEach>
</table>
</body>
</html>