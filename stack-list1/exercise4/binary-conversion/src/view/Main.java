package view;

import controller.ConvertController;

public class Main {

    public static void main(String[] args) throws Exception {

        int decimal = 987;

        ConvertController c = new ConvertController();

        String result = c.decToBin(decimal);
        System.out.println(result);
    }
}
