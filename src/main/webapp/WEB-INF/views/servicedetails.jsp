<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cts.entity.Doctor"%>
<%@page import="com.cts.entity.Services"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!------ Include the above in your HEAD tag ---------->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<style>
    body {
     background: url('https://images.pexels.com/photos/40568/medical-appointment-doctor-healthcare-40568.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940') fixed;
    background-size: cover;
}

*[role="form"] {
   width: 530px;
    padding: 15px;
    margin: 0 auto;
    border-radius: 0.3em;
    background-color: #659DBD ;
    color:#242582;
    font-weight: 600;
    font-family: "Roboto", sans-serif;
   
}
.form-control{

    background-color: #DAAD86;
    font-weight: 600;
    
}

*[role="form"] h2 { 
    font-family: 'Open Sans' , sans-serif;
    font-size: 40px;
    font-weight: 600;
    color: #242582;
    margin-top: 5%;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 4px;
    font-family: "Roboto", sans-serif;
 
   
}


    #myList
{
    background-color: #DAAD86; 
    font-family: "Roboto", sans-serif;
    font-weight: 600;
}


li a {
  display: block;
  color: #242582;
  padding: 8px 16px;
  text-decoration: none;
}

 a.active {
  background-color: #DAAD86;
  color: red;
}
li a:hover:not(.active) {
  background-color: #DAAD86;
  color: red;
}
    </style>
   
<div class="container">
        <form class="form-horizontal" role="form">
            <h2>Medicare Service</h2>
            <div class="form-group">
                <label for="Medicare Service Id" >Medicare Service Id</label>
                <div class="col-sm-9">
                    <input type="text" id="id"  class="form-control" autofocus required readonly value="${service.medicare_service_id}">
                </div>
            </div>
            <div class="form-group">    
                <label for="Medicare Service" ">Medicare Service</label>
                <div class="col-sm-9">
            <input type="text" id="service"  class="form-control"  required readonly value="${service.medicare_service}">
                </div>
            </div>
            <div class="form-group">
                <label for="Description" >Medicare Service Description</label>
                <div class="col-sm-9">
 <textarea name="message" rows="5" cols="40" class="form-control" required readonly>${service.service_description}</textarea>
                </div>
            </div>
         
            <div class="form-group">
                <label for="address" >Amount</label>
                <div class="col-sm-9">
                    <input type="Amount" id="Amount"  class="form-control" required readonly value="${service.amount}">   
                </div>
            </div>
          
           
        
      <a href="listServicesDoctor" button type="button" class="btn btn-primary">Done</button></a>
        </form> <!-- /form -->
    </div> <!-- ./container -->



    <!-- <input type="text" id="age"  class="form-control"  required> -->