<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		form {
			max-width: 400px;
			margin: 0 auto;
			padding: 20px;
			border: 1px solid #ccc;
		}
		input[type="text"], input[type="password"] {
			width: 100%;
			padding: 10px;
			border: 1px solid #ccc;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: white;
			padding: 10px 20px;
			border: none;
		}
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        input[type="submit"]:focus {
            outline: none;
        }
        input[type="text"]:focus, input[type="password"]:focus {
            border-color: #4CAF50;
        }
        .error { color: red; }
    </style>
</head>
<body>
<form action="validateUser" method="post">
	Enter username: <input type="text" name="username">
	Enter password: <input type="password" name="password">
	<input type="submit" value="Login">
</form>
</body>
</html>