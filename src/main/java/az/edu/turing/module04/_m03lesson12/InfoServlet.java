package az.edu.turing.module04._m03lesson12;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("UTF-16");

        String name = req.getParameter("name");
        String msg = String.format("Hello, %s!", name != null ? name : "World");
        resp.getWriter().print(msg);

    }
}
