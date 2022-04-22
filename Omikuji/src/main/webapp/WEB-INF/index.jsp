<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
<h3>Send an Omikuji!</h3>
    <form action='/omikuji/send' method='POST'>
	<label>Pick any number from 5 to 25</label>
		<input type="number" name="number" min="5" max="25">
	<label>Enter the name of any city.</label>
    	<input type="text" name='city'>
	<label>Enter the name of any real person</label>
    	<input type='text' name='name'>
    <label>Enter professional endeavor or hobby:</label>
    	<input type='text' name='hobby'>
    <label>Enter any type of living thing.</label>
    	<input type='text' name='live'>
    <label>Say something nice to someone:</label>
    	<textarea name="textarea"></textarea>
    <label>Send and show a friend</label>
    	<input type='submit' value='Enviar'>
    </form>

</body>
</html>