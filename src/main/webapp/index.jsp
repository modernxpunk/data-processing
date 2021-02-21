<%-- 
    Document   : index
    Created on : 21 февр. 2021 г., 11:14:18
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/main_header.jsp" />

            <div class="menu">
                <form action="<%=request.getContextPath()%>/form" method="get">
                    <button class="button" type="submit">Click</button>
                </form>
            </div>
                    
                    <img width="1000px" src="img/uml.png">
                    
<jsp:include page="include/main_footer.jsp"/> 