package view;

import controller.QuantityDigitsController;

public class Main {
    public static void main(String[] args) {
        int number = 1000;

        QuantityDigitsController qc = new QuantityDigitsController();

        System.out.println(qc.displayQuantityDigits(number));
    }
}