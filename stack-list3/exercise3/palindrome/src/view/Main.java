package view;

import controller.PalindromeController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Input the string: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        PalindromeController pc = new PalindromeController();

        if(pc.compareWord(input, pc.reverseWord(input))){
            System.out.println("Is a Palindrome");
        } else {
            System.out.println("Isn't a Palindrome");
        }

    }
}