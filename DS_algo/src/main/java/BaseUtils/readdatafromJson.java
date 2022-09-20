package BaseUtils;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readdatafromJson {
    public static String username;
    public static String password;
    public static String invalidusername;
    public static String invalidpassword;
    public static void readtestdatafromjson() throws IOException, ParseException {
        JSONParser json = new JSONParser();
        FileReader file = new FileReader("/Users/Indu/Indu_Files/DS_algo/src/main/resources/TestData/usernamepassword.json");

        Object obj = json.parse(file);
        JSONObject testdata = (JSONObject)obj;
        username = (String) testdata.get("Username");
        password = (String) testdata.get("Password");
        invalidusername = (String) testdata.get("invalidusername");
        invalidpassword = (String) testdata.get("invalidpassword");
    }
}
