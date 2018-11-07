//import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.SQLException;
//import javax.servlet.http.HttpServletResponse;
//import org.json.JSONArray;
//import org.json.JSONObject;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.Statement;

public class DbHandler {
    Connection con = null;
    Statement stmt = null;
    public boolean DbInsert(String sql){
        try
        {   con = DbConnection.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            return true;
        }
        catch (SQLException ex){
        	ex.printStackTrace();
        	return false;
        }
    }
    
    public ResultSet GettingQuery(String sql) {
    	ResultSet rs = null;
    	try
        {   con = DbConnection.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        }
        catch (SQLException ex){
        	ex.printStackTrace();
        	return rs;
        }
	}

}
