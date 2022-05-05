<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="articles.css">
</head>
<body>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />




<main>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
		<c:forEach items="${thematiques}" var="t">
						<div>
							<h2><a href="Accueil?thematique=${t._id }">${ t.NomThematique }</a></h2>
	</div>
		</c:forEach>
								
			
			</div>
			
		<div class="col-md-8">
		
			
			<div class="container-fluid" id="posts">
				
	<c:forEach items="${pages } var="p">
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
	                        <a class="btn btn-default" href="Article.jsp?id=${p._id }" role="button">Read More</a> </div>
	                </div>
	            </div>
	        </article>
	        
        
        
        
        <div class="pagination-wrap">
            <nav aria-label="Page navigation example">
              <ul class="pagination">
                <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
              </ul>
            </nav>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
				
				
				</c:forEach>					
				
			</div>					
			
		</div>
			
		
		</div>
	</div>

</main>

<script>

	$(document).ready(function(e){
		alert("loading")
		
		$.ajax({
			url:"load_articles.jsp",
			success: function(data,textStatus,jqXHR){
				//console.log("loading cool"')
				$("#loader").hide();
				$("#posts").html(data);
			}
			
			
		})
	})

</script>




</body>
</html>