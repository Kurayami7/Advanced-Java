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
        String selectedICurrency = inputCurrencyType.getValue();
        String selectedOCurrency = outputCurrencyType.getValue();

        if (selectedICurrency.equals("CAD") && selectedOCurrency.equals("USD")){
            String outputAmountToDisplay = Double.toString(iAmount * 0.74);
            outputAmount.setText(outputAmountToDisplay);
        }
        else if (selectedICurrency.equals("USD") && selectedOCurrency.equals("CAD")){
            String outputAmountToDisplay = Double.toString(iAmount / 0.74);
            outputAmount.setText(outputAmountToDisplay);
        }

        else {
            outputAmount.setText("Please select distinct currencies");
        }
    }

}
