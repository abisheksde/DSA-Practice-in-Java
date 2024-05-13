package Game;

import java.util.Scanner;

public class ChessGame {
    private static char[][] board;

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter move (e.g., 'a2a4' to move pawn from a2 to a4): ");
            String move = scanner.nextLine();
            if (isValidMove(move)) {
                makeMove(move);
                displayBoard();
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }
    }

    private static void initializeBoard() {
        board = new char[8][8];
        // Initialize pieces
        board[1][0] = 'P'; board[1][1] = 'P'; board[1][2] = 'P'; board[1][3] = 'P'; 
        board[6][0] = 'p'; board[6][1] = 'p'; board[6][2] = 'p'; board[6][3] = 'p'; 
        // Initialize empty squares
        for (int row = 2; row <= 5; row++) {
            for (int col = 0; col <= 7; col++) {
                board[row][col] = '.';
            }
        }
    }

    private static void displayBoard() {
        for (int row = 0; row <= 7; row++) {
            for (int col = 0; col <= 7; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(String move) {
        // Check move format
        if (move.length() != 4) {
            return false;
        }
        // Check if coordinates are within the board range
        int srcRow = 8 - Character.getNumericValue(move.charAt(1));
        int srcCol = move.charAt(0) - 'a';
        int destRow = 8 - Character.getNumericValue(move.charAt(3));
        int destCol = move.charAt(2) - 'a';
        if (srcRow < 0 || srcRow > 7 || srcCol < 0 || srcCol > 7 ||
            destRow < 0 || destRow > 7 || destCol < 0 || destCol > 7) {
            return false;
        }
        // Check if there is a piece at the source position
        if (board[srcRow][srcCol] == '.') {
            return false;
        }
        // Valid move if destination is empty or contains opponent's piece
        return board[destRow][destCol] == '.' || Character.isUpperCase(board[srcRow][srcCol]) != Character.isUpperCase(board[destRow][destCol]);
    }

    private static void makeMove(String move) {
        int srcRow = 8 - Character.getNumericValue(move.charAt(1));
        int srcCol = move.charAt(0) - 'a';
        int destRow = 8 - Character.getNumericValue(move.charAt(3));
        int destCol = move.charAt(2) - 'a';
        char piece = board[srcRow][srcCol];
        board[srcRow][srcCol] = '.';
        board[destRow][destCol] = piece;
    }
}
