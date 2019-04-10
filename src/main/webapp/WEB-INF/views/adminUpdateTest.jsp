<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin | Profile</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  </head>
<body>

  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form action="saveAdmin" method="Post" modelAttribute="admin">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Update Profile</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>ID</label>
          <input id=AdminId type="hidden" value="${admin.id}" name="id" required>
        </div>
<%--          <input id=customerId type="hidden" value="${result.cid}" name="cid" required>  --%>
    
<%--     <input id=doctorId type="hidden" value="${result.did}" name="did" required>  --%>
    
<%--     <input id=serviceId type="hidden" value="${result.serviceID}" name="serviceID" required>  --%>
    
<%--  	<input id=resultDateId type="hidden" value="${result.result_date}" name="result_date" required> --%>
 	
<%--  	<input id=statusId type="hidden" value="${result.status}" name="status" required> --%>
 	
<%--  	<input id=serviceDateId type="hidden" value="${result.date}" name="date" required> --%>
        <div class="form-group">
          <label>First Name</label>
          <input type="text" class="form-control" placeholder="Enter First Name" value="${admin.firstname}" name="firstname"  required  >
        </div>
       <div class="form-group">
          <label>Last Name</label>
          <input type="text" class="form-control"  placeholder="Enter Last Name" value="${admin.lastname}" name="lastname"  required  >
        </div>
        <div class="form-group">
          <label>Age</label>
          <input type="text" class="form-control" placeholder="Enter Age" value="${admin.age}" name="age"  required >
        </div>
        <div class="form-group">
          <label>Gender</label>
          <input type="text" class="form-control"   placeholder="Enter Age" value="${admin.gender}" name="gender"  required  >
        </div>
        <div class="form-group">
          <label>Date Of Birth</label>
          <input type="text" class="form-control" placeholder="Enter DOB" value="${admin.dob}" name="dob"  required  >
        </div>
        
         <div class="form-group">
          <label>Contect Number </label>
          <input type="text" class="form-control" placeholder="Enter Contact No." value="${admin.contactnumber}" name="contactnumber"  required >
        </div>
         <div class="form-group">
          <label>Alternate Contect Number </label>
          <input type="text" class="form-control"  placeholder="Enter Alternate Contact No." value="${admin.atlcontactnumber}" name="atlcontactnumber"  required>
        </div>
         <div class="form-group">
          <label>E-Mail</label>
          <input type="text" class="form-control"  placeholder="Enter e-Mail" value="${admin.email}" name="email"  readonly  >
        </div>
        
        
      </div>
      <div class="modal-footer">
       <button type="button" class="btn btn-default"  data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save Changes</button>
      </div>
    </form>
    </div>
  </div>
  </body>
  </html>