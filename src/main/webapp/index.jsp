<%-- 
    Document   : index
    Created on : 10 февр. 2021 г., 19:05:08
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="include/main_header.jsp" />

    <h1 class="title">Welcome to Kovalskyi Alex project!</h1>
            <h2>About me</h2>
            <div class="about">
                Student of Taras Shevchenko National University of Kyiv<br>
            </div>
            <div class="menu">
                <form action="<%=request.getContextPath()%>/form" method="get">
                    <button class="button" type="submit">Open form</button>
                </form>
            </div>
                    
<jsp:include page="include/main_footer.jsp"/> 