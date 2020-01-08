import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderSummaryServlet", urlPatterns = "/order-summary")
public class OrderSummaryServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter write = res.getWriter();
        String product = req.getParameter("product");
        String quantity = req.getParameter("quantity");
        write.println("-You've selected " + product + "<br>");
        write.println("-You wanted " + quantity);

    }
}
