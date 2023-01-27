package org.xiao.sr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context = this.getServletContext();
        String username="肖萧然";
        context.setAttribute("username",username);
        context.getRequestDispatcher("/getc").forward(req,resp);

    }
}