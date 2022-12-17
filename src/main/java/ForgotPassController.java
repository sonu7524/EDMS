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

public class ForgotPassController {
    @FXML
    private Button closeButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private Label invalid;

    @FXML
    private Button login;

    @FXML
    private Hyperlink loginlink;

    @FXML
    void loginButton(ActionEvent event) {

    }

    @FXML
    void loginlinkaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage window = (Stage) loginlink.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

}

