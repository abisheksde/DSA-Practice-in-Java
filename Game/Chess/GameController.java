package Game.Chess;

public class GameController {
   

   public static boolean isValidMove(int[] from, int[] to){

        // If Player tell to Move from Blank Space
        if(Board.board[from[0]][from[1]]==0){
            return false;
        }

        //If Player try to break their Own Piece
        if(Board.board[from[0]][from[1]]/1000 == Board.board[to[0]][to[1]]/1000) {
            return false;
        }

        // Implement More validation logic here
        // For simplicity, let's assume all moves are valid
        return true;
   }

   
    public static void movePiece(int[] from, int[] to){
        if(isValidMove(from, to)){
            Board.board[to[0]][to[1]] = Board.board[from[0]][from[1]];
            Board.board[from[0]][from[1]] = '\u0000'; // Empty the previous position
        } else {
            System.out.println("Invalid Move");
        }
   }
   
}
