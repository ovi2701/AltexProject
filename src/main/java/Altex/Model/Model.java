package Altex.Model;
import org.json.simple.JSONObject;

public class Model {
    String username, password, first_name, last_name, postal_code;

    public void setUsername(JSONObject Jobj){
        this.username = (String)Jobj.get("username");
    }

    public void setPassword(JSONObject Jobj){
        this.password = (String)Jobj.get("password");
    }

    public void setFirst_name(JSONObject Jobj){
        this.first_name = (String)Jobj.get("first_name");
    }

    public void setLast_name(JSONObject Jobj){
        this.last_name = (String)Jobj.get("last_name");
    }

    public void setPostal_code(JSONObject Jobj){
        this.postal_code = (String)Jobj.get("postal_code");
    }

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
