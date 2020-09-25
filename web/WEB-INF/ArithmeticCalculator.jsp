<%-- 
    Document   : ArithmeticCalculator
    Created on : Sep 24, 2020, 5:44:23 PM
    Author     : 789438
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link href="style/design.css" rel="stylesheet" type="text/css" >
    </head>
    <body>
        <form method="post" action="arithmetic">
            <table>
                <th colspan="2"><h1>Arithmetic Calculator</h1></th>
                <tr>
                    <td>
            <label>First :</label>
            </td>
            <td>
            <input type="text" name="firstnumber" value="${Value1}">
            </td>
            </tr>
            <tr>
                <td>
             <label>Second :</label>
                </td>
            
                <td>
            <input type="text" name="secondnumber" value="${Value2}">
                </td>
            </tr>
            <tr>
                <td>
                    
                </td>
                <td>
            <input type="submit" name="s1" value="+">
               
             <input type="submit" name="s1" value="*" >
               
              <input type="submit" name="s1" value="-">
               
              
              <input type="submit" name="s1" value="%">
              </td>
               <tr>
               <tr>
                   <td>
                       <p>Result :</p>
                   </td>
                     <td>
                       <p>${Result}<p>
                   </td>
                   
               </tr>
            </table>
            <a href="age">Age Calculator</a>
        </form>
       
    </body>
</html>
