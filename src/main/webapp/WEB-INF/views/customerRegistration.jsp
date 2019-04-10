<html>
<title>Diagnostic Medicare Center</title>
<head>
 <meta charset="utf-8">
  <meta name="viewport" type="text/css" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
 
  .bg
  {
  background:url('img/2.jpg') no-repeat;
  height: 100vh; 
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
  .form-container
  {
  
  border:0px solid #fff;
  margin-left:-450px;
  margin-top:15px;
 
  -webkit-box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
-moz-box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
  }
 .form-control
 {
 margin-bottom:20px;
 }
  
  </style>
 </head>
<body>
<div class="container-fluid bg">
<div class="row">
<div class="col-md-4 col-sm-4 col-xs-12"></div>
<div class="col-md-4 col-sm-4 col-xs-12">
<form class="form-container" action="saveCustomer" method="post">
  <div class="form-group">
  <h1>Customer Registration</h1>
   
<!--      <div class="col-xs-6"> -->
<!--     <input type="text" class="form-control" id="CustomerID" placeholder="CustomerID" required> -->
<!--     </div> -->
    
    <div class="col-xs-6">
    <input type="text" class="form-control" name="firstname" placeholder="First Name" required>
    </div>
    
    <div class="col-xs-6">
    <input type="text" class="form-control" name="lastname" placeholder="Last Name">
    </div>
    
    <div class="col-xs-6">
    <input type="text" class="form-control" name="age" placeholder="Age" required>
    </div>
   
   <div class="col-xs-6">
    <input type="text" class="form-control" name="gender" placeholder="Gender" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="dob" placeholder="DoB" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="contactnumber" placeholder="Contact Number" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="altcontactnumber" placeholder="Alt Contact Number">
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="emailid" placeholder="Email ID" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="password" placeholder="Password" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="addressline" placeholder="Address Line 1" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="addressline2" placeholder="Address Line 2" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="city" placeholder="City" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="state" placeholder="State" required>
    </div>
    <div class="col-xs-6">
    <input type="text" class="form-control" name="zipcode" placeholder="Zip Code" required>
    </div>
    
  </div>
  
 <button type="submit" class="btn btn-success btn-block">Submit</button>
</form>
</div>
</div>
</div>
</body>
</html>