package hu.pollakt.javaee.servlet;

import hu.pollakt.javaee.samples.ejbs.GreeterEjb;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GreeterServlet")
public class GreeterServlet extends HttpServlet {

    @EJB
    private GreeterEjb greeterEjb;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String message = greeterEjb.getGreetingMessage();
        response.getWriter().print(message);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().print("my POST");
    }

    public GreeterEjb getGreeterEjb() {
        return greeterEjb;
    }

    // CDI setter metódussal injec-tál
    public void setGreeterEjb(GreeterEjb greeterEjb) {
        this.greeterEjb = greeterEjb;
    }
}
