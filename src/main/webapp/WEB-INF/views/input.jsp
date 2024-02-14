<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BMI Calculator - Input</title>
</head>
<body>
    <h2>Enter Height and Weight</h2>
   <form method="POST" action="bmi">
       Height (inches): <input type="text" name="height">
       Weight (pounds): <input type="text" name="weight">

       <input type="submit" />
   </form>
</body>
</html>
