package com.example.employeeapplication;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.lang.Double;
import java.lang.NumberFormatException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private TextField empId;

    @FXML
    private TextField increment;

    @FXML
    private Text msgDenied;

    @FXML
    void setMsg() {
        try {
            int iEmpId = Integer.parseInt(empId.getText());
            double iIncrement = Double.parseDouble(increment.getText());

            String SQL_SELECT = "UPDATE employee SET salary = salary * ? WHERE Emp_NO = ?;"; // ? is basically a placeholder
            // that will be replaced by user input
            String salary = "SELECT salary FROM employee WHERE Emp_NO = ?";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/employees", "root", null);
                 PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
                preparedStatement.setDouble(1, (1 + iIncrement / 100));
                preparedStatement.setInt(2, iEmpId);

                int status = preparedStatement.executeUpdate(); // executeUpdate stores the rows that are updates

                if (status > 0) {
                    msgDenied.setText("Employee salary updated successfully");
                } else {
                    msgDenied.setText("No such name or ID found");
                }
                msgDenied.setVisible(true);
                clearFields();

            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (NumberFormatException e) {
            msgDenied.setText("Invalid input format! Please enter valid values.");
            msgDenied.setVisible(true);
            clearFields();
        }
    }

    private void clearFields() {
        empId.clear();
        increment.clear();
    }

}