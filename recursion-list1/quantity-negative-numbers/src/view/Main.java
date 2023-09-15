package view;

import controller.QuantityNegativeController;

public class Main {
    public static void main(String[] args) {

        int []vector = {-2, 3, 0, 7, -5, 13, -7};
        int vectorSize = vector.length;

        QuantityNegativeController qn = new QuantityNegativeController();

        int result = qn.quantityNegative(vector, vectorSize);

        System.out.println("The quantity of negative numbers in the vector is: "+ result);
    }
}