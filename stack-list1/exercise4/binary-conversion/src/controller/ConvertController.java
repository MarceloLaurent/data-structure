package controller;

import model.StackInteger;
public class ConvertController {

    public String decToBin(int decimal) throws Exception {

        if(decimal < 0 || decimal > 1000) throw new Exception("Invalid Number");

        StackInteger s = new StackInteger();
        String result = "";

        do{
            int r = decimal % 2;
            decimal = decimal /2;
            s.push(r);
        } while (decimal > 0);

        try {
            while(!s.isEmpty()) {
                result += s.pop();
            }
        } catch (Exception ignored) {

        }
        return result;
    }
}
