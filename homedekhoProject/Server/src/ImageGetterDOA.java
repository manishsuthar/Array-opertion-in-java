import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class ImageGetterDOA{
	public String ImageToBAse64(String imageName) throws IOException {
		String filePath = "D:\\uploads\\"+imageName;
		byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);
		return encodedString;
	}
}
