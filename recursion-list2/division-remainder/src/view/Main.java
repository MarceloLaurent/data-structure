package view;


import controller.DivisionRemainderController;

public class Main {
    public static void main(String[] args) {

        int dividend = 53;
        int divisor = 3;

        DivisionRemainderController dc = new DivisionRemainderController();

        int remainder = dc.remainder(53, 3);

        System.out.println("The remainder of the division of " + dividend +
                            " by " + divisor + " is: " + remainder);

    }
}