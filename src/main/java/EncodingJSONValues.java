import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.Base64;
import java.util.Base64.Encoder;
public class EncodingJSONValues {
        public static void main(String[] args) {
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(new FileReader("./src/main/java/Data.json"));
                JSONObject jsonObject = (JSONObject)obj;
                Encoder encoder = Base64.getEncoder();
                String password = (String)jsonObject.get("password");
                String encoded_password = encoder.encodeToString(password.getBytes());
                System.out.println(encoded_password);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
}
