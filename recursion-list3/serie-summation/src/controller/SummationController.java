package controller;

public class SummationController {

    public SummationController() {
        super();
    }

    private int factorial(int number){
        if(number == 1){
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    public double summation(int number){
        if (number == 1){
            return 1;
        } else {
            return 1.0 / factorial(number) + summation(number - 1);
        }
    }
}
