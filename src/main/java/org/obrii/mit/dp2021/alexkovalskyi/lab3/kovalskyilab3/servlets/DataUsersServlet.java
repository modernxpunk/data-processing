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
import javax.servlet.http.HttpServletResponse;
import org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.data.Data;
import org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.usersStore.UserStoreRefactor;
import org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.fileworks.FileWorker;

@WebServlet(name = "DataUsersServlet", urlPatterns = {""})
public class DataUsersServlet extends HttpServlet {
    UserStoreRefactor usersRefactorer = new UserStoreRefactor(FileWorker.getFileName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (FileWorker.getFileName().equals("")) {
            FileWorker.setFileName(this.getServletContext().getRealPath("") + "data.txt");
            usersRefactorer = new UserStoreRefactor(FileWorker.getFileName());
        }
        request.setAttribute("data", usersRefactorer.readDataList());
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        usersRefactorer.createDataList(new Data(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("name"),
                Integer.parseInt(request.getParameter("age")),
                request.getParameter("email")
        ));
        doGet(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("id"));
        usersRefactorer.updateDataList(userId,
                new Data(
                        userId,
                        request.getParameter("name"),
                        Integer.parseInt(request.getParameter("age")),
                        request.getParameter("email")
                ));
        doGet(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("id"));
        usersRefactorer.deleteDataList(userId);
        doGet(request, response);
    }

}