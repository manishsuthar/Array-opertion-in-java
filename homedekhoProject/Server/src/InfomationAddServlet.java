import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Manish on 10/30/2018.
 */
public class InfomationAddServlet extends javax.servlet.http.HttpServlet {
	CommonFunction cf = new CommonFunction();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String propertyType = request.getParameter("propertyType");
        boolean parking = Boolean.parseBoolean(request.getParameter("parking"));
        boolean transport = Boolean.parseBoolean(request.getParameter("transport"));
        String description = request.getParameter("description");
        String ctname = request.getParameter("ctname");
        String ctphone = request.getParameter("ctphone");
        String ctemail = request.getParameter("ctemail");
        String profileimage = request.getParameter("profileimage");
        String image1 = request.getParameter("image1");
        String image2 = request.getParameter("image2");
        String image3 = request.getParameter("image3");
        String image4 = request.getParameter("image4");
        int price = Integer.parseInt(request.getParameter("price"));
        //Adding Infomation to Object
        AddInfomation addInfomation = new AddInfomation();
        addInfomation.setAddress(address);
        addInfomation.setCity(city);
        addInfomation.setState(state);
        addInfomation.setPropertyType(propertyType);
        addInfomation.setParking(parking);
        addInfomation.setTransport(transport);
        addInfomation.setDescription(description);
        addInfomation.setCtname(ctname);
        addInfomation. setCtphone(ctphone);
        addInfomation.setCtemail(ctemail);
        addInfomation.setProfileimage(profileimage);
        addInfomation.setImage1(image1);
        addInfomation.setImage2(image2);
        addInfomation.setImage3(image3);
        addInfomation.setImage4(image4);
        addInfomation.setPrice(price);
        AddDetails addDetails = new AddDetails();
        String result =  addDetails.AddNewDetails(addInfomation);
        JSONObject jsonres = new JSONObject();
        if(result.equals("Success")) {
        	try {
				jsonres.put("message","Data Uploaded");
				jsonres.put("success",true);
			} catch (JSONException e) {}
        	cf.response(response,jsonres.toString());
        }else {
        	try {
				jsonres.put("message","Error");
				jsonres.put("success",false);
			} catch (JSONException e) {}
        	cf.response(response,jsonres.toString());
        }

    }

}
