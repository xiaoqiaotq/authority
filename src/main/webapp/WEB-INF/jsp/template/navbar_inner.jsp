<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container-fluid">

<!-- BEGIN LOGO -->

<a href="${pageContext}" class="brand">

    <img alt="logo" style="width: 100px;height: 25px;" src="${ contextPath}/resources/assets/media/image/logo.png">

</a>

<!-- END LOGO -->

<!-- BEGIN RESPONSIVE MENU TOGGLER -->

<a data-target=".nav-collapse" data-toggle="collapse" class="btn-navbar collapsed" href="javascript:;">

    <img alt="" src="${ contextPath}/resources/assets/media/image/menu-toggler.png">

</a>

<!-- END RESPONSIVE MENU TOGGLER -->

<!-- BEGIN TOP NAVIGATION MENU -->

<ul class="nav pull-right">

<!-- BEGIN NOTIFICATION DROPDOWN -->

<li id="header_notification_bar" class="dropdown">

    <a data-toggle="dropdown" class="dropdown-toggle" href="#">

        <i class="icon-warning-sign"></i>

        <span class="badge">6</span>

    </a>

    <ul class="dropdown-menu extended notification">

        <li>

            <p>You have 14 new notifications</p>

        </li>

        <li>

            <a href="#">

                <span class="label label-success"><i class="icon-plus"></i></span>

                New user registered.

                <span class="time">Just now</span>

            </a>

        </li>

        <li>

            <a href="#">

                <span class="label label-important"><i class="icon-bolt"></i></span>

                Server #12 overloaded.

                <span class="time">15 mins</span>

            </a>

        </li>

        <li>

            <a href="#">

                <span class="label label-warning"><i class="icon-bell"></i></span>

                Server #2 not respoding.

                <span class="time">22 mins</span>

            </a>

        </li>

        <li>

            <a href="#">

                <span class="label label-info"><i class="icon-bullhorn"></i></span>

                Application error.

                <span class="time">40 mins</span>

            </a>

        </li>

        <li>

            <a href="#">

                <span class="label label-important"><i class="icon-bolt"></i></span>

                Database overloaded 68%.

                <span class="time">2 hrs</span>

            </a>

        </li>

        <li>

            <a href="#">

                <span class="label label-important"><i class="icon-bolt"></i></span>

                2 user IP blocked.

                <span class="time">5 hrs</span>

            </a>

        </li>

        <li class="external">

            <a href="#">See all notifications <i class="m-icon-swapright"></i></a>

        </li>

    </ul>

</li>

<!-- END NOTIFICATION DROPDOWN -->

<!-- BEGIN INBOX DROPDOWN -->

<li id="header_inbox_bar" class="dropdown">

    <a data-toggle="dropdown" class="dropdown-toggle" href="#">

        <i class="icon-envelope"></i>

        <span class="badge">5</span>

    </a>

    <ul class="dropdown-menu extended inbox">

        <li>

            <p>You have 12 new messages</p>

        </li>

        <li>

            <a href="inbox.html?a=view">

                <span class="photo"><img alt="" src="/resources/assets/media/image/avatar2.jpg"></span>

								<span class="subject">

								<span class="from">Lisa Wong</span>

								<span class="time">Just Now</span>

								</span>

								<span class="message">

								Vivamus sed auctor nibh congue nibh. auctor nibh

								auctor nibh...

								</span>

            </a>

        </li>

        <li>

            <a href="inbox.html?a=view">

                <span class="photo"><img alt="" src="/resources/assets/media/image/avatar3.jpg"></span>

								<span class="subject">

								<span class="from">Richard Doe</span>

								<span class="time">16 mins</span>

								</span>

								<span class="message">

								Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh

								auctor nibh...

								</span>

            </a>

        </li>

        <li>

            <a href="inbox.html?a=view">

                <span class="photo"><img alt="" src="/resources/assets/media/image/avatar1.jpg"></span>

								<span class="subject">

								<span class="from">Teddy</span>

								<span class="time">2 hrs</span>

								</span>

								<span class="message">

								Vivamus sed nibh auctor nibh congue nibh. auctor nibh

								auctor nibh...

								</span>

            </a>

        </li>

        <li class="external">

            <a href="inbox.html">See all messages <i class="m-icon-swapright"></i></a>

        </li>

    </ul>

