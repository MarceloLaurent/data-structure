public class StackString {

    Node top;

    public StackString() {
        top = null;
    }

    public void push(String value){
        Node element = new Node();
        element.data = value;
        element.next = top;
        top = element;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public String pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Empty stack");
        }

        String value = top.data;
        top = top.next;
        return value;
    }

    public String top() throws Exception{
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
