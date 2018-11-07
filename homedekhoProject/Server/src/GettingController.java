import java.sql.ResultSet;

import org.json.JSONObject;

public class GettingController {
	  DbHandler dh = new DbHandler();
	  CommonFunction cf = new CommonFunction();
	  public JSONObject GetRequestHandler() throws Exception {
		  String sql = "SELECT * FROM `details` ORDER BY `date` DESC";
		  ResultSet rs = dh.GettingQuery(sql);
		  JSONObject jsonObject = new JSONObject();
		  jsonObject.put("success",true);
		  jsonObject.put("message","Data Getting");
		  jsonObject.put("data",cf.convertResultSetIntoJSON(rs));
		  return jsonObject;
	  }
	  
	  public JSONObject GetViewRequestHandler(String id) throws Exception{
		  String sql = "SELECT * FROM `details` WHERE `id`="+id;
		  ResultSet rs = dh.GettingQuery(sql);
		  JSONObject jsonObject = new JSONObject();
		  jsonObject.put("success",true);
		  jsonObject.put("message","Data Getting");
		  jsonObject.put("data",cf.convertResultSetIntoJSON(rs));
		  return jsonObject;
	  }
}
