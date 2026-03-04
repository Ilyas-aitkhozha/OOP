package lab2.Problem2;

public class Bishop extends Piece {
    public Bishop(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!basicCheck(b)) return false;

        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();
        if (dr < 0) dr = -dr;
        if (dc < 0) dc = -dc;

        return dr == dc;
    }
}
