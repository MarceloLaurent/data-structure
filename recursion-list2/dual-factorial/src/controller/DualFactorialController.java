//Exercise 4
package controller;

public class DualFactorialController {

    public DualFactorialController() {
        super();
    }

    public int dualFactorial(int number){
        if(number == 1){
            return 1;
        } else {
            return number * dualFactorial(number - 2);
        }
    }
}