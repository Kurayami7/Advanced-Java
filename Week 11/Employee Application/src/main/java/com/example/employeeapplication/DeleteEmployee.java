package com.example.employeeapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {
    @FXML
    private TextField empId;

    @FXML
    private TextField name;

    @FXML
    private Text successMsg;

    @FXML
    void onSubmit() {
        int iEmpId = Integer.parseInt(empId.getText());
        String iName = name.getText();

        String SQL_SELECT = "DELETE FROM employee WHERE Emp_NO = ? AND Emp_Name = ?;"; // ? is basically a placeholder
        // that will be replaced by user input
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3307/employees", "root", null);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, iEmpId);
            preparedStatement.setString(2, iName);

            int status = preparedStatement.executeUpdate(); // executeUpdate stores the rows that are updates

            if (status > 0) {
                successMsg.setText("Employee field deleted successfully");
            }
            else {
                successMsg.setText("No such name or ID found");
            }
            successMsg.setVisible(true);
            clearFields();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            successMsg.setText("Invalid ID or name entered. Please try again!");
            successMsg.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        empId.clear();
        name.clear();
    }
}