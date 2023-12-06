package controller;

public class DigitQuantityController {

    public DigitQuantityController() {
        super();
    }

    public int digitQuantity(int firstNumber, int secondNumber){
        if (firstNumber % 10 == secondNumber && firstNumber < 10){
            return 1;
        } else if (firstNumber % 10 != secondNumber && firstNumber < 10){
            return 0;
        } else {
            return firstNumber % 10 == secondNumber ?
                    1 + digitQuantity((firstNumber / 10), secondNumber) :
                    digitQuantity((firstNumber / 10), secondNumber);
        }
    }
}
