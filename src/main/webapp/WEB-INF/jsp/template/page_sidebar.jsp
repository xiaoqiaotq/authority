<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<ul class="page-sidebar-menu">

    <li>

        <!-- BEGIN SIDEBAR TOGGLER BUTTON -->

        <div class="sidebar-toggler hidden-phone"></div>

        <!-- BEGIN SIDEBAR TOGGLER BUTTON -->

    </li>

    <li>

        <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->

        <form class="sidebar-search">

            <div class="input-box">

                <a class="remove" href="javascript:void(0);"></a>

                <input type="text" placeholder="搜索...">

                <input type="button" value=" " class="submit">

            </div>

        </form>

        <!-- END RESPONSIVE QUICK SEARCH FORM -->

    </li>

    <li class="start ${selected_dashboard}">

        <a href="/admin/">

            <i class="icon-home"></i>

            <span class="title">控制面板</span>

            <span class="selected"></span>

        </a>

    </li>

    <li class="${selected_mgmt}">

        <a href="javascript:void(0);">

            <i class="icon-cogs"></i>

            <span class="title">管理</span>

            <span class="arrow "></span>

        </a>

        <ul class="sub-menu">

            <li>

                <a href="${contextPath }/user/home">用户管理</a>

            </li>
            
            <li>

                <a href="${contextPath }/admin/equipment/">角色管理</a>

            </li>

            <li>

                <a href="${contextPath }/admin/alarm">权限管理</a>

            </li>


        </ul>

    </li>


</ul>