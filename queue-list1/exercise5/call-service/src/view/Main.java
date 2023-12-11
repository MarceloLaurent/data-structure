package view;

import controller.ServiceController;
import model.QueueGeneric;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        QueueGeneric<String> commonQueue = new QueueGeneric<>();
        QueueGeneric<String> priorityQueue = new QueueGeneric<>();
        ServiceController sc = new ServiceController();

        int op;

        do {
            System.out.println("-----Menu-----");
            System.out.println("1 - Input the name of a new customer: ");
            System.out.println("2 - Input the name of a new priority customer: ");
            System.out.println("3 - Call next");
            System.out.println("9 - Exit");

            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();

            switch(op) {
                case 1:
                    sc.newElement(commonQueue);
                    break;

                case 2:
                    sc.newElement(priorityQueue);
                    break;

                case 3:
                    sc.callNext(commonQueue, priorityQueue);
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Invalid option, please try again...");

            }

        }while(op != 9);
    }

}