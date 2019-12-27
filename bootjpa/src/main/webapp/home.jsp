<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">

<form action="addAlien">

  <div class="form-group row">
    <label for="alienId" class="col-sm-2 col-form-label">Alien Id :</label>
    <div class="col-sm-3">
      <input type="text"  class="form-control" id="alienId" name="aid">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="alienName" class="col-sm-2 col-form-label">Alien Name :</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="alienName" name="aname">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="tech" class="col-sm-2 col-form-label">Tech :</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="tech" name="tech">
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
  
</form>

<br> <br>

<form action="getAlien">

  <div class="form-group row">
    <label for="getAlien" class="col-sm-2 col-form-label">Enter Alien Id :</label>
    <div class="col-sm-3">
      <input type="text"  class="form-control" id="getAlien" name="aid">
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
  
</form>

</div>

</body>
</html>