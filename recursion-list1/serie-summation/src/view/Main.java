package view;

import controller.SummationController;

public class Main {
    public static void main(String[] args) {

        SummationController sc = new SummationController();

        double result = sc.summation(5);

        System.out.printf("The sum of serie is: %.2f", result);
    }
}