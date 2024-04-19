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
        Node newNode = new Node(val);
        //What if, user Enter Far Position? - I mean, List Total Size is 5. But Customer Enter the pos 10.

        if(pos==0){
            insertAtBeginning(val);
        } else{
            Node temp = head;
            Node prev = null;

            for(int i=0; i<pos; i++){
                prev = temp;
                temp = temp.next;
            }
            newNode.next = temp;
            prev.next = newNode;
        }
    }

    public int sizeOfList(){ // Something is Wrong, Bcz When size is Global variable ath that time, If i did any operation (call any method), size will increase - Find the Reason
        Node temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }
}
