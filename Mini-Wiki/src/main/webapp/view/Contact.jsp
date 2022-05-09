<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<!--
	Travail Fait par le groupe de mini-wiki pour le module de Technologie de web 
	Master spécialisé : Ingénierie informatique et Internet
-->
<html>
<head>
<title>Mini-Wiki</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/css/main.css"
	type="text/css" />
</head>
<body class="is-preload">
	<!-- 
	Recuperation des posts 
	-->
	<%-- 	<c:forEach items="${ posts }" var="e" varStatus="i">
		<tr>
			<td>${ posts.get(i.count - 1).Titre.toString().substring(1, posts.get(i.count - 1).Titre.toString().length()-1) }</td>
		</tr>
	</c:forEach> --%>
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<h1>
				<a href="list">Mini-wiki</a>
			</h1>
			<nav class="links">
				<ul>
					<li><a href="list">Accueil</a></li>
					<li><a href="list#thematiques">Thématiques</a></li>
					<li><a href="about">à propos</a></li>
					<li><a href="contact">Nous Contacter</a></li>

				</ul>
			</nav>
			<nav class="main">
				<ul>
					<li class="search"><a class="fa-search" href="#search">Search</a>
						<form id="search" method="post" action="search">
							<input type="text" name="recherche"
								placeholder="Rechercher les articles" />
						</form></li>
					<li class="menu"><a class="fa-bars" href="#menu">Menu</a></li>


				</ul>
			</nav>
			
			
		</header>

		<!-- Menu -->
		<section id="menu">

			<!-- Search -->
			<c:forEach items="${weaker}" var="w">
				<section>
					<li>
						<div style="color: Grey;">
							<b>Bonjour <i color="black">${ w.username}</i>
							</b>
						</div>
					</li>
				</section>
			</c:forEach>

			<!-- Links -->
			<section>
				<ul class="links">
					<li><a href="list">
							<h3>Accueil</h3>
							<p>Accéder à la page d'accueil.</p>
					</a></li>
					<li><a href="about">
							<h3>à propos</h3>
							<p>Savoir qui sommes-nous.</p>
					</a></li>
					<li><a href="thematiques">
							<h3>Thématiques</h3>
							<p>Voir les thématiques existantes.</p>
					</a></li>
					<li><a href="contact">
							<h3>Nous contacter</h3>
							<p>Liens et informations pour le contact.</p>
					</a></li>
				</ul>
			</section>

			<!-- Actions -->
			<section>
				<c:if test="${ weaker == null }">
					<ul class="actions stacked">
						<li><a href="register" class="button large fit">Créer un
								compte</a></li>
					</ul>

					<ul class="actions stacked">
						<li><a href="login" class="button large fit">Se connecter</a></li>
					</ul>
				</c:if>
				<c:if test="${ weaker != null }">
					<c:forEach items="${weaker}" var="w">
						<li><a href="logout">Se déconnecter</a></li>

						<c:if test="${w.estAdmin.toString() eq 'true'}">

							<li><a href="them" class="button large fit">Creer
									Thematique</a></li>
						</c:if>


					</c:forEach>
				</c:if>
			</section>

		</section>

		<!-- Main -->
		<center>
		<section>
			<header>
				<div style="text-align: center;">
  					 <img src="${pageContext.request.contextPath}/resources/images/About-Us.jpg" width="600" style="margin:20px;" />
				</div>
			</header>
		</section>
	  </center>
       <section>
        
        </br></br>
        <div>
            <h2 style=" font-family:Forte; color:black; text-align:left;"><em>Qui sommes nous?</em></h2>
            <br />

            <p style="font-family:'Arial Rounded MT'; text-align:justify">Nous sommes des étudiants de FSAC MS. Ingénierie Informatique et Internet, notre objectif c'est de créer une MiniWiki pour consulter l'ensemble des articles. </p>
            <br />
         </div>   
		 <div>
            <h2 style=" font-family:Forte; color:black; text-align:left;"><em>Description:</em></h2></br>
            <p style="font-family:'Arial Rounded MT'; text-align:justify">
               MiniWiki est une application développer avec deux technologies différentes Laravel pour le backend et JEE pour le frontend par un groupe d'étudiants du Master Ingénierie Informatique de la Faculté des Sciences Ain Chock qui permet de parcourir un ensemble d'articles sur les différents thématiques.
			   L'application MiniWiki est l'une des applications les plus faciles à utiliser mais avec un style totalement diffèrent de Wikipédia. Notre app MiniWiki prend en charge des fonctionnalités telles que la recherche des articles Cela renverra une liste de tous les articles qui se rapportent à votre recherche tout en donnant la possibilité de consulter le rating des articles.

            </p><br />
        
  		  </div>
		

		</section>



	<!-- Scripts -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/browser.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/breakpoints.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/util.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/main.js"></script>

</body>
</html>