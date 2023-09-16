//Exercise 3
package controller;

public class QuantityEvenNumberController {

    public QuantityEvenNumberController() {
        super();
    }

    public int evenNumbersVector(int []vector, int vectorSize){
        if(vectorSize == 1){
            return vector[0] % 2 == 0 ? 1 : 0;
        } else {
            return vector[vectorSize - 1] % 2 == 0 ? 1 + evenNumbersVector(vector, vectorSize - 1)
                    : evenNumbersVector(vector, vectorSize - 1);
        }
    }
}