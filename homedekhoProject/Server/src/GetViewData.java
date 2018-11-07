

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetViewData
 */
@WebServlet("/GetViewData")
public class GetViewData extends HttpServlet {
	GettingController gc = new GettingController();
	CommonFunction cf = new CommonFunction();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id = request.getParameter("id");
			cf.response(response,gc.GetViewRequestHandler(id).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
