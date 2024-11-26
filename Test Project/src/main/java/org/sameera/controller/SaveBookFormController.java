package org.sameera.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class SaveBookFormController {

    public TextField txtTitle;
    public TextField txtAuthor;
    public TextField txtISBN;
    public TextField txtPrice;
    public Button loginButton;
    public Button updateButton;

    public void saveDetails(ActionEvent actionEvent) {
        String title = txtTitle.getText().trim();
        String author = txtAuthor.getText().trim();
        String isbn = txtISBN.getText().trim();
        String priceText = txtPrice.getText().trim();



        }


    public void updateDetails(ActionEvent actionEvent) throws IOException {
        Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/SaveBookForm.fxml"));
        Stage stage = (Stage) updateButton.getScene().getWindow();
        stage.setScene(new Scene(mainPageRoot));
        stage.show();

        System.out.println("update button clicked");
    }
}

