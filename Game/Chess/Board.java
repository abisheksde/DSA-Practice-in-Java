package Game.Chess;

public class Board {
    static int[][] board = new int[8][8];

    final static int white = 1;
    final static int black = 2;

    final static int sepoy = 'P';
    final static int elephant = 'R';
    final static int horse = 'N';
    final static int minister = 'B';
    final static int queen = 'Q';
    final static int king = 'K';

    public static void rookInit(){

        //White Coin Initialization
        for(int i=0; i==0; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){
                

                if(j==0||j==7){
                    String pieceString = " "+white+elephant+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
        

        //Black Coin Initialization
        for(int i=7; i==7; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){
                

                if(j==0||j==7){
                    String pieceString = " "+black+elephant+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
    }  

    public static void knightInit(){

        //White Coin Initialization
        for(int i=0; i==0; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){
                
          

                if(j==1||j==6){
                    String pieceString = " "+white+horse+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
        

        //Black Coin Initialization
        for(int i=7; i==7; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){
                
         

                if(j==1||j==6){
                    String pieceString = " "+black+horse+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
    }  


    public static void bishopInit(){

        //White Coin Initialization
        for(int i=0; i==0; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){

                if(j==2||j==5){
                    String pieceString = " "+white+minister+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
        

        //Black Coin Initialization
        for(int i=7; i==7; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){

                if(j==2||j==5){
                    String pieceString = " "+black+minister+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
    }

    public static void pawnInit(){

        int pawnCount = 8;

        //White Coin Initialization
        for(int i=1; i==1; i++){
            int inc = 0;
            for(int j=0; j<pawnCount; j++){

                String pieceString = " "+white+sepoy+ ++inc;

                String piece = pieceString.replaceAll("\\s", "");

                int pieceInt = Integer.parseInt(piece);

                board[i][j] = pieceInt;

                //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
            }
            //System.out.println("\n");
        }
        

        //Black Coin Initialization
        for(int i=6; i==6; i++){
            int inc = 0;
            for(int j=0; j<pawnCount; j++){

                String pieceString = " "+black+sepoy+ ++inc;

                String piece = pieceString.replaceAll("\\s", "");

                int pieceInt = Integer.parseInt(piece);

                board[i][j] = pieceInt;

                //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
            }
            //System.out.println("\n");
        }
    }    

    public static void kingInit(){

        //White Coin Initialization
        for(int i=0; i==0; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){
                
          

                if(j==4){
                    String pieceString = " "+white+king+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
        

        //Black Coin Initialization
        for(int i=7; i==7; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){
                
         

                if(j==3){
                    String pieceString = " "+black+king+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
    }  


    public static void queenInit(){

        //White Coin Initialization
        for(int i=0; i==0; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){

                if(j==3){
                    String pieceString = " "+white+queen+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
        

        //Black Coin Initialization
        for(int i=7; i==7; i++){
            int inc = 0;
            for(int j=0; j<board.length; j++){

                if(j==4){
                    String pieceString = " "+black+queen+ ++inc;

                    String piece = pieceString.replaceAll("\\s", "");
    
                    int pieceInt = Integer.parseInt(piece);
    
                    board[i][j] = pieceInt;
    
                    //System.out.print(board[i][j] +"-" + "["+i+","+j+"], ||  ");
                }
            }
            //System.out.println("\n");
        }
    }

    

    public static void displayBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.printf("%04d",board[i][j]);
                System.out.print(", ");
            }
            System.out.println("\n");
        }
    }

    public static void initializeChessBoard(){
        pawnInit();
        rookInit();
        knightInit();
        bishopInit();
        kingInit();
        queenInit();
        displayBoard();
    }

    
    
}
