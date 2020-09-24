<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2020, 5:35:48 PM
    Author     : 789438
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
        <h1>Age Calculator</h1>
        <br>
        <label>
           Enter your age :
        </label>
        <input type="text" name="agenum" value="" min="0" max="100">
        <br>
        <br>
        <br>
        <input type="submit" name="submit" value="Age next birthday">
        <br>
        <br>
        <h2>${Age}</h2>
        <a href="#">Arithmetic Calculator</a>
       
        </form>
        
    </body>
</html>
