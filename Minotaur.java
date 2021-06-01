package mod;

public class Minotaur { // this is the minotaur class that stores the information for the minotaur like location

	private int _row, _col; // this initializes the rows and cols
	private boolean _isAlive; //boolean to check if it is alive
	
	public int getRow() { return _row; } // getter method that returns the row position
	public int getCol() { return _col; } // getter method that returns the col position
	public void setPos(int r, int c) { _row = r; _col = c; } // setter position that rets the minotaur position
	
	public Minotaur(int r, int c) { // minotaur constructor that makes the object
		_row = r;
		_col = c;
		_isAlive = true;
	}
	
	public boolean isAlive() { return _isAlive; } //getter method that returns if it is alive
	// public void kill() {}
}
