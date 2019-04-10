<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <base href="/DiagnosticCentre"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body, html {
background-image: url("img/side.jpg");
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("/img/side.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
.center-block {
  top:50%;
  left: 75%;
  transform: translate3d(-50%,-50%, 0);
  position: absolute;
}
.card {
  /* Add shadows to create the "card" effect */
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.5);
  transition: 0.3s;
}

/* On mouse-over, add a deeper shadow */
.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

/* Add some padding inside the card container */
.container {
  padding: 15px 20px;
}
#header {
    background-color: rgba(0, 0, 0, 0.7);
    color: white;
    position: fixed;
    top:;
    left: 0;
    width: 100%;
    height: 15%;
    padding: 0;
    margin:0;
    align: center;
}
#header #header-content {
    margin: 10px;
}




</style>
<body>
	
	
	<c:if test="${alertMsg}">
	<script>
	alert("Your details are submitted successfully");
	</script>
	</c:if>
	
	<div id="header" align="center">
	<h1 style="font-family:Helvetica;" align="center"><i>Grizzly Store</i></h1>
	</div>

<div class="bg">

<div class="container h-80">
<div class="row align-items-center h-100"  >

	 <div class="center-block">
        <div class="text-center">
	<form class="card" opacity=0.5 action="loginAction" method="post">
	<div class=""></div>
    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="username" required autofocus class="form-control form-group">

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Password" name="password" required autofocus class="form-control form-group">

      <button  class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Login</button>
    </div>
      </form>
    </div>

<a href="registerCustomer">Register</a>
</div>
</div>		
</div>
</div>		
</div>

</body>
</html>