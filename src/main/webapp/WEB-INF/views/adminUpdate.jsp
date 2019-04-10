<%@page import="com.cts.entity.Services"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Doctor Details</title>
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


<form action="saveAdmin" method="Post" modelAttribute="admin">
  <div class="container">
    <h1>Update Doctor Details</h1>
    <hr>
    
    <input id=AdminId type="hidden" value="${admin.id}" name="id" required>
 	
    <label for="fname"><b>First Name</b></label>
    <input id=fnameId type="text"  placeholder="Enter First Name" value="${admin.firstname}" name="firstname"  required  >
 
 	 <label for="lname"><b>Last Name</b></label>
    <input id=lnameId type="text"  placeholder="Enter Last Name" value="${admin.lastname}" name="lastname"  required  >
   
    <label for="age"><b>Age</b></label>
    <input id=ageId type="text"  placeholder="Enter Age" value="${admin.age}" name="age"  required  >
    
    <label for="dob"><b>Date of Birth</b></label>
    <input id=dobId type="text"  placeholder="Enter DOB" value="${admin.dob}" name="dob"  required  >
    
     <label for="dob"><b>Gender</b></label>
    <input id=dobId type="text"  placeholder="Enter DOB" value="${admin.gender}" name="gender"  required  >
   
    
    <label for="contact_no"><b>Contact No.</b></label>
    <input id=contactId type="text"  placeholder="Enter Contact No." value="${admin.contactnumber}" name="contactnumber"  required  >
    
    <label for="contact_no"><b>Alternate Contact No.</b></label>
    <input id=contactId type="text"  placeholder="Enter Contact No." value="${admin.atlcontactnumber}" name="atlcontactnumber"  required  >
    
    
    <label for="email"><b>E-mail</b></label>
    <input id=emailId type="text"  placeholder="Enter e-Mail" value="${admin.email}" name="email" readonly>
    
  
    <button type="submit" class="addbtn">Update My Details</button>
  </div>

</form>
</body>
</html>