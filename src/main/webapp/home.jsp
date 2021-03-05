<%-- 
    Document   : home
    Created on : 5 мар. 2021 г., 19:45:34
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.data.Data"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>admin</title>
    <style><%@include file="/css/styleHome.css"%></style>
  </head>
  <body>
    <%List<Data> dataList = (List<Data>) request.getAttribute("data");%>
    <form action="<%=request.getContextPath()%>/form.jsp">
        <button type="submit" class="buttonCreate">create</button>
    </form>
      <table>
          <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Age</th>
              <th>Email</th>
          </tr>
      <%for (Data data : dataList) {%>
      <tr>
          <td><p><%=data.getId()%></p></td>
          <td><p><%=data.getName()%></p></td>
          <td><p><%=data.getAge()%></p></td>
          <td><p><%=data.getEmail()%></p></td>
          <td>
              <form action="<%=request.getContextPath()%>/update.jsp" method="post">
                <input type="hidden" name="id" value="<%=data.getId()%>">
                <input type="hidden" name="name" value="<%=data.getName()%>">
                <input type="hidden" name="age" value="<%=data.getAge()%>">
                <input type="hidden" name="email" value="<%=data.getEmail()%>">
                <input type="submit" value="edit">
              </form>
          </td>
          <td>
              <form action="<%=request.getContextPath()%>/change" method="get">
                  <input type="hidden" name="id" value="<%=data.getId()%>">
                  <input type="submit" value="delete">
              </form>
          </td>
      <tr>
      <%}%>
     <table>
    </body>
    </html>