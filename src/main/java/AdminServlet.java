import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/access")
public class AdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/rejected.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //getting master access code (password)
        String sessionCode = (String) request.getSession().getAttribute("access_code");

        //get the code the user typed in
        String requestCode = (String) request.getParameter("code");

        //check for access session not initialized
        if (sessionCode == null || requestCode == null) {
            request.getRequestDispatcher("/WEB-INF/rejected.jsp").forward(request, response);
            return;
        }

        //if correct code, go to admin page or else "hence the else" reject the request
        if(requestCode.equals(sessionCode)){
            request.getRequestDispatcher("WEB-INF/admin.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("WEB/INF/rejected.jsp").forward(request, response);
        }
    }
}