</li>

<!-- END INBOX DROPDOWN -->

<!-- BEGIN TODO DROPDOWN -->

<li id="header_task_bar" class="dropdown">

    <a data-toggle="dropdown" class="dropdown-toggle" href="#">

        <i class="icon-tasks"></i>

        <span class="badge">5</span>

    </a>

    <ul class="dropdown-menu extended tasks">

        <li>

            <p>You have 12 pending tasks</p>

        </li>

        <li>

            <a href="#">

								<span class="task">

								<span class="desc">New release v1.2</span>

								<span class="percent">30%</span>

								</span>

								<span class="progress progress-success ">

								<span class="bar" style="width: 30%;"></span>

								</span>

            </a>

        </li>

        <li>

            <a href="#">

								<span class="task">

								<span class="desc">Application deployment</span>

								<span class="percent">65%</span>

								</span>

								<span class="progress progress-danger progress-striped active">

								<span class="bar" style="width: 65%;"></span>

								</span>

            </a>

        </li>

        <li>

            <a href="#">

								<span class="task">

								<span class="desc">Mobile app release</span>

								<span class="percent">98%</span>

								</span>

								<span class="progress progress-success">

								<span class="bar" style="width: 98%;"></span>

								</span>

            </a>

        </li>

        <li>

            <a href="#">

								<span class="task">

								<span class="desc">Database migration</span>

								<span class="percent">10%</span>

								</span>

								<span class="progress progress-warning progress-striped">

								<span class="bar" style="width: 10%;"></span>

								</span>

            </a>

        </li>

        <li>

            <a href="#">

								<span class="task">

								<span class="desc">Web server upgrade</span>

								<span class="percent">58%</span>

								</span>

								<span class="progress progress-info">

								<span class="bar" style="width: 58%;"></span>

								</span>

            </a>

        </li>

        <li>

            <a href="#">

								<span class="task">

								<span class="desc">Mobile development</span>

								<span class="percent">85%</span>

								</span>

								<span class="progress progress-success">

								<span class="bar" style="width: 85%;"></span>

								</span>

            </a>

        </li>

        <li class="external">

            <a href="#">See all tasks <i class="m-icon-swapright"></i></a>

        </li>

    </ul>

</li>

<!-- END TODO DROPDOWN -->

<!-- BEGIN USER LOGIN DROPDOWN -->

<li class="dropdown user">

    <a data-toggle="dropdown" class="dropdown-toggle" href="#">

        <img src="/resources/assets/media/image/avatar1_small.jpg" alt="">

        <span class="username">Teddy Wang</span>

        <i class="icon-angle-down"></i>

    </a>

    <ul class="dropdown-menu">

        <%--<li><a href="extra_profile.html"><i class="icon-user"></i> My Profile</a></li>--%>

        <%--<li><a href="page_calendar.html"><i class="icon-calendar"></i> My Calendar</a></li>--%>

        <%--<li><a href="inbox.html"><i class="icon-envelope"></i> My Inbox(3)</a></li>--%>

        <%--<li><a href="#"><i class="icon-tasks"></i> My Tasks</a></li>--%>

        <%--<li class="divider"></li>--%>

        <%--<li><a href="extra_lock.html"><i class="icon-lock"></i> Lock Screen</a></li>--%>

        <li><a href="javascript:void(0);"><i class="icon-key"></i> 登出</a></li>

    </ul>

</li>

<!-- END USER LOGIN DROPDOWN -->

</ul>

<!-- END TOP NAVIGATION MENU -->

</div>