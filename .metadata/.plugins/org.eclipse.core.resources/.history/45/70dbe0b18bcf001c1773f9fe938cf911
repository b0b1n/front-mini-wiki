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
					<li><a href="#thematiques">Thématiques</a></li>
					<li><a href="about">à propos</a></li>
					<li><a href="contact">Nous Contacter</a></li>
				   
				</ul>
			</nav>
			<nav class="main">
				<ul>
					<li class="search"><a class="fa-search" href="#search">Search</a>
						<form id="search" method="get" action="search1">
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
					<li><a href="#thematiques">
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
				${ w.estAdmin.toString() }
						<c:if test="${w.EstConnecté.toString() eq 'true' && w.estAdmin.toString() eq 'true'}">
						<li><a href="replist">Listes des reports</a></li>
						<li><a href="getUser">Listes des utilisateurs</a></li>
						</c:if>
					</c:forEach>
				</c:if>
				
				<c:if test="${ weaker != null }">
					<c:forEach items="${weaker}" var="w">
						<li><a href="logout">Se déconnecter</a></li>
					</c:forEach>
				</c:if>
			</section>

		</section>

		<!-- Main -->
		<div id="main">

			<!-- Post -->
			<c:forEach items="${ posts }" var="e" varStatus="i">
				<article class="post">
					<header>
						<div class="title">
							<h2>
								<a href="single.html">${ posts.get(i.count - 1).Titre.toString().substring(1, posts.get(i.count - 1).Titre.toString().length()-1) }</a>
							</h2>
							<p>${ posts.get(i.count - 1).Description.toString().substring(1, posts.get(i.count - 1).Description.toString().length()-1) }</p>
						</div>
						<div class="meta">
							<time class="published"
								datetime="${ posts.get(i.count - 1).created_at.toString().substring(1, 11) }">${ posts.get(i.count - 1).created_at.toString().substring(1, 11) }</time>
							<a href="#" class="author"><span class="name">Jane Doe</span><img
								src="${pageContext.request.contextPath}/resources/images/avatar.jpg"
								alt="" /></a>
						</div>
					</header>

					<p>${ posts.get(i.count - 1).Contenu.toString().substring(1, posts.get(i.count - 1).Contenu.toString().length()-1) }</p>
					<footer>
						<c:if test="${ weaker != null }">
							<c:forEach items="${weaker}" var="w">
								<c:if
									test="${w.EstConnecté.toString() eq 'true' && w.estAdmin.toString() eq 'false'}">

									<ul class="actions">
										<li><a
											href="report?id=${ posts.get(i.count - 1).Titre.toString().substring(1, posts.get(i.count - 1).Titre.toString().length()-1) }"
											class="button large">Reporter</a></li>
									</ul>
								</c:if>
							</c:forEach>
						</c:if>
						<ul class="stats">
							<li><a href="#" class="icon solid fa-star">${ posts.get(i.count - 1).Rating }</a></li>
						</ul>
					</footer>
				</article>
			</c:forEach>



		</div>

		<!-- Sidebar -->
		<section id="sidebar">

			<!-- Intro -->
			<section id="intro">
				<center>
					<a href="#" class="logo"><img
						src="${pageContext.request.contextPath}/resources/images/logo.jpg"
						alt="" /></a>
					<header>
						<h2>Mini-Wiki</h2>
						<p>Explorez la beauté des articles</p>
					</header>
				</center>
			</section>
			<!-- Mini Posts -->
			<section style="background-color: #ecc69e; padding: 5%;">
				<header>
					<center>
						<h2>
							Présentation</br> Mini-Wiki
						</h2>
					</center>
					<p style="text-align: justify; text-justify: inter-word;">MiniWiki
						est une application développer avec deux technologies différentes
						Laravel pour le backend et JEE pour le frontend par un groupe
						d'étudiants du Master Ingénierie Informatique de la Faculté des
						Sciences Ain Chock qui permet de parcourir un ensemble d'articles
						sur les différents thématiques.</p>
					<p style="text-align: justify; text-justify: inter-word;">L'application
						MiniWiki est l'une des applications les plus faciles à utiliser
						mais avec un style totalement diffèrent de Wikipédia. Notre app
						MiniWiki prend en charge des fonctionnalités telles que la
						recherche des articles Cela renverra une liste de tous les
						articles qui se rapportent à votre recherche tout en donnant la
						possibilité de consulter le rating des articles.</p>
				</header>
			</section>
			<section>
				<div class="mini-posts" id="thematiques">
					<!-- Mini Post -->
					<c:forEach items="${ thematiques }" var="th">
						<center>
							<article class="mini-post">
								<header
									style='background-color : ${th.Color.toString().substring(1, th.Color.toString().length()-1)};'>
									<h3>
										<a
											href='http://localhost:8080/Mini-Wiki/search/${th.NomThematique.toString().substring(1, th.NomThematique.toString().length()-1)}'>${th.NomThematique}
										</a>
									</h3>
								</header>
							</article>
						</center>
					</c:forEach>
				</div>
			</section>

			<!-- Footer -->
			<section id="footer">
				<ul class="icons">
					<li><span class="label">Sohaib Skious :
							&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a
						href="https://www.facebook.com/sb.skio.01"
						class="icon brands fa-facebook-f"></a>&nbsp;&nbsp;&nbsp;<a
						href="https://twitter.com/b0b1n" class="icon brands fa-twitter"></a>&nbsp;&nbsp;&nbsp;<a
						href="https://www.instagram.com/s0ha1b.sqs/"
						class="icon brands fa-instagram"></a>&nbsp;&nbsp;&nbsp;<a
						href="https://www.linkedin.com/in/sohaib-skious-3758a21a6/"
						class="icon brands fa-linkedin"></a></li>
					<br>
					<li><span class="label">Youssra el-haddad :
							&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a
						href="https://www.facebook.com/youssra.elhaddad.169"
						class="icon brands fa-facebook-f"></a>&nbsp;&nbsp;&nbsp;<a
						href="https://ma.linkedin.com/in/youssra-el-haddad-9054471a9"
						class="icon brands fa-linkedin"></a></li>
					<br>
					<li><span class="label">Imane sinoun :
							&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a
						href="https://www.linkedin.com/in/imane-sinoun-9264b3183"
						class="icon brands fa-linkedin"></a></li>
					<br>
					<li><span class="label">Mohammed amine bennour :
							&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a href="#"
						class="icon solid fa-rss"></a></li>
					<br>
					<li><span class="label">Abdessamd erraghi :
							&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a href="#"
						class="icon solid fa-rss"></a></li>
					<br>
					<li><span class="label">Oussama el-boujjaadia:
							&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a href="#"
						class="icon solid fa-rss"></a></li>
					<br>
				</ul>
				<p class="copyright">
					&copy; Groupe MiniWiki , promo : 2021/2022 Images: <a
						href="http://unsplash.com">Unsplash</a>.
				</p>
			</section>
		</section>

	</div>

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