package lab2.Problem2;

public class Queen extends Piece {
    public Queen(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!basicCheck(b)) return false;

        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();
        int adr = dr < 0 ? -dr : dr;
        int adc = dc < 0 ? -dc : dc;
        return dr == 0 || dc == 0 || adr == adc;
    }
}
