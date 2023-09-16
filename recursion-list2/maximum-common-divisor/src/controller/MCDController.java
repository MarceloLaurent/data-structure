//Exercise 5
package controller;

public class MCDController {

    public MCDController() {
        super();
    }

    public int maximumCommonDivisor(int x, int y){
        if(x == y){
            return x;
        } else if (x < y) {
            return maximumCommonDivisor(y, x);
        } else{
            return maximumCommonDivisor(x - y, y);
        }
    }
}
