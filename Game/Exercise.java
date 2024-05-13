package Game;

import Game.Chess.Board;

/**
 * Exercise
 */
public class Exercise {
     // Method to move a piece from one position to another
    public static void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        // Check if the move is valid
        if (isValidMove(fromRow, fromCol, toRow, toCol)) {
            // Perform the move
            //Board.board[toRow][toCol] = Board.board[fromRow][fromCol];
            //Board.board[fromRow][fromCol] = '\u0000'; // Empty the previous position

            // Display the move
            System.out.println("Piece moved from [" + fromRow + "][" + fromCol + "] to [" + toRow + "][" + toCol + "]");
        } else {
            System.out.println("Invalid move!");
        }
    }

    // Method to check if the move is valid
    private static boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // Implement your validation logic here
        // For simplicity, let's assume all moves are valid
        return true;
    }
}