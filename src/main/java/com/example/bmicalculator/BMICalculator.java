package com.example.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class BMICalculator {

    @FXML
    private Text BMI;

    @FXML
    private TextField height;

    @FXML
    private TextField weight;

    @FXML
    void calculateBmi() {
        Double inputWeight = Double.parseDouble(weight.getText());
        inputWeight *= 2.20462;

        Double inputHeight = Double.parseDouble(height.getText());
        inputHeight *= 0.393701;

        double bmi = (703 * inputWeight)/(inputHeight * inputHeight);

        String bmiStatus;

        if (bmi < 18.5) {
            bmiStatus = "underweight";
        }
        else if (bmi > 18.5 && bmi < 24.9) {
            bmiStatus = "normal";
        }
        else if (bmi > 25.0 && bmi < 29.9) {
            bmiStatus = "overweight";
        }
        else {
            bmiStatus = "Obese";
        }

        BMI.setVisible(true);
        BMI.setText("You are " + bmiStatus);
    }

}



