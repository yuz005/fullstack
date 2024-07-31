package org.scoula.ex03;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");
        // MINE 타입 설정
        response.setContentType("text/html;charset=UTF-8");
        // 자바 I/O
        PrintWriter out = response.getWriter();
        // html 작성및 출력
        out.print("<html><body>");
        out.print("아이디값 : " + userid + "<br>");
        out.print("비밀번호값 : " + passwd + "<br>");
        out.print("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
