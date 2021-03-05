<%-- 
    Document   : update
    Created on : 5 мар. 2021 г., 19:53:12
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
  </head>
  <body>
            <form action="<%=request.getContextPath()%>/change" method="post">
              <input type="hidden" name="id" value="<%=request.getParameter("id")%>"/>
              <label>Name</label><input type="text" required name="name" value="<%=request.getParameter("name")%>"><br><br>
              <label>Email</label><input type="text" required name="email" value="<%=request.getParameter("email")%>"><br><br>
              <label>Age</label><input type="number" required name="age" value="<%=request.getParameter("age")%>"><br><br>
              <input type="submit" value="Save">
            </form>
  </body>
</html>



