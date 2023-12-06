package controller;

public class BinaryConversionController {

    public BinaryConversionController() {
        super();
    }

    public String binaryConversion(int number){
        if(number == 0 || number == 1){
            return String.valueOf(number);
        } else {
            return binaryConversion(number / 2) + number % 2;
        }
    }
}
