<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>

<%@ include file="/WEB-INF/jsp/jspf/head.jspf" %>
<title>Hello Spring Blog</title>
<style type="text/css">
    .intro-header {
    margin-top:50px;
    }
    </style>

</head>
<body>
	<%@ include file="/WEB-INF/jsp/jspf/nav.jspf" %>
    
	<header class="intro-header" style="background-image: url('/image/home-bg.jpg')">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<div class="site-heading">
						<h1>Spring Blog</h1>
						<hr class="small">
						<span class="subheading">Spring Blog from James</span>
					</div>
				</div>
			</div>
		</div>
	</header>

    <c:forEach var="post" items="${postList}">
        <div class="post-preview">
            <a href="/blog/${post.id}">
                <h2 class="post-title">
                    <c:out value="${post.title}" escapeXml="true"></c:out>
                </h2>
                <h3 class="post-sub-title">
                    <c:out value="${post.subtitle}" escapeXml="true"></c:out>
                </h3>
            </a>
        </div>
    </c:forEach>
    
	<hr>
	<%@ include file="/WEB-INF/jsp/jspf/footer.jspf" %>
</body>
</html>