package www.newproj.com.newpro;



/**
 * Created by root on 5/3/18.
 */

public class Clientdata {
    int client_id;
    String client_name;
    String client_lastname;
    String client_phone_number;
    String client_emailid;
    String client_password;

    public Clientdata(String name, String lastname, String email, String mobile, String password, String dob){

    }

    public Clientdata(int client_id, String client_name, String client_lastname, String client_emailid, String client_phone_number, String client_password) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_lastname = client_lastname;
        this.client_emailid = client_emailid;
        this.client_phone_number = client_phone_number;
        this.client_password = client_password;
    }

    public Clientdata(String client_name, String client_lastname, String client_emailid, String client_phone_number, String client_password) {
        this.client_name = client_name;
        this.client_lastname = client_lastname;
        this.client_emailid = client_emailid;
        this.client_phone_number = client_phone_number;
        this.client_password = client_password;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_lastname() {
        return client_lastname;
    }

    public void setClient_lastname(String client_lastname) {
        this.client_lastname = client_lastname;
    }

    public String getClient_phone_number() {
        return client_phone_number;
    }

    public void setClient_phone_number(String client_phone_number) {
        this.client_phone_number = client_phone_number;
    }

    public String getClient_emailid() {
        return client_emailid;
    }

    public void setClient_emailid(String client_emailid) {
        this.client_emailid = client_emailid;
    }

    public String getClient_password() {
        return client_password;
    }

    public void setClient_password(String client_password) {
        this.client_password = client_password;
    }
}
