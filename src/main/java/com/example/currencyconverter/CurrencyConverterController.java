package com.example.currencyconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class CurrencyConverterController extends HelloApplication {

    @FXML
    private TextField inputAmount;

    @FXML
    private ComboBox<String> inputCurrencyType;

    @FXML
    private Text outputAmount;

    @FXML
    private ComboBox<String> outputCurrencyType;

    @FXML
    void initialize() {
        inputCurrencyType.getItems().addAll("USD", "CAD");
        outputCurrencyType.getItems().addAll("USD", "CAD");
    }
    @FXML
    void convert () {
        double iAmount = Double.parseDouble(inputAmount.getText());
        String inputCurrency = inputCurrencyType.getValue();
        String outputCurrency = outputCurrencyType.getValue();

        if (inputCurrency.equals("CAD") && outputCurrency.equals("USD")){
            String outputAmountToDisplay = Double.toString(iAmount * 0.74);
            outputAmount.setText(outputAmountToDisplay);
        }
        else if (inputCurrency.equals("USD") && outputCurrency.equals("CAD")) {
            String outputAmountToDisplay = Double.toString(iAmount / 0.74);
            outputAmount.setText(outputAmountToDisplay);
        }
    }

}
