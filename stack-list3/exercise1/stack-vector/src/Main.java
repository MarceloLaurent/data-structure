import model.StackInteger;

public class Main {
    public static void main(String[] args) throws Exception {

        int []vector = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
        StackInteger stack = new StackInteger();
        int soma = 0;

        for (int item: vector) {
            if(item >= 0){
                stack.push(item);
            } else{
                soma = stack.pop();
                soma+= stack.pop();
                stack.push(item);
                stack.push(soma);
            }
        }
        System.out.println(stack.size());
    }
}