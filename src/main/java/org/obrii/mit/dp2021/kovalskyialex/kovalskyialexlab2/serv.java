/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display.ChildDisplayNew;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display.ChildDisplayOld;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display.Display;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display.NewDisplayInterface;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display.OldDisplayInterface;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.user.User;
import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.user.UserInterface;

/**
 *
 * @author alex
 */
@WebServlet(name = "Servlet", urlPatterns = {"/form"})
public class serv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("form.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserInterface user = createUser(request.getParameter("name"));
        
        OldDisplayInterface display;
        
        if (request.getParameter("interface").equals("old")) {
            if (request.getParameter("message").equals("parent")) {
                display = new Display(user);
            } else {
                display = new ChildDisplayOld(user);
            }
        } else {
            display = new ChildDisplayNew(user);
        }
        
        List <String> messages = createMessages(display);
        request.setAttribute("messages", messages);
        request.getRequestDispatcher("submit.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
    public UserInterface createUser(String name) {
        try {
            int userNumber = Integer.parseInt(name);
            return new User(userNumber);
        } catch (NumberFormatException e) {
            return new User(name);
        }
    }
    
    public List<String> createMessages(OldDisplayInterface display) {
        List<String> result = new ArrayList();
        result.add(display.getMessage());
        
        if (display instanceof NewDisplayInterface) {
            result.add(((NewDisplayInterface) display).getAnotherMessage());
        }
        
        return result;
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}