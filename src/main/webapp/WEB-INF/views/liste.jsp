<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${etudiants}" var="etd">

<h1>Nom: ${etd.nom}</h1>
<h1>Prenom ${etd.prenom}</h1>
<a href="/school/find/${etd.idEtudiant}">Affiche la description de l'utilisateur</a>
</c:forEach>

</body>
</html>