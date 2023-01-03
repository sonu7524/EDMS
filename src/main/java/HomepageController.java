import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageController {

    @FXML
    private Label addressLabel;

    @FXML
    private Button closeButton;

    @FXML
    private AnchorPane contactLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label invalid;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private Button logoutButton;

    @FXML
    private Label nameLabel;

    @FXML
    private Button updateInfo;

    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void logouButtonFxn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage window = (Stage) logoutButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void updateInfoButton(ActionEvent event) {

    }

}