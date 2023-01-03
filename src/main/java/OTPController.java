import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
public class OTPController {
    private String genOTP;
    OTPController(){
        this.genOTP = GenerateOTP.OTP(6);
        System.out.println(genOTP);
    }

        @FXML
        private Button closeButton;

        @FXML
        private Label invalid;

    @FXML
    private Button otpButton;

        @FXML
        private TextField otpTextField;

        @FXML
        void closeButtonAction(ActionEvent event) {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        }

    @FXML
    void otpButtonfxn(ActionEvent event) throws IOException {
        String otp = otpTextField.getText();
        if(otp.equals(genOTP)){
            Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Stage window = (Stage) otpButton.getScene().getWindow();
            window.setScene(new Scene(root));
        }
    }
}
