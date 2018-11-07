import java.sql.ResultSet;

import org.json.JSONArray;
import org.json.JSONObject;

public class SearchController {
	DbHandler dh = new DbHandler();
	CommonFunction cf = new CommonFunction();
	public String searchExecute(Searchpojo sp) throws Exception {
		String search = sp.getSearch();
		String sql = "SELECT * FROM `details` WHERE `address`||`city`||`state`||`type`||`description` LIKE '"+search+"' ORDER BY `date` DESC";
		System.out.println(sql);
		ResultSet rs = dh.GettingQuery(sql);
		JSONObject jsonObject = new JSONObject();
		JSONArray jsArray = cf.convertResultSetIntoJSON(rs);
		jsonObject.put("data", jsArray);
		jsonObject.put("success",true);
		jsonObject.put("message","Data Found");
		return jsonObject.toString();
	}
}
