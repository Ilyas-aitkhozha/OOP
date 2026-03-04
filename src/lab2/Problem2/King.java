package lab2.Problem2;

public class King extends Piece {
    public King(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!basicCheck(b)) return false;

        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();
        if (dr < 0) dr = -dr;
        if (dc < 0) dc = -dc;

        return dr <= 1 && dc <= 1;
    }
}