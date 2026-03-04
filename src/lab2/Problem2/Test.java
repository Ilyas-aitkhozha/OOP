package lab2.Problem2;

public class Test {
    public static void main(String[] args) {
        Piece rook = new Rook(new Position(1, 1));
        System.out.println("rook 1,1 to (1,8): " + rook.isLegalMove(new Position(1, 8)));
        System.out.println("rook 1,1 to (2,2): " + rook.isLegalMove(new Position(2, 2)));
        Piece knight = new Knight(new Position(4, 4));
        System.out.println("knight 4,4 to (6,5): " + knight.isLegalMove(new Position(6, 5)));
        System.out.println("Knight 4,4 to (5,5): " + knight.isLegalMove(new Position(5, 5)));

        Piece pawnW = new Pawn(new Position(2, 2), true);
        System.out.println("White pawn 2,2 to (4,2): " + pawnW.isLegalMove(new Position(4, 2)));
        System.out.println("White pawn 2,2 to (3,3): " + pawnW.isLegalMove(new Position(3, 3)));
    }
}