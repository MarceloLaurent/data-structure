package controller;

public class QuantityDigitsController {

    public QuantityDigitsController() {
        super();
    }

    public int displayQuantityDigits(int number){
        if(number - (number % 10) == 0){
            return 1;
        } else {
            return displayQuantityDigits(number / 10) + 1;
        }
    }
}
