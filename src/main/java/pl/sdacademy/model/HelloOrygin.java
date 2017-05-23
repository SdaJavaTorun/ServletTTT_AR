package pl.sdacademy.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RENT on 2017-05-23.
 */
public class HelloOrygin extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String who = req.getParameter("who");
        if (who == null) {
            who = "stranger";
        }

        req.setAttribute("who", who);
        req.getRequestDispatcher("/hello.jsp").forward(req, resp);
    }
}
