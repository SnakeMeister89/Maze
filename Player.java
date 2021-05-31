package mod;

public class Player {
	
	private int _row, _col;
	private boolean _isAlive;
	// private boolean _sword;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	
	
	public Player(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
	}
	
	public boolean isAlive() { return _isAlive; }
	public void kill() { _isAlive = false; }
	// hasSword(), giveSword();
}
