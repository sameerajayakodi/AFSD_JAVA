package org.sameera.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static java.lang.Class.forName;

public class LoadBookFormController implements Initializable {
    public Button loadBookButton;
    @FXML
    private TableView<BookTM> tdlBook;

    public void loadBook(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "acpt");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from book");



            ResultSet resultSet =  preparedStatement.executeQuery();
            ArrayList<BookTM> tms = new ArrayList<>();
            while(resultSet.next()) {
                tms.add(new BookTM(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getDouble(5)));

            }

            tdlBook.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
            tdlBook.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("title"));
            tdlBook.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("author"));
            tdlBook.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("isbn"));
            tdlBook.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("price"));

            tdlBook.setItems(FXCollections.observableArrayList(tms));





        } catch (ClassNotFoundException | SQLException e) {
            throw  new RuntimeException(e);
        }
    }
}
