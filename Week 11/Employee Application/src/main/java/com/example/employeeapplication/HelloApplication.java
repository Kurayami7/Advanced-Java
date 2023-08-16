package com.example.employeeapplication;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

/*    In the three functions below, we basically linked them to the hello-view.fxml main screen.
*     It basically has three different buttons with onAction methods, and therefore it's controller,
*     which is HelloApplication.java, must have those 3 exact methods. Since the requirement is to
*     have 3 different controllers for each button, I simply
* */
    @FXML
    protected void updateSalary() throws IOException {
        openNewScene("update-salary.fxml", "Update Salary!");
    }

    @FXML
    protected void createEmployee() throws IOException {
        openNewScene("new-employee.fxml", "Create Employee!");
    }

    @FXML
    protected void deleteEmployee() throws IOException {
        openNewScene("delete-employee.fxml", "Delete Employee!");
    }

// Custom function that handles opening new scenes based on fxml file inputted
    private void openNewScene(String fxmlFile, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 650, 450));
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}