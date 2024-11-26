package org.sameera.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;

public class MainFormController {


    public TextField txtPassword;
    public TextField txtUsername;
    public Button loginButton;

    public MainFormController() {
        System.out.println("Main Form Controller");
    }

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.isEmpty() || password.isEmpty()) {

            Alert a = new Alert(Alert.AlertType.NONE);
            a.setTitle("Invalid Username or Password");
            a.setAlertType(Alert.AlertType.WARNING);
            a.setContentText("Enter a valid username/password");
            a.show();
        } else if (username.equals("admin") && password.equals("admin")) {

            txtUsername.clear();
            txtPassword.clear();


            try {
                Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/MainPage.fxml"));
                Stage stage = (Stage) loginButton.getScene().getWindow();
                stage.setScene(new Scene(mainPageRoot));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();

            }

        } else {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setTitle("Invalid Username or Password");
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Please Enter Valid Username and Password");
            a.show();
            txtUsername.clear();
            txtPassword.clear();
//            lblData.setText("Login Failed!");
//            lblData.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        }
    }
}
