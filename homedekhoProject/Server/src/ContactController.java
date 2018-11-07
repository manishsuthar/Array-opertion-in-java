import org.json.JSONException;
import org.json.JSONObject;

public class ContactController {
	public String ContactSave(ContecPojo contact) throws JSONException {
		String name = contact.getName();
		String email = contact.getEmail();
		String phone = contact.getPhone();
		String message = contact.getMessage();
		String sql = "INSERT INTO `contact`(`name`, `email`, `phone`, `message`) VALUES ('"+name+"','"+email+"','"+phone+"','"+message+"')";
		DbHandler db = new DbHandler();
		JSONObject jsonObject = new JSONObject();
		if(db.DbInsert(sql)) {
			jsonObject.put("success",true);
			jsonObject.put("message", "Value inseted");
		}else {
			jsonObject.put("success",false);
			jsonObject.put("message", "Error");
		}
		return jsonObject.toString();
	}
}
