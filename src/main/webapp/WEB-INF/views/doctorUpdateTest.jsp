<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Doctor | Services</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  </head>
<body>

  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form action="saveDoctor" method="Post" modelAttribute="doctor">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Report Update</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>ID</label>
          <input type="hidden" class="form-control" placeholder="ID" value="${doctor.id}" name="id" required>
        </div>
<%--          <input id=customerId type="hidden" value="${result.cid}" name="cid" required>  --%>
    
<%--     <input id=doctorId type="hidden" value="${result.did}" name="did" required>  --%>
    
<%--     <input id=serviceId type="hidden" value="${result.serviceID}" name="serviceID" required>  --%>
    
<%--  	<input id=resultDateId type="hidden" value="${result.result_date}" name="result_date" required> --%>
 	
<%--  	<input id=statusId type="hidden" value="${result.status}" name="status" required> --%>
 	
<%--  	<input id=serviceDateId type="hidden" value="${result.date}" name="date" required> --%>
        <div class="form-group">
          <label>First Name</label>
          <input type="text" class="form-control"placeholder="Enter First Name" value="${doctor.firstname}" name="firstname"  required   >
        </div>
       <div class="form-group">
          <label>Last Name</label>
          <input type="text" class="form-control" placeholder="Enter Last Name" value="${doctor.lastname}" name="lastname"  required >
        </div>
        <div class="form-group">
          <label>Age</label>
          <input type="text" class="form-control"  placeholder="Enter Age" value="${doctor.age}" name="age"  required  >
        </div>
        <div class="form-group">
          <label>Date Of Birth</label>
          <input type="text" class="form-control"  placeholder="Enter DOB" value="${doctor.dob}" name="dob"  required >
        </div>
        <div class="form-group">
          <label>Contect Number</label>
          <input type="text" class="form-control" placeholder="Enter Contact No." value="${doctor.contactnumber}" name="contactnumber"  required>
        </div>
        <div class="form-group">
          <label>Alternate Contect Number</label>
          <input type="text" class="form-control"  placeholder="Enter Alternate Contact No." value="${doctor.atlcontactnumber}" name="atlcontactnumber"  required >
        </div>
         <div class="form-group">
          <label>Email Id</label>
          <input type="text" class="form-control"  placeholder="Enter e-Mail" value="${doctor.email}" name="email"  required >
        </div>
         <div class="form-group">
          <label>Address</label>
          <input type="text" class="form-control" placeholder="Enter Address line 1" value="${doctor.addressline1}" name="addressline1"  required >
        </div>
         <div class="form-group">
          <label>Address 2</label>
          <input type="text" class="form-control"  placeholder="Enter Address line 2" value="${doctor.addressline2}" name="addressline2"  required>
        </div>
         <div class="form-group">
          <label>City</label>
          <input type="text" class="form-control" placeholder="Enter City" value="${doctor.city}" name="city"  required  >
        </div>
         <div class="form-group">
          <label>State</label>
          <input type="text" class="form-control" placeholder="Enter State" value="${doctor.state}" name="state"  required >
        </div>
         <div class="form-group">
          <label>Zipcode</label>
          <input type="text" class="form-control" placeholder="Enter Zipcode" value="${doctor.zipcode}" name="zipcode"  required  >
        </div>
         <div class="form-group">
          <label>Degree</label>
          <input type="text" class="form-control" placeholder="Enter Degree" value="${doctor.degree}" name="degree"  required  >
        </div>
         <div class="form-group">
          <label>Speciality</label>
          <input type="text" class="form-control"  placeholder="Enter Speciality" value="${doctor.specialty}" name="specialty"  required >
        </div>
         <div class="form-group">
          <label>Work-Hours</label>
          <input type="text" class="form-control"  placeholder="Enter Working Hours" value="${doctor.work_hours}" name="work_hours"  required  >
        </div>
         <div class="form-group">
          <label>Hospital]</label>
          <input type="text" class="form-control" placeholder="Enter Hospital Name" value="${doctor.hospital}" name="hospital"  required  >
        </div>
         <div class="form-group">
          <label>Medical Service Id</label>
          <input type="text" class="form-control" placeholder="Enter Service ID" value="${doctor.medical_service_id}" name="medical_service_id"  required >
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