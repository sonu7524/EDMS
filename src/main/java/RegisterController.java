import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    AccountdataHashMap account = new AccountdataHashMap();
    @FXML
    public TextField contactTextField;

    @FXML
    public TextField emailTextField;

    @FXML
    public Hyperlink loginLink;
    @FXML
    private Button closeButton;

    @FXML
    public TextField passwordTextField;

    @FXML
    public Button register;

    @FXML
    public TextField userTextField;

    @FXML
    void loginlink(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage window = (Stage) loginLink.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void registerButton(ActionEvent event) {
        String username = userTextField.getText();
        String password = passwordTextField.getText();
        String email = emailTextField.getText();
        int contactno = Integer.parseInt(contactTextField.getText());
        account.createAccount(email,password,username,contactno);
    }
}