package com.example.lab11_javafx_kalkulator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class KalkulatorController {

    int operation;
    double firstNumber,secondNumber;

    @FXML
    private TextField lcdScreen;


    @FXML
    protected void on1ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "1");
    }
    @FXML
    protected void on2ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "2");
    }
    @FXML
    protected void on3ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "3");
    }
    @FXML
    protected void on4ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "4");
    }
    @FXML
    protected void on5ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "5");
    }
    @FXML
    protected void on6ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "6");
    }
    @FXML
    protected void on7ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "7");
    }
    @FXML
    protected void on8ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "8");
    }
    @FXML
    protected void on9ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "9");
    }
    @FXML
    protected void on0ButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + "0");
    }
    @FXML
    protected void onDotButtonClick() {
        lcdScreen.setText(lcdScreen.getText() + ".");
    }
    @FXML
    protected void onClearButtonClick() {
        lcdScreen.setText("");
    }


    @FXML
    protected void onPlusButtonClick() {
        firstNumber = Double.parseDouble(lcdScreen.getText());
        lcdScreen.setText("");
        operation = 1;
    }
    @FXML
    protected void onMinusButtonClick() {
        firstNumber = Double.parseDouble(lcdScreen.getText());
        lcdScreen.setText("");
        operation = 2;
    }
    @FXML
    protected void onMultiplyButtonClick() {
        firstNumber = Double.parseDouble(lcdScreen.getText());
        lcdScreen.setText("");
        operation = 3;
    }
    @FXML
    protected void onDivideButtonClick() {
        firstNumber = Double.parseDouble(lcdScreen.getText());
        lcdScreen.setText("");
        operation = 4;
    }
    @FXML
    protected void onEqualsButtonClick() {
        secondNumber = Double.parseDouble(lcdScreen.getText());
        double wynik;
        switch (operation){
            case 1:{
                wynik = firstNumber + secondNumber;
                break;
            }
            case 2:{
                wynik = firstNumber - secondNumber;
                break;
            }
            case 3:{
                wynik = firstNumber * secondNumber;
                break;
            }
            case 4:{
                wynik = firstNumber / secondNumber;
                break;
            }
            default:{
                wynik = 0;
            }
        }
        lcdScreen.setText(String.valueOf(wynik));

    }
}