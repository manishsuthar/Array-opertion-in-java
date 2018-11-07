

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/GettingDataModal")
public class GettingDataModal extends HttpServlet {
     GettingController gc = new GettingController();
     CommonFunction cf = new CommonFunction();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			cf.response(response,gc.GetRequestHandler().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
