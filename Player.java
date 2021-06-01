package mod;

public class Player {// creats the player object and stores all of its information like position
	
	private int _row, _col;// stores the row and col of the player
	private boolean _isAlive; // stores the boolean if the player is alve or not
	// private boolean _sword;
	
	public int getRow() { return _row; } // getter method that returns the row
	public int getCol() { return _col; }// getter method that returns the col
	public void setPos(int r, int c) { _row = r; _col = c; }// setter method that sets the row and col
	
	
	public Player(int r, int c) { // contructor that makes the player object and declares the varaibles
		_row = r;
		_col = c;
		_isAlive = true;
	}
	
	public boolean isAlive() { return _isAlive; } // getter method that returns if the player is alive or not
	public void kill() { _isAlive = false; }// method that kills the player
	// hasSword(), giveSword();
}
