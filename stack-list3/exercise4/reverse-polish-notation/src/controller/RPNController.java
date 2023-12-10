package controller;

import model.StackInteger;

public class RPNController {

    public RPNController() {
        super();
    }

    public void insertValue(StackInteger s, int value){
        s.push(value);
    }

    public int rpn(StackInteger s, String op) throws Exception {
        if(s.size() >= 2){
            int number2 = s.pop();
            int result;

            switch (op){
                case "+":
                    result = s.pop() + number2;
                    s.push(result);
                    return result;

                case "-":
                    result = s.pop() - number2;
                    s.push(result);
                    return result;

                case "*":
                    result = s.pop() * number2;
                    s.push(result);
                    return result;

                case "/":
                    result = s.pop() / number2;
                    s.push(result);
                    return result;

                default:
                    throw new Exception("Invalid Operation");
            }
        } else {
            throw new Exception("Insufficient values");
        }
    }
}
