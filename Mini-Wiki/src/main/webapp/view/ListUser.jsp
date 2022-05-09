<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
 <link type="text/css" rel="stylesheet" href="css/style.css">
  <link type="text/css" href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link type="text/css" rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <link type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  
<meta charset="ISO-8859-1">
<title>Liste Reports --MiniWiki</title>
<style>body {background-color: #F8F8FF;
	font-family: 'Ubuntu', sans-serif;}</style>
</head>
<body>
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
      </ul>
      <form class="d-flex">
       
        <a href="logout" class="btn btn-outline-success">Déconnecter</a>
      </form>
    </div>
  </div>
</nav>
<br>
<br>

<table class="table">
  <thead>
    <tr class="table-secondary">
    
      <th scope="col">Username</th>
      <th scope="col">Page Title</th>
      <th scope="col">Content</th>
    </tr>
  </thead>
  <tbody>
  <c:if test="${ rick != null }">
        <c:forEach items="${rick}" var="re">
    <tr>
     
      <td>${ re.username.toString().substring(1, re.username.toString().length()-1) }</td>
      <td>${ re.email.toString().substring(1, re.email.toString().length()-1) }</td>
    </tr>
     </c:forEach>
     </c:if>
    <tbody>
  <c:if test="${ msg!= null }">
       
    <tr>
     
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><b style="color:red;">${msg}</b></td>
    </tr>
    
     </c:if>  
  </tbody>
</table>
</body>
</html>