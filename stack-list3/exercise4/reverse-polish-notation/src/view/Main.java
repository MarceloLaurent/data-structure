package view;

import controller.RPNController;
import model.StackInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        RPNController c = new RPNController();
        StackInteger s = new StackInteger();

        int op, number;

        do{
            System.out.println("Choose an option:");
            System.out.println("1 - Input a number: ");
            System.out.println("2 - Select a operation (+, -, * or /): ");
            System.out.println("9 - Exit\n");

            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.println("1. Input a number: ");
                    number = scan.nextInt();
                    c.insertValue(s, number);
                    break;

                case 2:
                    System.out.println("2. Select a operation (+, -, * or /): ");
                    try {
                        Scanner str = new Scanner(System.in);
                        String operation = str.nextLine();
                        number = c.rpn(s, operation);
                        System.out.println("Current result: " + number);
                    } catch (Exception e){
                        System.err.println(e.getMessage());
                    }

                    break;

                case 9:
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }

        } while (op != 9);
    }
}