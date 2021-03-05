<%-- 
    Document   : form
    Created on : 5 мар. 2021 г., 19:41:45
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Form</title>
  </head>
  <body>
    <form action="<%=request.getContextPath()%>/" method="post">
      <input type="hidden" name="id" value="0"/>
      <label>Name</label><input type="text" required name="name"><br><br>
      <label>Email</label><input type="text" required name="email"><br><br>
      <label>Age</label><input type="number" required name="age"><br><br>
          <input type="submit" value="Create">
    </form>
  </body>
</html>
