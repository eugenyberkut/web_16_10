package server;

import logic.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Yevhen on 16.10.2015.
 */
@WebServlet(name = "FirstServlet", urlPatterns = {"/first"})
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/first.jsp").forward(request,response);
        //processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>");
//        writer.println("</head");
//        writer.println("<body>");
//        writer.println("<h1>Hello from servlet</h1>");
//        writer.println("</body>");
//        writer.println("</html>");
        String aStr = request.getParameter("a");
        String bStr = request.getParameter("b");
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        Calculator calculator = new Calculator(a,b);
        request.setAttribute("calc", calculator);
        request.getRequestDispatcher("/first.jsp").forward(request,response);
    }


}
