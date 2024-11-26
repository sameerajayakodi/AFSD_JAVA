package org.sameera.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {
    public Button service;
    public Button vehicle;
    public Button book;

    public void serviceAction(ActionEvent actionEvent) {
    }



    public void bookAction(ActionEvent actionEvent) throws IOException {
        Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/BookControl.fxml"));
        Stage stage = (Stage) book.getScene().getWindow();
        stage.setScene(new Scene(mainPageRoot));
        stage.show();
    }
}
