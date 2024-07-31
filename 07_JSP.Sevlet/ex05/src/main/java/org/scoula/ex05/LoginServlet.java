package org.scoula.ex05;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userid= request.getParameter("userid");
        String passwd = request.getParameter("passwd");

        request.setAttribute("userid", userid);
        request.setAttribute("passwd", passwd);

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}