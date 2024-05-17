package Game.Chess;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Board.initializeChessBoard();

        int[] from = new int[2];
        int[] to = new int[2];

        /// Modify the Code like below
        /// Customer will Enter 24 instead of 2 & 4
        /// But, We Split that 24 into 2 & 4, then insert it into an Array
        /// Now, we should pass the as a parameter in GameController.movePiece(from,to)
        /// here, from = [2,4]

        while (true) {
            System.out.print("Move From : ");
            for (int i = 0; i < 2; i++) {
                from[i] = scanner.nextInt();
            }
            System.out.println("Move To : ");
            for (int i = 0; i < 2; i++) {
                to[i] = scanner.nextInt();
            }

            GameController.movePiece(from, to);

            Board.displayBoard();
        }
    }

}
