<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>communes</title>
</head>
<body>
<h2> Recherche de communes </h2>
<form action="CommuneServlet">
Par Code postal <input name ="cp" id="cp" size="8"> <button> Rechercher </button> 
</form>
<form action="CommunesParDepartementServlet">Par départements : <input name ="departement" id="departement"></form> <button>Rechercher</button>
</body>
</html>