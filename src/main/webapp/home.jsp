

<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.alexkovalskyi.Database.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Abril+Fatface&display=swap');
            sector{
                max-width: 1170px;
                margin: auto;
                padding: 0 15px;
                margin-top: 3rem;
                margin-bottom: 3rem;
            }
            table {
                width: 100%;
                box-shadow: 0 5px 15px rgba(0,0,0,0.2);
                border-collapse: collapse;
            }
            table th{
                background-color: #383a59;
            }
            .here {
                color: #bd93f9;
                font-size: 20px;
            }
            table th, table td {
                text-align: center;
                padding: 10px;
            }
            .users {
                transition: all .3s;
            }
             .users:nth-child(odd) {
                background-color: #282a36;
            }
             .users:nth-child(even) {
                background-color: #282a40;
            }
            
            table th{
                color: white;
            }
            span {
                color: #f4b76b;
                font-family: 'Abril Fatface', cursive;
            }
            input[type="submit"]{
                font-family: 'Abril Fatface', cursive;
                background-color: #bd93f9;
                border: none;
                color: #383a59;
                text-align: center;
                text-decoration: none;
                font-size: 16px;
                border-radius: 20px;
           }
           input[type="text"]{
             
           }
           .sub{
               padding: 10px;
               text-align: center;
              width: 100%;
              margin: 10px auto;
           }
           body{
               background-color: #282a36;
           }
        </style>
    </head>
    <body>
    <%List<Data> dataList = (List<Data>) request.getAttribute("data");%>
    <sector>
        <table>
            <thead>
                <tr>
                    <th><span class="here">id</span></th>
                    <th><span class="here">name</span></th>
                    <th><span class="here">age</span></th>
                    <th><span class="here">gender</span></th>
                    <th><span class="here">email</span></th>
                    <th><span class="here">update</span></th>
                    <th><span class="here">delete</span></th>
                </tr>
            </thead>
            <tbody>
            <%int i = 1;%>
            <%for (Data data : dataList) {%>
            <tr class="users">
                <td><span><%=i++%></span></td>
                <td><span><%=data.getName()%></span></td>
                <td><span><%=data.getAge()%></span></td>
                <td><span><%=data.getGender()%></span></td>
                <td><span><%=data.getEmail()%></span></td>
                <td>
                    <form action="update.jsp" method="post">
                        <input type="hidden" name="id" value="<%=data.getId()%>">
                        <input type="hidden" name="name" value="<%=data.getName()%>">
                        <input type="hidden" name="age" value="<%=data.getAge()%>">
                        <input type="hidden" name="gender" value="<%=data.getGender()%>">
                        <input type="hidden" name="email" value="<%=data.getEmail()%>">
                        <input type="submit" value="Update">
                    </form>
                </td>
                <td>
                    <form action="<%=request.getContextPath()%>/form" method="get">
                        <input type="hidden" name="id" value="<%=data.getId()%>">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>
           <%}%>
            </tbody>
        </table> 
         <div class="sub">
        <form action="create.jsp" methd="get">
            <input type="submit" value="ADD USER" >
        </form>
         </div>
    </sector>
    </body>
</html>                 