package view;

import controller.SumController;

public class Main {
    public static void main(String[] args) {

        int number = 10;

        SumController sc = new SumController();

        int result = sc.sum(number);

        System.out.println("The sum from 1 to " + number + " is: "+ result);
    }
}