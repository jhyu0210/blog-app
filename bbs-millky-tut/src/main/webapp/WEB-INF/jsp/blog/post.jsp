<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="${pageContext.request.locale.language}">
<head>
<%@ include file="/WEB-INF/jsp/jspf/head.jspf" %>
<title><c:out value="타이틀" escapeXml="true" /> : Spring Blog</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/jspf/nav.jspf" %>

	<header class="intro-header" style="background-image: url('/image/post-bg.jpg')">

    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-heading">
                    <h1><c:out value="${post.title}" escapeXml="true"></c:out></h1>
                    <h2 class="subheading"><c:out value="${post.subtitle}" escapeXml="true"></c:out></h2>
                    <span class="meta">Posted by <a href="#">James</a> on ${post.regDate}</span>
                </div>
            </div> 
        </div>
    </div>
</header>
<!-- Post Content -->
<article>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                ${post.content}
            </div>
        </div>
        <div class = "pull-right">
            <a href="/post/${post.id}/edit">
                <button type="button" class="btn btn-warning">Edit</button>
            </a>
            <a href="/post/${post.id}/delete" onclick="if(!confirm('sure? ')){return false;}">
                <button type="button" class="btn btn-danger">Delete</button>
            </a>
        </div>
    </div>
</article>

	<hr>

	<%@ include file="/WEB-INF/jsp/jspf/footer.jspf" %>



</body>
</html>