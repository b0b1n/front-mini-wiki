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
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

body {
	font-family: arial;
}

.main {
	margin: 2%;
}

.card {
	width: 20%;
	display: inline-block;
	box-shadow: 2px 2px 20px black;
	border-radius: 5px;
	margin: 2%;
}

.image img {
	width: 100%;
	border-top-right-radius: 5px;
	border-top-left-radius: 5px;
}

.title {
	text-align: center;
	padding: 10px;
}

h1 {
	font-size: 20px;
}

.des {
	padding: 3px;
	text-align: center;
	padding-top: 10px;
	border-bottom-right-radius: 5px;
	border-bottom-left-radius: 5px;
}

button {
	margin-top: 40px;
	margin-bottom: 10px;
	background-color: white;
	border: 1px solid black;
	border-radius: 5px;
	padding: 10px;
}

button:hover {
	background-color: black;
	color: white;
	transition: .5s;
	cursor: pointer;
}
</style>
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
	</div>
	<!-- Main -->

	<div class="main">

		<!--cards -->

		<div class="card">

			<div class="image">
				<img
					src="${pageContext.request.contextPath}/resources/images/youssra.jpg">
			</div>
			<div class="title">
				<h1>El Haddad Youssra</h1>
			</div>
			<div class="des">
				<p>Etudiante MS. Ingénierie Informatique et Internet</p>
				<a href="https://ma.linkedin.com/in/youssra-el-haddad-9054471a9"
					class="icon brands fa-linkedin"></a>
			</div>
		</div>
		<!--cards -->


		<div class="card">

			<div class="image">
				<img
					src="${pageContext.request.contextPath}/resources/images/bennour.jpeg">
			</div>
			<div class="title">
				<h1>Bennour Med Amine</h1>
			</div>
			<div class="des">
				<p>Etudiant MS. Ingénierie Informatique et Internet</p>
				<a
					href="https://www.linkedin.com/in/mohamed-amine-bennour-92644a219/"
					class="icon brands fa-linkedin"></a>
			</div>
		</div>
		<!--cards -->


		<div class="card">

			<div class="image">
				<img
					src="${pageContext.request.contextPath}/resources/images/sinoun.jpg">
			</div>
			<div class="title">
				<h1>Sinoun Imane</h1>
			</div>
			<div class="des">
				<p>Etudiante MS. Ingénierie Informatique et Internet</p>
				<a href="https://www.linkedin.com/in/imane-sinoun-9264b3183"
					class="icon brands fa-linkedin"></a>
			</div>
		</div>
		<!--cards -->


		<div class="card">

			<div class="image">
				<img
					src="${pageContext.request.contextPath}/resources/images/sohaib.jpg">
			</div>
			<div class="title">
				<h1>Skious Sohaib</h1>
			</div>
			<div class="des">
				<p>Etudiant MS. Ingénierie Informatique et Internet</p>
				<a href="https://www.linkedin.com/in/sohaib-skious-3758a21a6/"
					class="icon brands fa-linkedin"></a>
			</div>
		</div>
		<!--cards -->


		<div class="card">

			<div class="image">
				<img
					src="${pageContext.request.contextPath}/resources/images/ousama.jpg">
			</div>
			<div class="title">
				<h1>El Boujjadia Oussama</h1>
			</div>
			<div class="des">
				<p>Etudiant MS. Ingénierie Informatique et Internet</p>
				<a
					href="https://www.linkedin.com/in/oussama-el-boujjadia-5645b11a5/"
					class="icon brands fa-linkedin"></a>
			</div>
		</div>
		<!--cards -->

		<div class="card">

			<div class="image">
				<img
					src="${pageContext.request.contextPath}/resources/images/errgha.jpeg">
			</div>
			<div class="title">
				<h1>Errgha Abdsamad</h1>
			</div>
			<div class="des">
				<p>Etudiant MS. Ingénierie Informatique et Internet</p>
				<a href="#" class="icon brands fa-linkedin"></a>
			</div>
		</div>


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