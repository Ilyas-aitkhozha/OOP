package lab2.Problem2;

public class Rook extends Piece {
    public Rook(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!basicCheck(b)) return false;
        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();

        return dr == 0 || dc == 0;
    }
}
