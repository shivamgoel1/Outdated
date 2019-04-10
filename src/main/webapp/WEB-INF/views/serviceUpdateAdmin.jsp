<%-- <%@page import="com.cts.entity.Services"%> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>s
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Medical Service</title>
</head>
<body>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.addbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.addbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>


<form action="saveServiceAdmin" method="Post" modelAttribute="service">
  <div class="container">
    <h1>Update Medical Service</h1>
    <hr>
    
    <input id=serviceId type="hidden" value="${service.medicare_service_id}" name="medicare_service_id" required>
 	
    <label for="name"><b>Name</b></label>
    <input id=nameId type="text"  placeholder="Enter Medical Service Name" value="${service.medicare_service}" name="medicare_service"  required  >
 
   <label for="description"><b>Description</b></label>
    <input id=servicedescription type="text" placeholder="Enter Desc" value="${service.service_description}" name="service_description" required>
  

    <label for="amount"><b>Amount</b></label>
    <input id=amountId type="text" placeholder="Enter Amount" value="${service.amount}" name="amount"  required>
    

    <button type="submit" class="addbtn">Update Service</button>
  </div>

</form>
</body>
</html>