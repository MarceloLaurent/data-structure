package view;

import controller.SummationController;

public class Main {
    public static void main(String[] args) {

        int number = 5;

        SummationController sc = new SummationController();

        System.out.printf("%.2f", sc.summation(number));
    }
}


