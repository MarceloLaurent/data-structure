package view;

import controller.DualFactorialController;

public class Main {
    public static void main(String[] args) {

        int number = 5;

        DualFactorialController dc= new DualFactorialController();

        int result = dc.dualFactorial(number);

        System.out.println(number + "!! = " + result);
    }
}