package pl.sdacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldFantastic extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html");
        String name = req.getParameter("name");
        if (name == null)
            name = "Stefan";
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello " + name + " </h1>");
    }
}
