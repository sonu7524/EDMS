import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccountdataHashMap {
    HashMap<List<String>, data> hm = new HashMap<>();
    static void createAccount(String email, String password, String username, int contactno){
        List<String> login = new ArrayList<>();
        login.add(email);
        login.add(password);
        data obj = new data(username, contactno);
    }
}
class data{
    public String username;
    public int contactno;
    data(String username, int contactno){
        this.contactno = contactno;
        this.username = username;
    }

}
