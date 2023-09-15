//Exercise 1
package controller;

public class SumController {

    public SumController() {
    }

    public int sum(int number){
        if(number <= 0){
            return 0;
        } else {
            return number + sum(number-1);
        }
    }
}
