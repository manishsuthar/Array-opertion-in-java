/**
 * Created by Manish on 10/30/2018.
 */
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
public class CommonFunction {
	public JSONArray convertResultSetIntoJSON(java.sql.ResultSet rs) throws Exception {
        JSONArray jsonArray = new JSONArray();
        while (rs.next()) {
            int total_rows = rs.getMetaData().getColumnCount();
            JSONObject obj = new JSONObject();
            for (int i = 0; i < total_rows; i++) {
                String columnName = rs.getMetaData().getColumnLabel(i + 1).toLowerCase();
                Object columnValue = rs.getObject(i + 1);
                if (columnValue == null){
                    columnValue = "null";
                }
                if (obj.has(columnName)){
                    columnName += "1";
                }
                obj.put(columnName, columnValue);
            }
            jsonArray.put(obj);
        }
        return jsonArray;
    }
    public String getCurrentDate() {
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        return currentTime;
    }
    public void response(HttpServletResponse resp, String msg) throws IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.println(msg);
    }

}
