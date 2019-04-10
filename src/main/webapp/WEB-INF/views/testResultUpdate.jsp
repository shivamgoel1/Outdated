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
      <form action="/DiagnosticCentre/request/saveResult" method="Post" modelAttribute="result">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Report Update</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>ID</label>
          <input type="text" class="form-control" placeholder="ID" value="${result.id}" name="id" required readonly>
        </div>
         <input id=customerId type="hidden" value="${result.cid}" name="cid" required> 
    
    <input id=doctorId type="hidden" value="${result.did}" name="did" required> 
    
    <input id=serviceId type="hidden" value="${result.serviceID}" name="serviceID" required> 
    
 	<input id=resultDateId type="hidden" value="${result.result_date}" name="result_date" required>
 	
 	<input id=statusId type="hidden" value="${result.status}" name="status" required>
 	
 	<input id=serviceDateId type="hidden" value="${result.date}" name="date" required>
        <div class="form-group">
          <label>Diag 1 Actual Value</label>
          <input type="text" class="form-control" placeholder="Enter D1 Actual Value" value="${result.d1_actual}" name="d1_actual"  required >
        </div>
       <div class="form-group">
          <label>Diag 1 Normal Range</label>
          <input type="text" class="form-control" placeholder="Enter D1 Normal Range" value="${result.d1_normal}" name="d1_normal"  required >
        </div>
        <div class="form-group">
          <label>Diag 2 Actual Value</label>
          <input type="text" class="form-control" placeholder="Enter D2 Actual Value" value="${result.d2_actual}" name="d2_actual"  required >
        </div>
        <div class="form-group">
          <label>Diag 2 Normal Range</label>
          <input type="text" class="form-control" placeholder="Enter D2 Normal Range" value="${result.d2_normal}" name="d2_normal"  required>
        </div>
        <div class="form-group">
          <label>Comments</label>
          <input type="text" class="form-control" placeholder="Enter Comments" value="${doctor.comment}" name="comment"  required>
        </div>
        <div class="form-group">
          <label>Other Info.</label>
          <input type="text" class="form-control"  placeholder="Enter Any other information" value="${doctor.other_info}" name="other_info"  required  >
        </div>
      </div>
      <div class="modal-footer">
       <a href="viewAcceptedRequests"> <button type="button" class="btn btn-default" >Close</button></a>
        <button type="submit" class="btn btn-primary">Save Report</button>
      </div>
    </form>
    </div>
  </div>
  </body>
  </html>