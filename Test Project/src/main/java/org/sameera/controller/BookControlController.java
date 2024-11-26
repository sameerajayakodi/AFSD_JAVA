package org.sameera.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BookControlController {

    public Button showAllBooks;
    public Button addBook;
    public Button updateBook;
    public Button deleteBook;

    public void showAllBooks(ActionEvent actionEvent) throws IOException {
        Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/LoadBookForm.fxml"));
        Stage stage = (Stage) showAllBooks.getScene().getWindow();
        stage.setScene(new Scene(mainPageRoot));
        stage.show();
    }

    public void addBook(ActionEvent actionEvent) throws IOException {
        Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/SaveBookForm.fxml"));
        Stage stage = (Stage) addBook.getScene().getWindow();
        stage.setScene(new Scene(mainPageRoot));
        stage.show();
    }

    public void updateBook(ActionEvent actionEvent) throws IOException {
        Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/UpdateBookForm.fxml"));
        Stage stage = (Stage) updateBook.getScene().getWindow();
        stage.setScene(new Scene(mainPageRoot));
        stage.show();
    }

    public void deleteBook(ActionEvent actionEvent) throws IOException {
        Parent mainPageRoot = FXMLLoader.load(getClass().getResource("/view/DeleteBookForm.fxml"));
        Stage stage = (Stage) deleteBook.getScene().getWindow();
        stage.setScene(new Scene(mainPageRoot));
        stage.show();
    }
}
