<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <!-- <meta charset="utf-8"> -->
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Signup</title>
  </head>
  <body>
  <% 
   String title=(String)request.getAttribute("header"); 
  %>
  <h3 class="text-center"><%=title %></h3> 
  <div class="container mt-5">
<!--  <h1>${header}</h1>  Not Working need to fix it  -->
  <form action="processForm" method="post">
    <div class="form-group" >
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="emailId">
    </div>
  
    <div class="form-group" >
    <label for="exampleInputEmail1">User Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Username" name="user">
    </div>
  
    <div class="form-group" >
    <label for="exampleInputEmail1">User password</label>
    <input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="userPaswword" placeholder="Enter Password" name="password">
   </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-success">Sign Up</button>
  </div>
   </form>
   </div>
  </body>
</html>