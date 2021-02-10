<%-- 
    Document   : index
    Created on : 10 февр. 2021 г., 19:05:08
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/main_header.jsp" />

            <div class="menu">
                <form action="<%=request.getContextPath()%>/form" method="get">
                    <button class="button" type="submit">Click</button>
                </form>
            </div>
                    
<jsp:include page="include/main_footer.jsp"/> 