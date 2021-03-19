

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <style>
        body{
            background-color: #282a36;
        }
        form {
            background-color: blue;
            border-radius: 20px;
        }
    </style>
    <body>
    <form action="<%=request.getContextPath()%>/" method="post">
                <input type="hidden" name="id" value="0">
                Form<br>
                <input type="hidden" name="title" value="Submited"/>

                <input type="text" name="name" placeholder="Name" required><br/>
                <input type="text" name="age" placeholder="Age" required><br/>
                 <input type="text" name="gender" placeholder="Gender" required><br/>
                <input type="text" name="email" placeholder="Email"><br/>
                <button class="button" type="submit">Submit</button>
            </form>
    </body>
</html>
