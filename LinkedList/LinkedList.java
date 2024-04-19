package LinkedList;

public class LinkedList<T> {
    Node head;

    LinkedList(){
        head = null;
    }

    public class Node {
        T data;
        Node next;

        Node(T val){
            data = val;
            next = null;
        }
    }


    public void insertAtBeginning(T val){
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

    }

    public void insertAtEnd(T val){
        Node newNode = new Node(val);

        if(head==null){
            insertAtBeginning(val);
        } else {
            Node temp = head;
            Node prev = null;

            while(temp != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = newNode;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos, T val){
        if(head==null){
            insertAtBeginning(val);
        } else{
            
        }
    }
}
