//Exercise 2
package controller;

public class LowestValueController {

    public LowestValueController() {
        super();
    }

    public int findLowesValue(int []vector, int vectorSize, int lastPosition){
        if(vectorSize == 1){
            return lastPosition;
        }else {
            int lowestValue = Math.min(lastPosition, vector[vectorSize-2]);
            vectorSize--;
            lastPosition = lowestValue;
            return Math.min(lowestValue, findLowesValue(vector, vectorSize, lastPosition));
        }
    }
}