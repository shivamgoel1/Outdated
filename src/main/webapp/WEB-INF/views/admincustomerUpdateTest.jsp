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
     <!-- Modals -->

    <!-- Add Page -->
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form action="saveAdminCustomer" method="Post" modelAttribute="customer">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Service Description</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Customer Id</label>
          <input type="text" class="form-control" placeholder="ID" value="${customer.id}" name="id" readonly>
        </div>
        <div class="form-group">
          <label>First Name:</label>
          <input type="text" class="form-control" placeholder="Service Name" value="${customer.first_name}" name="first_name" >
        </div>
        <div class="form-group">
          <label>Last Name</label>
           <input type="text"class="form-control" required value="${customer.last_name}" name="last_name">
        </div>
        <div class="form-group">
          <label>Contact Number</label>
          <input type="text" class="form-control" placeholder="INR" value="${customer.contact_number}" name="contact_number">
        </div>
         <div class="form-group">
          <label>Alternate Contact Number</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.alternate_contact_number}" name="alternate_contact_number">
        </div>
        
        <div class="form-group">
          <label>E-Mail</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.email_id}" name="email_id">
        </div>
         <div class="form-group">
          <label>Age</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.age}" name="age">
        </div>
         <div class="form-group">
          <label>Gender</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.gender}" name="gender">
        </div>
         <div class="form-group">
          <label>Date Of Birth</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.dob}" name="dob">
        </div>
         <div class="form-group">
          <label>Address</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.address_1}" name="address_1">
        </div>
         <div class="form-group">
          <label>Address_2</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.address_2}" name="address_2">
        </div>
         <div class="form-group">
          <label>City</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.city}" name="city">
        </div>
         <div class="form-group">
          <label>State</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.state}" name="state">
        </div>
         <div class="form-group">
          <label>Zip_code</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${customer.zip_code}" name="zip_code">
        </div>
        
      </div>
      <div class="modal-footer">
        <a href="allCustomers"> <button type="button" class="btn btn-default" >Close</button></a>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </form>
    </div>
  </div>
	

  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
