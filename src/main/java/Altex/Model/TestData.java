package Altex.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.simple.JSONObject;

public class TestData {
    //@JsonProperty("username")
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String postal_code;

    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }

    public String getFirst_name()
    {
        return first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public String getPostal_code()
    {
        return postal_code;
    }
}
