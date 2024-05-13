package Game.Chess;

public class ObjectFinding {
    public static boolean isAnyObject(int[] from, int[] to){
        int fromI = from[0];
        int fromJ = from[1];

        int toI = to[0];
        int toJ = to[1];

        //int result;

        //***ERROR : Try to Find the Program Flow Accurately. Because, after 2nd if-condition, it is returning the true, but not go out of the Method */
        //***ERROR :  Above result variable cannot be accessible within the 1st & 2nd If-Condition*/

        //If Black object Moves Above in Straight Line 
        if(fromI>toI && fromJ==toJ){
            for(int i=fromI;i>toI; i--){
                if(Board.board[i][1] == 0){
                    return true; // Object found
                }
 
            }
            return false; // No object found
        } else{
            return false; // If not moving above, return true
        } 

        //If White object moves Below in Straight Line
        //If Black object Moves Right Hand Side in Straight Line 
        //If Black object Moves Left Hand Side in Straight Line 
        //If Black object Moves Cross (Above) in Right Hand Side Line 
        //If Black object Moves Cross (Above)  in Left Hand Side Line 
        //If Black object Moves Cross (Below) in Right Hand Side Line 
        //If Black object Moves Cross (Below)  in Left Hand Side Line 

        
        /////// Consider that - If I rotate the Chess Board ///////
        
        
        //If White object moves Above in Straight Line
        //If White object moves Below in Straight Line
        //If Black object Moves Right Hand Side in Straight Line 
        //If Black object Moves Left Hand Side in Straight Line 
        //If Black object Moves Cross (Above) in Right Hand Side Line 
        //If Black object Moves Cross (Above)  in Left Hand Side Line 
        //If Black object Moves Cross (Below) in Right Hand Side Line 
        //If Black object Moves Cross (Below)  in Left Hand Side Line  
        
   }
}
