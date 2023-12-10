package controller;

import model.StackString;

import java.util.Objects;

public class PalindromeController {

    public PalindromeController() {
        super();
    }

    public String reverseWord(String string) throws Exception {
        StackString s = new StackString();

        for (int i = 0; i < string.length(); i++){
            s.push(String.valueOf(string.charAt(i)));
        }

        String reverse = "";
        while (!s.isEmpty()){
            reverse += s.pop();
        }

        return reverse;
    }

    public boolean compareWord(String string, String reverse){
        return Objects.equals(string, reverse);
    }
}
