import java.util.Scanner;

/**
 * ArrayDS - Abishek
 */

public class ArrayDS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int val;
        DynamicArray list = new DynamicArray();
        
        while (true) {
            
            System.out.println("\n-----------------------");
            System.out.println("1. Insert at End \n");
            System.out.println("2. Display the List \n");
            System.out.println("3. Insert at Position \n");
            System.out.println("4. Delete from Position \n");
            System.out.println("5. Exit \n");
            System.out.println("-----------------------");

            System.out.print("Please Enter a Choice : ");
            int choice = scanner.nextInt();
            

            switch (choice) {
                case 1: System.out.println("Enter a Data : ");
                    val = scanner.nextInt();
                    list.insertAtEnd(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3: System.out.println("Enter a Position : ");
                    int pos = scanner.nextInt();
                    if (list.size<pos) {
                        System.out.println("Please Enter Correct Position between 0 to " + list.size + ":");
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
                case 4: if(list.size!=0){
                    System.out.println("Enter a Position : ");
                    int position = scanner.nextInt();
                    if(list.size<position){
                        System.out.println("Please Enter Correct Position between 0 to " + (list.size-1) + ":");
                        position = scanner.nextInt();
                        list.deleteFromPos(position);
                    } else{
                        list.deleteFromPos(position);
                    }
                    
                    
                } else {
                    System.out.println("Sorry List is Empty :(");
                }
                    
                    break;
                case 5:
                    System.exit(0);
                    break;
            
                default: System.out.println("Please Enter a valid Choice...!!!");
                    break;
            }
        }

    }
}