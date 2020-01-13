package Contacts;
import

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Contacts.ContactServlet", urlPatterns = "/contacts")
public class ContactServlet  extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("contacts", DaoFactory.getContactsDao().getContacts());
    request.getRequestDispatcher("/contact.jsp").forward(request, response);
}


}
