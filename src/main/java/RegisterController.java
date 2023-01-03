import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class RegisterController {

        @FXML
        private TextField addressTextField;

        @FXML
        private Button closeButton;

        @FXML
        private TextField contactTextField;

        @FXML
        private TextField emailTextField;

        @FXML
        private TextField firstName;

        @FXML
        private TextField lastName;

        @FXML
        private Hyperlink loginLink;

        @FXML
        private TextField passwordTextField;

        @FXML
        private Button register;

        Register reg = new Register();

        @FXML
        void closeButtonAction(ActionEvent event) {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        }

        @FXML
        void loginlink(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage window = (Stage) loginLink.getScene().getWindow();
            window.setScene(new Scene(root));
        }

        @FXML
        void registerButton(ActionEvent event) {
            String email = emailTextField.getText();
            String password = passwordTextField.getText();
            String address = addressTextField.getText();
            String firstname = firstName.getText();
            String lastname = lastName.getText();
            String contact = contactTextField.getText();
            reg.customerRegistration(email,password,firstname,lastname,address, contact);
        }

    }