import java.sql.ResultSet;
import java.sql.Statement;

public class Register {
    public void customerRegistration(String email, String password, String first_name, String last_name,String address, String mobile) {
        String query = "INSERT INTO `customer` (`email`,`password`,`first_name`,`last_name`,`address`,`mobile`) " +
                "VALUES('"+email+"','"+password+"','"+first_name+"','"+last_name+"','"+address+"',"+mobile+")";
        try {
            DatabaseConnection dbCon = new DatabaseConnection();
            dbCon.executeUpdateQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void customerRegistration(String email, String password, String first_name, String last_name,String address, String mobile) {
        String query = "INSERT INTO `customer` (`email`,`password`,`first_name`,`last_name`,`address`,`mobile`) " +
                "VALUES('"+email+"','"+password+"','"+first_name+"','"+last_name+"','"+address+"',"+mobile+")";
        try {
            DatabaseConnection dbCon = new DatabaseConnection();
            dbCon.executeUpdateQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}