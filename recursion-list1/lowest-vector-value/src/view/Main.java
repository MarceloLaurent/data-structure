package view;

import controller.LowestValueController;

public class Main {
    public static void main(String[] args) {

        int[] vector = {3, -7, 2, 5, -8, 0, 4};
        int vectorSize = vector.length;
        int lastPosition = vector[vector.length-1];

        LowestValueController lv = new LowestValueController();

        int result = lv.findLowesValue(vector, vectorSize, lastPosition);

        System.out.println("The lowest value in the vector is: "+result);
    }
}