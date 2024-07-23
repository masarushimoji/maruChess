import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
      
        System.out.println("{Welcome to maruChess!!}");
        System.out.println(Board.board[0][1]);


        Piece whiteKing = new Piece("king", Colour.WHITE);
        Piece blackKing = new Piece("king", Colour.BLACK);

        

        Board.board[0][1] = whiteKing;
        Board.board[2][1] = blackKing;
        System.out.println(Board.board[0][1].getName());




        
    }
    
    public void menu() {
        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Options:");
        System.out.println("1) Print current state of board");
        System.out.println("2) Make a move");

        input = scan.nextLine();
        scan.close();
        if (input.equals("1")) {
            printBoard();
        } 
    }

    public void printBoard() {
        int boardWidth = Board.board.length;
        for (int i=0; i<boardWidth; i++) {
            System.out.println();
            for (int j=0; j<boardWidth; j++) {
                System.out.print("[" + Board.board[i][j].getName() + "] ");
            }
        }
    }

    public String convertNumToLetter(int i) {
        if (i==0) {
            return "a";
        }
        if (i==1) {
            return "b";
        }
        if (i==2) {
            return "c";
        }
        if (i==3) {
            return "d";
        }
        if (i==4) {
            return "e";
        }
        if (i==5) {
            return "f";
        }
        if (i==6) {
            return "g";
        }
        if (i==7) {
            return "h";
        }
        return null;
    }
}