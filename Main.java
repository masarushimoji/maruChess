public class Main {
    public static void main(String[] args) {
        System.out.println("{Welcome to maruChess!!}");


        Piece[][] board = new Piece[2][2];

        System.out.println(board[0][1]);


        Piece whiteKing = new Piece("king", Colour.WHITE);
        Piece blackKing = new Piece("king", Colour.BLACK);

        

        board[0][1] = whiteKing;
        board[2][1] = blackKing;
        System.out.println(board[0][1].getName());




        
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