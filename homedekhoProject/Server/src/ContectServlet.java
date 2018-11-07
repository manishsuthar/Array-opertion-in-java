

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

/**
 * Servlet implementation class ContectServlet
 */
@WebServlet("/ContectServlet")
public class ContectServlet extends HttpServlet {
	CommonFunction cf =  new CommonFunction();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String message = request.getParameter("message");
		ContecPojo contact = new ContecPojo();
		contact.setName(name);
		contact.setPhone(phone);
		contact.setEmail(email);
		contact.setMessage(message);
		ContactController CC = new ContactController();
		try {
			String res = CC.ContactSave(contact);
			cf.response(response,res);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
