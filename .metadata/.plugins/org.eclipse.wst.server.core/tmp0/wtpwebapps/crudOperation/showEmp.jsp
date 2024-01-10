<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<style type="text/css">
		body {
			background-color: #f2f2f2;
			font-family: 'Open Sans', sans-serif; /* Use a Google Font */
		}
		center {
			max-width: 500px;
			margin: 0 auto;
		}
		form {
			padding: 20px;
			border: 1px solid #ddd;
            border-radius: 5px; /* Add rounded corners */
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3); /* Add a subtle box shadow */
            background-color: #fff; /* Change the background color */
            transition: all 0.2s ease-in-out; /* Add a smooth transition effect */
        }
        input[type="number"], input[type="text"] { /* Update styles for input elements */
            width: 90%; /* Set width to full width */
            padding: 15px; /* Increase padding */
            margin-bottom: 20px; /* Increase margin between elements */
            border: none; /* Remove border styles */
            border-radius: 5px; /* Add rounded corners */
            background-color: #f2f2f2; /* Change the background color */
            color: #444; /* Change the text color */
            font-size: 18px; /* Increase font size */
            transition: all 0.2s ease-in-out; /* Add a smooth transition effect */
            outline: none; /* Remove the default outline */
        }
        input[type="number"]:focus, input[type="text"]:focus { /* Add a focus style */
            box-shadow: 1px 1px 5px rgba(82, 176, 234, 0.5); /* Change the box shadow color */
        }
        input[type="submit"] { /* Update styles for update button */
            background-color: #4CAF50; /* Change the background color */
            color: white; /* Change the text color */
            padding: 15px 30px; /* Increase padding */
            border: none; /* Remove border styles */
            border-radius: 5px; /* Add rounded corners */
            cursor: pointer; /* Add a pointer cursor on hover */
            transition: all 0.2s ease-in-out; /* Add a smooth transition effect */
        }
        input[type="submit"]:hover { /* Add a hover style for update button */
            background-color: #3e8e41; /* Change the background color on hover */
        }   </style> 
</head>
	<body>
		<div>
			<center>
				<form action="updateEmp" method="post">
					Employee id<input type="number" name="employeeid" value=${emp.id } readonly/><br>
					Employee name<input type="text" name="employeename" value=${emp.name } /><br>
					Employee Sal <input type="number" name="employeesal" value=${emp.sal } /><br>
					<input type="submit" value="Update Details" >
				</form>
			</center>
		</div>
	</body>
</html>