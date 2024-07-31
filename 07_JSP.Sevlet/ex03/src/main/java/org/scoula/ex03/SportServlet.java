package org.scoula.ex03;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sports")
public class SportServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String[] sports = request.getParameterValues("sports");
        String sex = request.getParameter("sex");

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        // 자바 I/O
        PrintWriter out = response.getWriter();
        // html 작성및 출력
        out.print("<html><body>");
        for (String sport : sports) {
            out.print("좋아하는 운동 : " + sport + "<br>");
        }
        out.print("성별 : " + sex + "<br>");
        out.print("</body></html>");
    }
}
