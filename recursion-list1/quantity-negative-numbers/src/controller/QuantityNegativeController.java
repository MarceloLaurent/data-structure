//Exercise 4
package controller;

public class QuantityNegativeController {

    public QuantityNegativeController() {
        super();
    }

    public int quantityNegative(int[] vector, int vectorSize) {
        if (vectorSize == 1) {
            return vector[0] < 0 ? 1 : 0;
        } else {
            return vector[vectorSize - 1] < 0 ? 1 + quantityNegative(vector, vectorSize - 1)
                    : quantityNegative(vector, vectorSize - 1);
        }
    }
}

