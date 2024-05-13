package Game.Chess;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Board.initializeChessBoard();

        int[] from = new int[2];
        int[] to = new int[2];

        System.out.print("Move From : ");
        for(int i= 0; i<2; i++){
            from[i] = scanner.nextInt();
        }
        System.out.println("Move From : ");
        for(int i= 0; i<2; i++){
            to[i] = scanner.nextInt();
        }

        GameController.movePiece(from, to);

        Board.displayBoard();
    }
    
}
