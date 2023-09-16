//Exercise 2
package controller;

public class DivisionRemainderController {

    public DivisionRemainderController() {
        super();
    }

    public int remainder(int dividend, int divisor){
        if(dividend < divisor){
            return dividend;
        } else {
            return remainder(dividend - divisor, divisor);
        }
    }
}
