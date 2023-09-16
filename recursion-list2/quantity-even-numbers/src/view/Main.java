package view;

import controller.QuantityEvenNumberController;

public class Main {
    public static void main(String[] args) {

        int []vector = {0, 3, 7, 8, 14, 15, 30};
        int vectorSize = vector.length;

        QuantityEvenNumberController qc = new QuantityEvenNumberController();

        int result = qc.evenNumbersVector(vector, vectorSize);

        System.out.println("There is " + result + " even numbers in the vector.");
    }
}