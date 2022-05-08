<%@page import="java.io.StringReader"%>
<%@page import="jakarta.json.JsonObject"%>
<%@page import="jakarta.json.JsonReader"%>
<%@page import="jakarta.json.Json"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css"
	href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link type="text/css" rel="stylesheet"
	href="path/to/font-awesome/css/font-awesome.min.css">
<link type="text/css"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<title>Report --MiniWiki</title>
</head>

<body>

	<style>
body {
	background-color: #F8F8FF;
	font-family: 'Ubuntu', sans-serif;
}

.main {
	background-color: #FFFFFF;
	width: 400px;
	height: 400px;
	margin: 7em auto;
	border-radius: 1.5em;
	box-shadow: 0px 11px 35px 2px rgba(0, 0, 0, 0.14);
}

.sign {
	padding-top: 40px;
	color: #696969;
	font-family: 'Ubuntu', sans-serif;
	font-weight: bold;
	font-size: 23px;
}

.un {
	width: 76%;
	color: rgb(38, 50, 56);
	font-weight: 700;
	font-size: 14px;
	letter-spacing: 1px;
	background: rgba(136, 126, 126, 0.04);
	padding: 10px 20px;
	border: none;
	border-radius: 20px;
	outline: none;
	box-sizing: border-box;
	border: 2px solid rgba(0, 0, 0, 0.02);
	margin-bottom: 50px;
	margin-left: 46px;
	text-align: center;
	margin-bottom: 27px;
	font-family: 'Ubuntu', sans-serif;
}

form.form1 {
	padding-top: 40px;
}

.pass {
	width: 76%;
	color: rgb(38, 50, 56);
	font-weight: 700;
	font-size: 14px;
	letter-spacing: 1px;
	background: rgba(136, 126, 126, 0.04);
	padding: 10px 20px;
	border: none;
	border-radius: 20px;
	outline: none;
	box-sizing: border-box;
	border: 2px solid rgba(0, 0, 0, 0.02);
	margin-bottom: 50px;
	margin-left: 46px;
	text-align: center;
	margin-bottom: 27px;
	font-family: 'Ubuntu', sans-serif;
}

.un:focus, .pass:focus {
	border: 2px solid rgba(0, 0, 0, 0.18) !important;
}

.submit {
	cursor: pointer;
	border-radius: 5em;
	color: white;
	background: linear-gradient(to right, #1E90FF, #00BFFF);
	border: 0;
	padding-left: 40px;
	padding-right: 40px;
	padding-bottom: 10px;
	padding-top: 10px;
	font-family: 'Ubuntu', sans-serif;
	margin-left: 35%;
	font-size: 13px;
	box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);
}

.forgot {
	text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);
	color: #FFD700;
	padding-top: 15px;
}

a {
	text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);
	color: #E1BEE7;
	text-decoration: none
}

@media ( max-width : 600px) {
	.main {
		border-radius: 0px;
	}
}
</style>
	<c:if test="${msg !=null}">

		<c:if test="${msg.toString() eq 'Reported' }">
			<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
    <symbol id="exclamation-triangle-fill" fill="currentColor"
					viewBox="0 0 16 16">
    <path
					d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z" />
    </symbol>
    </svg>
			<div class="alert alert-success d-flex align-items-center"
				role="alert">
				<svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img"
					aria-label="Success:">
				<use xlink:href="#check-circle-fill" /></svg>
				<div>${msg}
					<a href="userPage" class="alert-link">Back to your page</a>.
				</div>
			</div>
		</c:if>
		<c:if test="${msg.toString() eq 'You have reported this page' }">
			<symbol id="info-fill" fill="currentColor" viewBox="0 0 16 16">
			<path
				d="M8 16A8 8 0 1 0 8 0a8 8 0 0 0 0 16zm.93-9.412-1 4.705c-.07.34.029.533.304.533.194 0 .487-.07.686-.246l-.088.416c-.287.346-.92.598-1.465.598-.703 0-1.002-.422-.808-1.319l.738-3.468c.064-.293.006-.399-.287-.47l-.451-.081.082-.381 2.29-.287zM8 5.5a1 1 0 1 1 0-2 1 1 0 0 1 0 2z" />
			</symbol>
			<div class="alert alert-danger d-flex align-items-center"
				role="alert">
				<svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img"
					aria-label="Danger:">
				<use xlink:href="#exclamation-triangle-fill" /></svg>
				<div>${msg}</div>
			</div>

		</c:if>
	</c:if>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><b>Mini Wiki</b></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="userPage">Accueil</a>
        </li>
        
        <c:if test="${ rep != null }">
        <c:forEach items="${rep}" var="ree">
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">${ ree.username.toString().substring(1, ree.username.toString().length()-1) }</a>
        </li>
        </c:forEach>
        </c:if>
      </ul>
      <form class="d-flex">
       
        <a href="logout" class="btn btn-outline-success">Déconnecter</a>
      </form>
    </div>
  </div>
</nav>
	<div class="main">
		<p class="sign" align="center">Reporter un article</p>
			<c:if test="${rep !=null}">
		<form action="report" method="post">
				<c:forEach items="${rep}" var="r">
						<input type="hidden" class="un" name="username"
							value="${ r.username.toString().substring(1, r.username.toString().length()-1) }"
							readonly />
				</c:forEach>
					<c:if test="${id !=null}">
						<input type="hidden" class="un " align="center" name="page" value="${id}"
							readonly />
					</c:if>

			</c:if>
						<textarea class="pass" align="center" name="contenu"
							placeholder="Content" required="required"></textarea>
			<input type="submit" class="submit" align="center" value="Report">

		</form>
	</div>

</body>

</html>