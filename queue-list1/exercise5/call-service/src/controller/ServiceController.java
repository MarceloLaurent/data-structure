package controller;

import model.QueueGeneric;

import java.util.Scanner;

public class ServiceController {

    private static int count = 0;

    public ServiceController() {
        super();
    }

    public void newElement(QueueGeneric<String> queue) {
        System.out.println("Input the customer's name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        queue.insert(name);
    }

    public void callNext(QueueGeneric<String> commonQueue, QueueGeneric<String> priorityQueue){

        String name = "";

        try {
            if(priorityQueue.isEmpty()) {
                name = commonQueue.remove();

            }else if(count < 3){
                name = priorityQueue.remove();
                count++;

            }else {
                name = commonQueue.remove();
                count = 0;
            }

            System.out.println("Next customer: " + name);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
