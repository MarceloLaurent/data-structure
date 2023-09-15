package view;

import controller.FactorialController;

public class Main{
    public static void main(String[] args) throws IllegalArgumentException{
        int number = 12;

        FactorialController fc = new FactorialController();

        int result = fc.factorial(number);

        System.out.println("The factorial of " + number + " is: " + result);
    }

}

