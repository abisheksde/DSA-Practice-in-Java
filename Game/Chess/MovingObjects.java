package Game.Chess;

public class MovingObjects {
    public static boolean elephantMoving(){
        // Implement the Moving Logic for Elephant

        return true;
    }

    public static boolean isAnyObject(int[] from, int[] to){
        int fromI = from[0];
        int fromJ = from[1];

        int toK = to[0];
        int toL = to[1];

        //If object Moves Above in Straight Line 
        if(fromI>toK && fromJ==toL){
            for(int i=fromI;i>toK; i--){
                if(Board.board[i][1] == 0){
                    return true; // Object found
                }
 
            }
            return false; // No object found
        } else{
            return false; // If not moving above, return true
        } 

        //If object Moves Above in Straight Line 
        if()
   }
}
