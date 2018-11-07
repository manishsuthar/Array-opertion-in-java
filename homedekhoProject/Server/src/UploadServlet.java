import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.JSONException;
import org.json.JSONObject;

public class UploadServlet extends HttpServlet {
    private final String UPLOAD_DIRECTORY = "D:/uploads";
    CommonFunction cf = new CommonFunction();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	JSONObject jsonObject = new JSONObject();
    	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	String tempName = null;
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        name = timestamp.getTime()+name;
                        tempName = name;
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                    }
                }
                try {
                    jsonObject.put("message","Successfully upload");
                    jsonObject.put("success",true);
                    jsonObject.put("name",tempName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
            	try {
                    jsonObject.put("message","Error "+ex);
                    jsonObject.put("success",false);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }          
         
        }else{
        	try {
                jsonObject.put("message","Error ");
                jsonObject.put("success",false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        cf.response(response,jsonObject.toString());
     
    }
  
}