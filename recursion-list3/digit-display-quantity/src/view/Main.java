package view;

import controller.DigitQuantityController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException{

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int firstNumber = scan.nextInt();
        if (firstNumber < 10 || firstNumber > 999999){
            throw new IllegalArgumentException("Enter a number between 10 and 999999.");
        }

        System.out.println("Enter a second number: ");
        int secondNumber = scan.nextInt();
        if (secondNumber < 0 || secondNumber > 9){
            throw new IllegalArgumentException("Enter a number between 0 and 9.");
        }

        DigitQuantityController dc = new DigitQuantityController();

        int result = dc.digitQuantity(firstNumber, secondNumber);

        System.out.println("The number " + secondNumber + " show up " + result +
                            " times in the number " + firstNumber);
    }
}