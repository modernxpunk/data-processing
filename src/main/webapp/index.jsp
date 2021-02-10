<%-- 
    Document   : index
    Created on : 10 февр. 2021 г., 19:05:08
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Kovalskyi</title>
        
        <link href="css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="background">
            <h1 class="title">Kovalskyi Alex project!</h1>
            <h2>About me</h2>
            <div class="about">
                Student of Taras Shevchenko National University of Kyiv<br>
            </div>
            <div class="menu">
                <form action="<%=request.getContextPath()%>/form" method="get">
                    <button class="button" type="submit">Open form</button>
                </form>
            </div>    
        </div>
    </body>
</html>