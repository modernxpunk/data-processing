<%-- 
    Document   : form
    Created on : 10 февр. 2021 г., 19:05:58
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="include/main_header.jsp" />
<div class="form_wrapper">
    <form action="<%=request.getContextPath()%>/form" method="post">
                Fill in form <br>
                <input type="hidden" name="title" value="Submited"/>

                 <input type="text" name="name" placeholder="Your name"><br/>

                Gender: 
                <input type="radio" name="gender" value="male">Male    
                <input type="radio" name="gender" value="female">Female<br/>

                Languages know: 
                <div class="checkb">
                    <input type="checkbox" name="language" value="English">English
                    <input type="checkbox" name="language" value="Ukrainian">Ukrainian
                    <input type="checkbox" name="language" value="French">French <br/>
                </div>
                Country: 
                <select name="country">
                    <option value="Ukraine">Ukraine</option>
                    <option value="USA">USA</option>
                    <option value="UK">UK</option>
                    <option value="Finland">Finland</option>
                    <option value="Fiji">Fiji</option>
                </select><br/>
                <button class="button" type="submit">Submit</button>
            </form>
</div>
<jsp:include page="include/main_footer.jsp" /> 