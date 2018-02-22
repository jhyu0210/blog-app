<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<link rel="stylesheet" href="/webjars/origoni-startbootstrap-clean-blog/1.0.3/css/clean-blog.min.css">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/dist/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.2.1/dist/jquery.min.js"></script>    
<script src="/webjars/bootstrap/3.3.7/dist/js/bootstrap.min.js"></script>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<div class ="container">
	<c:out value="<xmp>" escapeXml="true"></c:out>
	
		<h2>Hello!! ${name}</h2>
		<div>JSP version</div>
	</div>
	<div class="alert alert-primary" role="alert">
        This is a primary alert—check it out!
    </div>

	
	<script src="/webjars/jquery/3.2.1/dist/jquery.min.js"></script>    
	<script src="/webjars/bootstrap/3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="/webjars/origoni-startbootstrap-clean-blog/1.0.3/js/clean-blog.min.js"></script>
</body>
</html>