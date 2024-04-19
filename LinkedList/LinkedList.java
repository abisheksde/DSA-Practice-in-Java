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

    public int sizeOfList(){ 
        Node temp = head;
        int size = 0; 
        // If you give this size variable as Global variable - When you call this sizeOfList() method for First Time, it will count the size of the Total elements in the List (For Example, 5)
        // But, This is a Global variable, So after Completion of running of this sizeOfList() method. Memory of size variable will not deallocate. (If Local variable means, It will be deallocate)
        // So, value of the size variable will be remain count of total element  (For Example, 5)
        // But, When you call this sizeOfList() method for Second Time, once again It will count the size of the Total elements in the List & It will Add this value to Old value, which is counted by first Time
        // So, your result will be double (for Example, 10)
        
        while(temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }

    public void deleteFromPos(int position){

        Node temp = head;
        Node prev = null;

        if (position==0) {
            head = temp.next;
            return;
        } else{
            for(int i=0; i<position; i++){
                prev = temp;
                temp = temp.next;
            }

            prev.next = temp.next;

        }
        

    }
}
