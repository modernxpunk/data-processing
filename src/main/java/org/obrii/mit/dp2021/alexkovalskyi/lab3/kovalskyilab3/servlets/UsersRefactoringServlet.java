/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;;

/**
 *
 * @author alex
 */

@WebServlet(name = "UsersRefactoringServlet", urlPatterns = {"/form"})
public class UsersRefactoringServlet extends HttpServlet {

    DataUsersServlet dusServlet = new DataUsersServlet();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dusServlet.doDelete(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dusServlet.doPut(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}