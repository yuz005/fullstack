package org.scoula.ex04.cookie;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart_delete_cookie")
public class CartDeleteCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
//기존 쿠키 얻기
        Cookie [] cookies = request.getCookies();
        if( cookies != null ){
            for (Cookie c : cookies) {
                c.setMaxAge(1);
                response.addCookie(c);
            }
        }
        out.print("장바구니 비었음<br>");
        out.print("<a href='cookie_product.jsp'>상품 선택 페이지</a><br>");
        out.print("</body></html>");
    }
}
