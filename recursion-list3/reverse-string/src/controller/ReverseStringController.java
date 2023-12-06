package controller;

public class ReverseStringController {

    public ReverseStringController() {
        super();
    }

    public String reverseString(String str){
        if (str.length() == 1){
            return str;
        } else {
            return str.substring(str.length() - 1)
                    + reverseString(str.substring(0, str.length() - 1));
        }
    }
}
