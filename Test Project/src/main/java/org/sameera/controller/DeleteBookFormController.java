package org.sameera.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class DeleteBookFormController {
    public TextField txtId;
    public Button deleteBookButton;



    public void deleteBook(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        try {
            forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "acpt");
            PreparedStatement preparedStatement = connection.prepareStatement("delete from book where id = ?");
            preparedStatement.setObject(1, id);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setContentText("Book delete successfully.");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Failure");
                alert.setContentText("Failed to delete the book.");
                alert.show();
            }


            txtId.clear();

        } catch (ClassNotFoundException | SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setContentText("An error occurred while delete the book: " + e.getMessage());
            alert.show();
        }
    }
}
