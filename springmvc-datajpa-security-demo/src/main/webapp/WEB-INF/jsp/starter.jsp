<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<%@page import="com.sivalabs.springapp.web.controllers.UserController"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/tags/taglib.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>AdminLTE 2 | Dashboard</title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<!-- Bootstrap 3.3.2 -->
<link href="${resouceUrl}bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<!-- Font Awesome Icons -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link
	href="http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css"
	rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="${resouceUrl}dist/css/AdminLTE.min.css" rel="stylesheet"
	type="text/css" />
<!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
<link href="${resouceUrl}dist/css/skins/skin-blue.min.css"
	rel="stylesheet" type="text/css" />
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the 
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |  
  |---------------------------------------------------------|
  -->
  <script>
//   $(document).ready(function name() {
// 	  $('${menu.size()}').each(function(){
// 		alert('${menu.size()}') ; 
// 	  });
// 	  $("#divMenu").click(function() {
// 		  var menu = ${menu.size()};
// // 		  $.each('${menu}', function( index, value) {
// // 			  alert( index );
// // 			});

// 		var x = ${menu};
// 				alert('${x.get(1).getName()}');
// // 		for (x in '${menu}') {
// // 			if(x.getChildId() == null)
// // 		}
// 		});
// 	});
  </script>
<body class="skin-blue">
	<div class="wrapper">

		<!-- Main Header -->
		<%@ include file="/WEB-INF/templates/header.jsp"%>
		<!-- Left side column. contains the logo and sidebar -->
		<%@ include file="/WEB-INF/templates/menu.jsp"%>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Page Header <small>Optional description</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
					<li class="active">Here</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="box box-warning">
					<div class="row">
						<div class="col-md-6">
							<div class="box-header">
								<h3 class="box-title">Create Object</h3>
							</div>
							<div class="box-body">
								<%-- 						<form:form  commandName="field" method="POST" action="addFields"> --%>
								<!-- 							<div class="row"> -->
								<!-- 								<table> -->
								<!-- 									<tr> -->
								<!-- 										<td>School Management Fields</td> -->
								<%-- 										<td><form:input path="name" ></form:input></td> --%>
								<!-- 										<td>Type</td> -->
								<%-- 										<td><form:input path="type" ></form:input></td> --%>
								<!-- 									</tr> -->
								<!-- 									<tr> -->
								<!-- 										<td> -->
								<!-- 											<input type="submit" value="Submit"/> -->
								<!-- 										</td> -->
								<!-- 									</tr> -->
								<!-- 								</table> -->
								<!-- 							</div> -->
								<%-- 						</form:form> --%>
<!-- 								<div id="divMenu"> -->
<%-- 								<c:forEach var="section" items="${menu}"> --%>
<!-- 									<ul id="menu"> -->
<%-- 										<li id="${section.getId()}">${section.getName()}  --%>
<%-- 										<c:set var="tempChilds" value="${section.getChildId()}"></c:set> --%>
<%-- 											<c:forEach var="item" items="${tempChilds}">  --%>
<!-- 												<ul id="section"> -->
<%-- 													<li id="${item.getId()}">${item.getName()}</li> --%>
<!-- 												</ul>											 								  -->
<%-- 											</c:forEach> --%>
<!-- 										</li> -->
<!-- 									</ul> -->
<%-- 								</c:forEach> --%>
<!-- 								</div> -->



							<div id="divMenu">
							    <ul>
							        <c:forEach var="child" items="${menu}"> 
								            <template:nodeTree node="${child}"/>
							        </c:forEach>
							    </ul>
							</div>
							</div>
						</div>
					</div>
				</div>

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<%@ include file="/WEB-INF/templates/footer.jsp"%>

	</div>
	<!-- ./wrapper -->

	<!-- REQUIRED JS SCRIPTS -->

	<!-- jQuery 2.1.3 -->
	<script src="${resouceUrl}plugins/jQuery/jQuery-2.1.3.min.js"></script>
	<!-- Bootstrap 3.3.2 JS -->
	<script src="${resouceUrl}bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="${resouceUrl}dist/js/app.min.js" type="text/javascript"></script>

	<!-- Optionally, you can add Slimscroll and FastClick plugins. 
          Both of these plugins are recommended to enhance the 
          user experience -->
</body>
</html>