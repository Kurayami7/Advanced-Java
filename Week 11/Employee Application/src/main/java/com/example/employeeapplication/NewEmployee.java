package com.example.employeeapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.io.IOException;
import java.sql.*;

public class NewEmployee {

    @FXML
    private TextField dept;

    @FXML
    private TextField deptNo;

    @FXML
    private TextField empAdd;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private TextField salary;

    @FXML
    private Text successMessage;

    @FXML
    private TextField empId;

    @FXML
    void generateEmployee() {
        String iName = name.getText();
        String iPhone = phone.getText();
        String iSalary = salary.getText();
        String iEmpAdd = empAdd.getText();
        String iDeptNo = deptNo.getText();
        String iDept = dept.getText();
        int iEmpId = Integer.parseInt(empId.getText());

        String SQL_SELECT = "INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?, ?)"; // ? is basically a placeholder
        // that will be replaced by user input
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3307/employees", "root", null);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
                preparedStatement.setInt(1, iEmpId);
                preparedStatement.setString(2, iName);
                preparedStatement.setString(3, iEmpAdd);
                preparedStatement.setString(4, iPhone);
                preparedStatement.setString(5, iDeptNo);
                preparedStatement.setString(6, iDept);
                preparedStatement.setString(7, iSalary);

            preparedStatement.executeUpdate();
            successMessage.setText("Employee field created successfully");
            successMessage.setVisible(true);
            clearFields();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            successMessage.setText("Invalid ID entered. Please try again!");
            successMessage.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clearFields() {
        empId.clear();
        name.clear();
        empAdd.clear();
        phone.clear();
        deptNo.clear();
        dept.clear();
        salary.clear();
    }
}
