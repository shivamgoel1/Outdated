<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin | Customers</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  </head>
  <body>

   <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/admin/adminhome">Admin</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="${pageContext.servletContext.contextPath}/admin/adminhome">Dashboard</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/doctor/doctorListAdmin">Doctors</a></li>   
            <li><a href="${pageContext.servletContext.contextPath}/service/listServicesAdmin">Medical Services</a></li>
            <li class="active"><a href="${pageContext.servletContext.contextPath}/customer/allCustomers">Customers</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome ${username}</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/logout">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>Customers   <small>Manage</small></h1>
          </div>
<!--           <div class="col-md-2"> -->
<!--             <div class="dropdown create"> -->
<!--               <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> -->
<!--                 Requests -->
<!--                 <span class="caret"></span> -->
<!--               </button> -->
<!--               <ul class="dropdown-menu" aria-labelledby="dropdownMenu1"> -->
<%--                 <li><a type="button" data-toggle="modal" data-target="#makeRequest" href="${pageContext.servletContext.contextPath}/customer/viewMakeRequests">Add Requests</a></li> --%>
<!--                 <li><a href="#">Add Post</a></li> -->
<!--                 <li><a href="#">Add User</a></li> -->
<!--               </ul> -->
<!--             </div> -->
<!--           </div> -->
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li><a href="${pageContext.servletContext.contextPath}/admin/adminhome">Dashboard</a></li>
          <li class="active">Customers</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">
             <a href="${pageContext.servletContext.contextPath}/admin/adminhome" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="${pageContext.servletContext.contextPath}/doctor/doctorListAdmin" class="list-group-item"> <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Doctors<span class="badge"> ${doctors}</span></a>

<%--               <a href="${pageContext.servletContext.contextPath}/doctor/viewDoctorRequests" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Requests <span class="badge">${requests}</span></a> --%>

              <a href="${pageContext.servletContext.contextPath}/service/listServicesAdmin" class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Medical Services <span class="badge"> ${services}</span></a>

              <a href="${pageContext.servletContext.contextPath}/customer/allCustomers" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Customers <span class="badge">${customers}</span></a>
  </div>

            <div class="well">
              <h4>Disk Space Used</h4>
              <div class="progress">
                  <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                      60%
              </div>
            </div>
            <h4>Bandwidth Used </h4>
            <div class="progress">
                <div class="progress-bar" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%;">
                    40%
            </div>
          </div>
            </div>
          </div>
          <div class="col-md-9">
            <!-- Website Overview -->
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Customers</h3>
              </div>
<!--               <div class="panel-body"> -->
<!--                 <div class="row"> -->
<!--                       <div class="col-md-12"> -->
<!--                           <input class="form-control" type="text" placeholder="Filter Pages..."> -->
<!--                       </div> -->
<!--                 </div> -->
                <br>
                <table class="table table-striped table-hover">
                      <tr>
                        <th>Name</th>
      				    <th>ID</th>		
      				    <th>Phone Number</th>
                      </tr>

                      <c:forEach var ="tempservice" items = "${list}">
                          <c:url var = "viewLink" value="/customer/viewcustomerdetailse">
                          <c:param name="id" value="${tempservice.id}"></c:param>
                          </c:url> 
                           <c:url var = "updateLink" value="/customer/updateCustomerAdmin">
                          <c:param name="id" value="${tempservice.id}"></c:param>
                          </c:url>
                          
                           <c:url var = "delete" value="/customer/delete">
                          <c:param name="id" value="${tempservice.id}"></c:param>
                          </c:url>

                      <tr>
                        <td>${tempservice.first_name }</td>
                        <td>${tempservice.id}</td>
                        <td>${tempservice.contact_number}</td>
                        <td><a class="btn btn-default" href="${viewLink}" data-toggle="modal" data-target="#addPage">View</a></td>
                        <td><a class="btn btn-danger" href="${updateLink}" data-toggle="modal" data-target="#UpdatePage">Update</a></td>
                        <td><a class="btn btn-danger" href="${delete}" >Delete</a></td>
                      </tr>
                      </c:forEach>
                    </table>
              </div>
              </div>

          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p>About US!!</p>
    </footer>

    <!-- Modals -->

    <!-- Add Page -->
    <div class="modal fade" id="addPage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Service Description</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Shivam</label>
          <input type="text" class="form-control" placeholder="ID" value="${Description.medicare_service_id}">
        </div>
        <div class="form-group">
          <label>Medicare Service</label>
          <input type="text" class="form-control" placeholder="Service Name" value="${Description.medicare_service}">
        </div>
       <div class="form-group">
          <label>Medicare Service</label>
          <input type="text" class="form-control" placeholder="Service Name" value="${Description.medicare_service}">
        </div>
        <div class="form-group">
          <label>Medicare Service Description</label>
          <textarea name="message" rows="5" cols="40" class="form-control" required readonly>${Description.service_description}</textarea>
        </div>
        <div class="form-group">
          <label>Amount</label>
          <input type="text" class="form-control" placeholder="INR" value="${Description.amount}">
        </div>
      </div>
      <div class="modal-footer">
       <a href="listServicesDoctor"> <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button></a>
<!--         <button type="submit" class="btn btn-primary">Save changes</button> -->
      </div>
    </form>
    </div>
  </div>
</div>



 <div class="modal fade" id="UpdatePage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Service Description</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Shivam</label>
          <input type="text" class="form-control" placeholder="ID" value="${Description.medicare_service_id}">
        </div>
        <div class="form-group">
          <label>Medicare Service</label>
          <input type="text" class="form-control" placeholder="Service Name" value="${Description.medicare_service}">
        </div>
       <div class="form-group">
          <label>Medicare Service</label>
          <input type="text" class="form-control" placeholder="Service Name" value="${Description.medicare_service}">
        </div>
        <div class="form-group">
          <label>Medicare Service Description</label>
          <textarea name="message" rows="5" cols="40" class="form-control" required readonly>${Description.service_description}</textarea>
        </div>
        <div class="form-group">
          <label>Amount</label>
          <input type="text" class="form-control" placeholder="INR" value="${Description.amount}">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </form>
    </div>
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
