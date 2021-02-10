<%-- 
    Document   : submit
    Created on : 10 февр. 2021 г., 19:06:51
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/main_header.jsp" />
<div class="form_wrapper">
    <p>Name: <%= request.getParameter("name")%></p><br>
    
    <p>Gender: 
    <%
    String gender = request.getParameter("gender");
    if (gender == null) {
        out.print("unknown");
    }
    else out.print(gender);
    %>
    </p><br>

    <p>Languages:
    <%
    String[] languages = request.getParameterValues("language");
    if (languages != null) {
    for (int i = 0; i < languages.length; i++) {
            out.print(languages[i]+" ");
        }                 
        }else {
        out.print("no choose");
        }
    %>
    </p><br>
    <br/>
    
    <p>Country: 
    <%
    String country = request.getParameter("country");
    if (country == null) {
        out.print("unknown");
    }
    else out.print(country);
    %>
    </p>
    <a class="return" href="<%=request.getContextPath()%>">Return</a>
</div>  
    
<jsp:include page="include/main_footer.jsp" />