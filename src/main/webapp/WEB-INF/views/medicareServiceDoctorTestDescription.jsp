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
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Service Description</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Medicare Service Id</label>
          <input type="text" class="form-control" placeholder="ID" value="${description.medicare_service_id}" readonly>
        </div>
        <div class="form-group">
          <label>Medicare Service</label>
          <input type="text" class="form-control" placeholder="Service Name" value="${description.medicare_service}" readonly>
        </div>
        <div class="form-group">
          <label>Medicare Service Description</label>
          <textarea name="message" rows="5" cols="40" class="form-control" required readonly>${description.service_description}</textarea>
        </div>
        <div class="form-group">
          <label>Amount</label>
          <input type="text" class="form-control" placeholder="INR" value="${description.amount}" readonly>
        </div>
        
        <div class="form-group">
          <label>Diagnostic 1 Normal Range</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${description.d1_normal}" readonly>
        </div>
        
         <div class="form-group">
          <label>Diagnostic 2 Normal Range</label>
          <input type="text" class="form-control" placeholder="Enter Range" value="${description.d2_normal}" readonly>
        </div>
        
      </div>
      <div class="modal-footer">
        <a href="listServicesDoctor"> <button type="button" class="btn btn-default" >Close</button></a>
<!--         <button type="submit" class="btn btn-primary">Save changes</button> -->
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
