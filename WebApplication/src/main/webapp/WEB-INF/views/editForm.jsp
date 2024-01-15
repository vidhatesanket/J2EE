<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editPlayerInfo" method="get">
       Player id : <input type="number" name="pid" value="${p.pid}" readonly><br>
       Player name : <input type="text" name="pname" value="${p.name}"><br>
       Player Skills: <input type="text" name="pskills" value="${p.skills}"><br>
        <button type="submit" name="btn" id="btn">Edit Info</button>
  </form>
</body>
</html>