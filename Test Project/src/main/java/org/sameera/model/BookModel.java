package org.sameera.model;

import javafx.scene.control.Alert;
import org.sameera.dto.BookDto;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class BookModel {
    public static void saveBook(BookDto bookDto) {

        if (bookDto.getTitle().isEmpty() || bookDto.getAuthor().isEmpty() || bookDto.getIsbn().isEmpty() ||) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setContentText("Please fill out all fields.");
            alert.show();
            return;
        }



        try {
            price = Double.parseDouble(priceText);
            if (price <= 0) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Input Error");
                alert.setContentText("Price must be a positive number.");
                alert.show();
                return;
//            }
        }catch(NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setContentText("Invalid price. Please enter a numeric value.");
            alert.show();
            return;
        }


        if (false) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setContentText("Invalid ISBN. It must be 10 or 13 digits.");
            alert.show();
            return;
        }


        try {
            forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "acpt");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book (title, author, isbn, price) values (?, ?, ?, ?)");
            preparedStatement.setObject(1, bookDto.getTitle());
            preparedStatement.setObject(2, bookDto.getAuthor());
            preparedStatement.setObject(3, bookDto.getIsbn());
            preparedStatement.setObject(4, bookDto.getPrice());

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setContentText("Book saved successfully.");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Failure");
                alert.setContentText("Failed to save the book.");
                alert.show();
            }




        } catch (ClassNotFoundException | SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setContentText("An error occurred while saving the book: " + e.getMessage());
            alert.show();
        }
    }
}
