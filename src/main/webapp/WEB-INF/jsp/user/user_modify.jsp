<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->

<!--[if !IE]><!-->
<html lang="en" class="no-js"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8"/>

    <title>圆融集团 | 管理面板</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

    <meta content="" name="description"/>

    <meta content="" name="author"/>

    <!-- BEGIN GLOBAL MANDATORY STYLES -->

    <link href="${contextPath}/resources/assets/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <link href="${contextPath}/resources/assets/media/css/bootstrap-responsive.min.css" rel="stylesheet"
          type="text/css"/>

    <link href="${contextPath}/resources/assets/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    <link href="${contextPath}/resources/assets/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

    <link href="${contextPath}/resources/assets/media/css/style.css" rel="stylesheet" type="text/css"/>

    <link href="${contextPath}/resources/assets/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

    <link href="${contextPath}/resources/assets/media/css/default.css" rel="stylesheet" type="text/css"
          id="style_color"/>

    <link href="${contextPath}/resources/assets/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN PAGE LEVEL STYLES -->

    
	<link rel="stylesheet" type="text/css" href="${contextPath}/resources/assets/media/css/select2_metro.css" />

	<link rel="stylesheet" href="${contextPath}/resources/assets/media/css/DT_bootstrap.css" />
	
	<link href="${contextPath}/resources/assets/media/css/glyphicons.css" rel="stylesheet">
	
	<link href="${contextPath}/resources/assets/media/css/halflings.css" rel="stylesheet">
    <!-- END PAGE LEVEL STYLES -->

    <link rel="shortcut icon" href="${contextPath}/resources/assets/media/image/favicon.ico"/>

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed">

<!-- BEGIN HEADER -->

<div class="header navbar navbar-inverse navbar-fixed-top">

    <!-- BEGIN TOP NAVIGATION BAR -->

    <div class="navbar-inner">
        <jsp:include page="../template/navbar_inner.jsp"/>
    </div>

    <!-- END TOP NAVIGATION BAR -->

</div>

<!-- END HEADER -->

<!-- BEGIN CONTAINER -->

<div class="page-container">

<!-- BEGIN SIDEBAR -->

<div class="page-sidebar nav-collapse collapse">
    <jsp:include page="../template/page_sidebar.jsp"/>

</div>

<!-- END SIDEBAR -->

<!-- BEGIN PAGE -->

<div class="page-content">

    <div class="container-fluid">

        <!-- BEGIN PAGE HEADER-->

        <div class="row-fluid">

            <div class="span12">

                <!-- END BEGIN STYLE CUSTOMIZER -->

                <!-- BEGIN PAGE TITLE & BREADCRUMB-->

                <h3 class="page-title">


                </h3>

                <ul class="breadcrumb">

                    <li>

                        <i class="icon-home"></i>

                        <a href="${contextPath}/admin/">Home</a>

                        <i class="icon-angle-right"></i>

                    </li>

                    <li>

                        <a href="${contextPath}/user/home/">用户列表</a>

                        <i class="icon-angle-right"></i>

                    </li>
                    
                    <li>

                        <a href="#"> 修改用户</a>

                    </li>

                </ul>

                <!-- END PAGE TITLE & BREADCRUMB-->

            </div>

        </div>

        <!-- END PAGE HEADER-->

        <!-- BEGIN PAGE CONTENT-->

        <div class="row-fluid">

      		 <div class="span12">

						<!-- BEGIN SAMPLE FORM PORTLET-->   

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-reorder"></i>用户</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>


								</div>

							</div>

							<div class="portlet-body form">

								<!-- BEGIN FORM-->

								<form action="${contextPath }/user/save" class="form-horizontal" method="post">
								
								       <input type="hidden" name="id"  value="${user.id} "/>
								       
									<div class="control-group">

										<label class="control-label">username</label>

										<div class="controls">

											<input type="text" class="span6 m-wrap" name="username" value="${user.username }"/>

											<span class="help-inline">Some hint here</span>

										</div>

									</div>
									
									<div class="control-group">

										<label class="control-label">age</label>

										<div class="controls">

											<input type="text" class="span6 m-wrap" name="age" value="${user.age }"/>

											<span class="help-inline">Some hint here</span>

										</div>

									</div>

		


									<div class="form-actions">

										<button type="submit" class="btn blue">Submit</button>

										<button type="button" class="btn">Cancel</button>                            

									</div>

								</form>

								<!-- END FORM-->       

							</div>

						</div>

						<!-- END SAMPLE FORM PORTLET-->

					</div>
        </div>

    </div>

    <!-- END PAGE -->

</div>

<!-- END CONTAINER -->

<!-- BEGIN FOOTER -->

<div class="footer">

    <div class="footer-inner">

        2013 &copy; Metronic by keenthemes.

    </div>

    <div class="footer-tools">

			<span class="go-top">

			<i class="icon-angle-up"></i>

			</span>

    </div>

</div>

<!-- END FOOTER -->

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

<!-- BEGIN CORE PLUGINS -->

<script src="${contextPath}/resources/assets/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

<script src="${contextPath}/resources/assets/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/bootstrap.min.js" type="text/javascript"></script>

<!--[if lt IE 9]>

<script src="${contextPath}/resources/assets/media/js/excanvas.min.js"></script>

<script src="${contextPath}/resources/assets/media/js/respond.min.js"></script>

<![endif]-->

<script src="${contextPath}/resources/assets/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/jquery.blockui.min.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/jquery.cookie.min.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/jquery.uniform.min.js" type="text/javascript"></script>

<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script type="text/javascript" src="${contextPath}/resources/assets/media/js/select2.min.js"></script>

	<script type="text/javascript" src="${contextPath}/resources/assets/media/js/jquery.dataTables.js"></script>

	<script type="text/javascript" src="${contextPath}/resources/assets/media/js/DT_bootstrap.js"></script>

<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->

<script src="${contextPath}/resources/assets/media/js/app.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/index.js" type="text/javascript"></script>

<script src="${contextPath}/resources/assets/media/js/table-managed.js" type="text/javascript"></script>

<!-- END PAGE LEVEL SCRIPTS -->

<script>

    jQuery(document).ready(function () {

        App.init(); // initlayout and core plugins

        TableManaged.init();

    });

</script>

<!-- END JAVASCRIPTS -->

<script type="text/javascript">
</script>
</body>

<!-- END BODY -->

</html>