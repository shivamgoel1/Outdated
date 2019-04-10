<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer | Dashboard</title>
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
          <a class="navbar-brand" href="#">Doctor</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="${pageContext.servletContext.contextPath}/customer/servicelist">Dashboard</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/customer/doctorList">Doctors</a></li>   
            <li><a href="${pageContext.servletContext.contextPath}/service/listServicesCustomer">Medical Services</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/customer/viewRequest">Appointments/Requests</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/customer/viewReports">View Reports
            </a></li>
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
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Customer  <small>Dashboard </small></h1>
          </div>
          <div class="col-md-2">
            <div class="dropdown create">
              <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Profile
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a type="button" data-toggle="modal" data-target="#UpdateProfile" href=updateCustomer>Update Profile</a></li>
<!--                 <li><a href="#">Add Post</a></li> -->
<!--                 <li><a href="#">Add User</a></li> -->
              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li class="active">Dashboard</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">

              <a href="${pageContext.servletContext.contextPath}/customer/servicelist" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="${pageContext.servletContext.contextPath}/customer/doctorList" class="list-group-item"> <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Doctors<span class="badge"> ${doctors}</span></a>

<%--               <a href="${pageContext.servletContext.contextPath}/doctor/viewDoctorRequests" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Requests <span class="badge">${requests}</span></a> --%>

              <a href="${pageContext.servletContext.contextPath}/service/listServicesCustomer" class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Medical Services <span class="badge"> ${services}</span></a>

              <a href="${pageContext.servletContext.contextPath}/customer/viewRequest" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Appointments/Requests <span class="badge">${appointments}/${requests }</span></a>

              <a href="${pageContext.servletContext.contextPath}/customer/viewReports" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Reports <span class="badge"> ${reports	}</span></a>
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
                <h3 class="panel-title">Dashboard</h3>
              </div>
              <div class="panel-body">
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>  ${doctors}</h2>
                    <h4>Doctors</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> ${services}</h2>
                    <h4>Medical Services</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> ${appointments}/${requests}</h2>
                    <h4>Appointments / Requests</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-stats" aria-hidden="true"></span>  ${reports	}</h2>
                    <h4>Total Reports</h4>
                  </div>
                </div>
              </div>
              </div>

              <!-- Latest Users -->
              <div class="panel panel-default">
                <div class="panel-heading">
                  <h3 class="panel-title"></h3>
                </div>
                <div class="panel-body">
                  <table class="table table-striped table-hover">
                      <tr>
                      	<th>ID</th>
                        <th>Name</th>
                        <th>Last Name</th>
                        <th>Contact Number</th>
                        <th>E-Mail</th>
                        
                      </tr>
                      <tr>
                      	<td>${customer.id}</td>
                        <td>${customer.first_name}</td>
                        <td>${customer.last_name}</td>
                        <td>${customer.contact_number}</td>
                        <td>${customer.email_id}</td>
                      </tr>
                      
                    </table>
                </div>
              </div>
          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p>Copyright AdminStrap, &copy; 2017</p>
    </footer>

    <!-- Modals -->

    <!-- Add Page -->
    <div class="modal fade" id="UpdateProfile" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Page</h4>
      </div>
     <form action="saveDoctor" method="Post" modelAttribute="doctor">
      <div class="modal-body">
        <div class="form-group" >
          <label>Page Title</label>
          <input type="text" class="form-control" placeholder="Page Title">
        </div>
        <div class="form-group">
          <label>Page Body</label>
          <textarea name="editor1" class="form-control" placeholder="Page Body"></textarea>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> Published
          </label>
        </div>
        <div class="form-group">
          <label>Meta Tags</label>
          <input type="text" class="form-control" placeholder="Add Some Tags...">
        </div>
        <div class="form-group">
          <label>Meta Description</label>
          <input type="text" class="form-control" placeholder="Add Meta Description...">
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
