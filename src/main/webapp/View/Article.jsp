
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
<link rel="stylesheet" href="styles.css">
</head>
<body>

<article class="post vt-post">
	            <div class="row">
	                <div class="col-xs-12 col-sm-5 col-md-5 col-lg-4">
	                    <div class="post-type post-img">
	                        <a href="#"><img src="https://bootdey.com/img/Content/avatar/avatar1.png" class="img-responsive" alt="image post"></a>
	                    </div>
	                    <div class="author-info author-info-2">
	                        <ul class="list-inline">
	                            <li>
	                                <div class="info">
	                                    <strong>${p.Rating }</strong>
	                                    <h4>${p.Sommaire }</h4>
	                                    </div>
	                            </li>
	                            <c:forEach items="${thematiques }" var="t">
	                            <h5><a href="#">${t.Thématique }</a></h5>
	                            
	                            </c:forEach>
	                        </ul>
	                    </div>
	                </div>
	                <div class="col-xs-12 col-sm-7 col-md-7 col-lg-8">
	                    <div class="caption">
	                        <h3 class="md-heading">${p.title }</h3>
	                        <h5>${p.Description }</h5>
	                        <p> ${p.Contenu }</p>
	                </div>
	            </div>
	        </article>
	   

</body>
</html>