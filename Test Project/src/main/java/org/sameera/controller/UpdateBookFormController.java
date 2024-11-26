package org.sameera.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.*;

import static java.lang.Class.forName;

public class UpdateBookFormController {

    public TextField txtTitle;
    public TextField txtAuthor;
    public TextField txtISBN;
    public TextField txtPrice;
    public Button updateBookButton;
    public Button backButton;
    public TextField txtId;
    public Button cancelButton;
    public Button updateButton;
    public Button searchBookButton;

    public void updateDetails(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        String title = txtTitle.getText();
        String author = txtAuthor.getText();
        String isbn = txtISBN.getText();
        double price = Double.parseDouble(txtPrice.getText());

        try {
            forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "acpt");
            PreparedStatement preparedStatement = connection.prepareStatement("update book set title = ?, author = ?, isbn = ?, price = ? where id = ?");
            preparedStatement.setObject(1, title);
            preparedStatement.setObject(2, author);
            preparedStatement.setObject(3, isbn);
            preparedStatement.setObject(4, price);
            preparedStatement.setObject(5, id);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Updated");
                alert.setContentText("Book Update successfully.");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Failure");
                alert.setContentText("Failed to update the book.");
                alert.show();
            }


            txtTitle.clear();
            txtAuthor.clear();
            txtISBN.clear();
            txtPrice.clear();

        } catch (ClassNotFoundException | SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setContentText("An error occurred while saving the book: " + e.getMessage());
            alert.show();
        }


        System.out.println("update button pressed");

    }

    public void cancel(ActionEvent actionEvent) {
        txtId.clear();
        txtTitle.clear();
        txtAuthor.clear();
        txtISBN.clear();
        txtPrice.clear();
    }

    public void SearchBook(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        try {
            forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "acpt");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from book where id = ?");
            preparedStatement.setObject(1, id);


            ResultSet resultSet =  preparedStatement.executeQuery();
            if(resultSet.next()) {
                txtTitle.setText(resultSet.getString(2));
                txtAuthor.setText(resultSet.getString(3));
                txtISBN.setText(resultSet.getString(4));
                txtPrice.setText(resultSet.getString(5));
            }





        } catch (ClassNotFoundException | SQLException e) {

        }


    }
}
