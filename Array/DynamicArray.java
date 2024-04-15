public class DynamicArray {
    int arr[];
    int size;
    static final int initialCapacity = 5;
    int capacity;

    DynamicArray(){
        arr = new int[initialCapacity];
        size = 0;
        capacity = initialCapacity;
    }

    public void insertAtEnd(int val){
        if (size == capacity) {
            expandArray();
        }

        arr[size] = val;
        size++;
    }

    private void expandArray(){
        capacity = capacity * 2;

        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void display(){
        System.out.print("The List is : ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public void insertAtPos(int pos, int val){
        if (size == capacity) {
            expandArray();
        }

        for(int i=size-1; i>=pos;i--){
            arr[i+1] = arr[i];
        }
        
        
        arr[pos] = val;
        size++;
    }

    public void deleteFromPos(int pos){
        
        for(int i = pos; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        
        
    }
}
