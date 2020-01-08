import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = "/order-form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setHeader("content-type", "text/html");
        PrintWriter write = res.getWriter();
        write.println("<form method=\"POST\" action=\"/order-summary\">\n" +
                "<label for=\"product\">Product:</label>\n" +
                "<input id=\"product\" name=\"product\" placeholder=\"Enter the product\" />\n" + "<br>" +
                "<label for=\"quantity\">Quantity:</label>\n" +
                "<input id=\"quantity\" name=\"quantity\" placeholder=\"Enter the amount\" />" + "<br>" +
                "<input type=\"submit\" />" + "</form>");
    }

}
