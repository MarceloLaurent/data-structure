//Exercise 3
package controller;

public class FactorialController {

    public FactorialController() {
    }

    public int factorial(int number){

        if(number > 12){
            throw new IllegalArgumentException("Enter a number less than 12");
        }else if(number == 1){
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
