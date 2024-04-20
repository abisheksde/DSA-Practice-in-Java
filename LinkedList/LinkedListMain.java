package LinkedList;
import java.util.Scanner;


public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val;
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        while (true) {
            
            System.out.println("\n-----------------------");
            System.out.println("1. Insert at Beginning \n");
            System.out.println("2. Insert at End \n");
            System.out.println("3. Display the List \n");
            System.out.println("4. Insert at Position \n");
            System.out.println("5. Delete from Position \n");
            System.out.println("6. Size of the List \n");
            System.out.println("7. Exit \n");
            System.out.println("-----------------------");

            System.out.print("Please Enter a Choice : ");
            int choice = scanner.nextInt();
            

            switch (choice) {
                case 1: System.out.println("Enter a Data : ");
                    val = scanner.nextInt();
                    list.insertAtBeginning(val);
                    break;
                case 2: System.out.println("Enter a Data : ");
                    val = scanner.nextInt();
                    list.insertAtEnd(val);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    list.reverseTheList();
                    break;
                case 5: System.out.println("Enter a Position : ");
                    int pos = scanner.nextInt();
                    if (list.sizeOfList()<pos) {
                        System.out.println("Please Enter Correct Position between 0 to " + list.sizeOfList() + ":");
                        pos = scanner.nextInt();
                        System.out.println("Enter a Value : ");
                        val = scanner.nextInt();
                        list.insertAtPos(pos, val);
                    } else{
                        System.out.println("Enter a Value : ");
                        val = scanner.nextInt();
                        list.insertAtPos(pos, val);
                    }
                    break;

                case 6: if(list.sizeOfList()!=0){
                    System.out.println("Enter a Position : ");
                    int position = scanner.nextInt();
                    if(list.sizeOfList()<position){
                        System.out.println("Please Enter Correct Position between 0 to " + (list.sizeOfList()-1) + ":");
                        position = scanner.nextInt();
                        list.deleteFromPos(position);
                    } else{
                        list.deleteFromPos(position);
                    }                 
                    
                } else {
                    System.out.println("Sorry List is Empty :(");
                }
                    
                    break;
                case 7:
                    System.out.println(list.sizeOfList());
                    break;
                case 8:
                    System.exit(0);
                    break;
            
                default: System.out.println("Please Enter a valid Choice...!!!");
                    break;
            }
        }
    }
}
