package view;

import controller.BinaryConversionController;

public class Main {
    public static void main(String[] args) {

        int number = 25;

        BinaryConversionController bc = new BinaryConversionController();

        System.out.println(bc.binaryConversion(number));

    }
}