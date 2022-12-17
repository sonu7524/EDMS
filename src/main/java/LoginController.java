import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    private Label invalid;

    @FXML
    private Button login;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button register;

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
    void loginButton(ActionEvent event) {

    }

    @FXML
    void registerButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Stage window = (Stage) register.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}

