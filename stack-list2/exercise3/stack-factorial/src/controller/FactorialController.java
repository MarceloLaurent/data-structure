package controller;

import model.StackInteger;

public class FactorialController {

    StackInteger f = new StackInteger();

    public Long factorial(int value) throws Exception {
        if(value < 0 || value > 10){
            throw new Exception("Invalid Number");
        }

        if(value <= 1){
            return 1L;
        } else {
            f.push(1);
            int count = 1;
            while (f.size() <= value){
                f.push(f.top() * count);
                count++;
            }
            return (long) f.top();
        }
    }
}
