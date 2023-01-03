import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailTextField;
    @FXML
    private Button closeButton;

    @FXML
    private Hyperlink forgotpasslink;


    @FXML
    private Button login;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private PasswordField passwordTextField;
    private String customerEmail;
    @FXML
    private Button register;
    Login log = new Login();

    @FXML
    void forgotPass(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("forgotpass.fxml"));
        Stage window = (Stage) forgotpasslink.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void loginButton(ActionEvent event) throws IOException {
        String email = emailTextField.getText();
        String password = passwordTextField.getText();
        try{
            if(log.customerLogin(email,password)){
                Parent root = FXMLLoader.load(getClass().getResource("OTP.fxml"));
                Stage window = (Stage) login.getScene().getWindow();
                window.setScene(new Scene(root));
            }
            else{
                loginMessageLabel.setText("Invalid Email/Password");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void registerButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Stage window = (Stage) register.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}

