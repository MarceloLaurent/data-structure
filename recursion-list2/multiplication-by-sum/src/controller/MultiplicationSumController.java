//Exercise 1
package controller;

public class MultiplicationSumController {

    public MultiplicationSumController() {
        super();
    }

    public int multiplication(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        } else if (a == 1) {
            return b;
        } else{
            return b + multiplication(a -1, b);
        }
    }
}
