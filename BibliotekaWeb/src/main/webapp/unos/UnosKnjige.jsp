<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Unos nove knjige</title>
</head>
<body>
	<form action="/Library/knjige/" method="post" >
		<table>
			<tr>
				<td>Naslov: </td>
				<td><input type="text" name="naslov" > </td>
			</tr>
			<tr>
				<td>Autor: </td>
				<td><input type="text" name="autor" > </td>
			</tr>
			<tr>
				<td>Izdavac: </td>
				<td><input type="text" name="izdavac" > </td>
			</tr>
			<tr>
				<td>godina izdanja: </td>
				<td><input type="text" name="godinaIzdanja" > </td>
			</tr>
			<tr>
				<td><input type="submit" value="sacuvaj" ></td>
			</tr>
		</table>
	
	</form>
</body>
</html>