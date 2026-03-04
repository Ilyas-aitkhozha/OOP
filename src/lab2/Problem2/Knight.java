package lab2.Problem2;

public class Knight extends Piece {
    public Knight(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!basicCheck(b)) return false;

        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();

        if (dr < 0) dr = -dr;
        if (dc < 0) dc = -dc;

        return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
    }
}
