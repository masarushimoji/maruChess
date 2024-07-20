public class Main {
    public static void main(String[] args) {
        System.out.println("{Welcome to maruChess!!}");


        Piece[][] board = new Piece[2][2];

        System.out.println(board[0][1]);


        Piece whiteKing = new Piece("king", Colour.WHITE);
        Piece blackKing = new Piece("king", Colour.BLACK);

        board[0][1] = whiteKing;
        System.out.println(board[0][1].getName());




        
    }
}