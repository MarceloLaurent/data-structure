package model;

public class StackInteger {

    Node top;

    public StackInteger() {
        top = null;
    }

    public void push(int value){
        Node element = new Node();
        element.data = value;
        element.next = top;
        top = element;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Empty stack");
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    public int top() throws Exception{
        if (isEmpty()){
            throw new Exception("Empty stack");
        }

        return top.data;
    }

    public int size(){
        int count = 0;

        if(!isEmpty()){
            Node aux = top;
            while (aux != null){
                count++;
                aux = aux.next;
            }
        }

        return count;
    }
}
