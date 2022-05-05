<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"  />
</head>
<body>
<form action="Accueil" method="GET">
<div class="input-group">
  <input type="search" name="thematique"  class="form-control rounded" placeholder="Search" aria-label="Search" aria-describedby="search-addon"/>
  <select name="choose">
  	<c:forEach items="${thematiques}" var="t">
					<option value="${t._id }">
						${t.NomThematique }
					</option>
		</c:forEach>
  </select>
  <input type="submit" value="submit">
</div>
</form>
</body>
</html>