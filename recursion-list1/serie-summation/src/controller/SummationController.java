//Exercicio 5
package controller;

public class SummationController {

    public SummationController() {
    }

    public double summation(int number){
        if(number == 1){
            return 1;
        } else {
            return 1.0/number + summation(number -1);
        }
    }
}
