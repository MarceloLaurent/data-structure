package view;

import controller.MCDController;

public class Main {
    public static void main(String[] args) {

        int x = 24;
        int y = 18;

        MCDController mcd = new MCDController();

        int result = mcd.maximumCommonDivisor(x,y);

        System.out.println("The MCD of " + x + " and " + y + " is: " + result);
    }
}