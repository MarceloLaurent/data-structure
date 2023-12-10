package view;

import controller.HistoricController;
import model.StackString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackString stack = new StackString();
        HistoricController c = new HistoricController();

        int op;

        do {
            System.out.println("Choose an option");
            System.out.println("1 - Insert new address");
            System.out.println("2 - Remove last address");
            System.out.println("3 - Display last address ");
            System.out.println("9 - Exit\n");

            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Input an Address: ");
                    Scanner str = new Scanner(System.in);
                    String address = str.nextLine();
                    try {
                        c.insertAddress(stack, address);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        c.removeAddress(stack);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        String top = c.consultAddress(stack);
                        System.out.println("Last Address: " + top);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(op != 9);
    }
}