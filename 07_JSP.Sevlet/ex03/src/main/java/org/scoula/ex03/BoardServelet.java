package org.scoula.ex03;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/board")
public class BoardServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // MINE 타입 설정
        response.setContentType("text/html;charset=UTF-8");
        // 자바 I/O
        PrintWriter out = response.getWriter();
        // html 작성및 출력
        out.print("<html><body>");

        Enumeration<String> enu = request.getParameterNames();

        while (enu.hasMoreElements()) {
            String name = enu.nextElement();
            String value = request.getParameter(name);
            out.print(name + ": " + value + "<br>");
        }
        out.print("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
