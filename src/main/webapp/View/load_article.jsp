<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>
Loading articles


<div class="row">

		<c:forEach items="${articles}" var="w" >
					<div class="col-md-6 mt-2">
					 <article class="article">
			                        <div class="article-img">
			                            <img src="https://via.placeholder.com/800x350/87CEFA/000000" title="" alt="">
			                        </div>
			                        <div class="article-title">
			                            <h2>${ w.title }</h2>
			                            <h6><a href="#">${ w.Description }</a></h6>
			                            
			                            <div class="media">
			                                <div class="avatar">
			                                    <img src="https://bootdey.com/img/Content/avatar/avatar1.png" title="" alt="">
			                                </div>
			                            </div>
			                        </div>
			                        <div class="article-content">
			            				<td>${ w.Contenu }</td>
						                
			                        </div>
			           	</article>
			           </div>
				</c:forEach>	
			</div>
</body>
</html>