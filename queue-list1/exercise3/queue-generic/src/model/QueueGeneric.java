package model;

public class QueueGeneric<Type> {

    Node<Type> start;
    Node<Type> end;

    public QueueGeneric() {
        start = null;
        end = null;
    }

    public boolean isEmpty() {
        return start == null && end == null;
    }

    public void insert(Type valor) {
        Node<Type> element = new Node<>();
        element.data = valor;
        element.next = null;

        if(isEmpty()) {
            start = element;
            end = start;

        }else {
            end.next = element;
            end = element;
        }
    }

    public Type remove() throws Exception{
        if(isEmpty()) {
            throw new Exception("There are no elements in the queue");
        }

        Type value = start.data;

        if(start == end) {
            start = null;
            end = null;
        }else {
            start = start.next;
        }

        return value;
    }

    public void list() throws Exception{
        if(isEmpty()) {
            throw new Exception("There are no elements in the queue");
        }

        Node<Type> aux = start;

        while(aux != null) {
            System.out.println(aux.data);
            aux = aux.next;
        }
    }

    public int size() {
        int count = 0;

        if(!isEmpty()) {
            Node<Type> aux = start;

            while(aux != null) {
                count++;
                aux = aux.next;
            }
        }

        return count;
    }
}