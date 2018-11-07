

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class ImageServlet
 */
@SuppressWarnings("serial")
@WebServlet("/ImageServlet")
public class ImageServlet extends HttpServlet {
	CommonFunction cf = new CommonFunction();
	ImageGetterDOA ig = new ImageGetterDOA();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String imageName = request.getParameter("name");
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("success", true);
			jsonObject.put("message", "Image Found");
			jsonObject.put("data",ig.ImageToBAse64(imageName));
			cf.response(response,jsonObject.toString());
		} catch (JSONException e) {
			
			try {
				jsonObject.put("success", true);
				jsonObject.put("message", "Image Found");
				jsonObject.put("data","Null");
			cf.response(response,jsonObject.toString());
			} catch (JSONException e1) {}
			
		}
		
	}

}
