package view;

import controller.ReverseStringController;

public class Main {
    public static void main(String[] args) {

        String str = "Marcelo Laurentino";

        ReverseStringController rc = new ReverseStringController();

        System.out.println(rc.reverseString(str));
    }
}