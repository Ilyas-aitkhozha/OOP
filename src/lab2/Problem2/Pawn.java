package lab2.Problem2;

public class Pawn extends Piece {
    private boolean isWhite;

    public Pawn(Position a, boolean isWhite) {
        super(a);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!basicCheck(b)) return false;
        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();

        int dir = isWhite ?1 :-1;
        if (dc == 0 && dr == dir) return true;

        if (dc == 0) {
            if (isWhite && a.getRow() == 2 && dr == 2 * dir) return true;
            if (!isWhite && a.getRow() == 7 && dr == 2 * dir) return true;
        }
        if ((dc == 1 || dc == -1) && dr == dir) return true;

        return false;
    }
}