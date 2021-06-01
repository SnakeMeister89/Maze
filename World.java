package mod;

import cont.JOP;
import view.StringMap;

public class World { // this is the world class that makes the game and puts it togather.

	private Player _p; // intiallizes the player
	private Minotaur _t; // intiallizes the minotaur
	private Maze _m; // intiallizes the maze
	private StringMap _s; // intiallizes the stringmap

	public World() {// this constructor declares everything and creats the world object
		_m = new Maze(); 
		// startROW startCOL
		_p = new Player(_m.getPlyStart()[0], _m.getPlyStart()[1]);
		_t = new Minotaur(_m.getMinStart()[0], _m.getMinStart()[1]);

		_s = new StringMap(_m, _p, _t);
		update();
	}

	public void update() { // this method is basically the whole game that puts all the methods together, checks for victory and defeat and the end
		boolean isPlaying = true;
		while (isPlaying) {
			boolean on = true;
			// Get the Map
			String map = _s.generateMap();
			String msg = "WASD to move. What direction do you want to move?";

			while (on) {
				// Get the player move
				String move = JOP.in(map + msg);

				// move the player
				if(move == null) {

				}
				else if (getPlayerMove(move)) {
					on = false;
				}
			}

			// check for victory
			if (victory()) {
				isPlaying = false;
				JOP.msg("Congrats victory!");
			}
			// move the minotaur
			moveMinotaur();
			
			// check for death
			if(death()) {
				isPlaying = false;
				JOP.msg("Wow what a loser. You suck. You lost. ");
			}
		}
	
		
	}

	// This method gets the playersmove and returns a boolean if he can move there or not.
	private boolean getPlayerMove(String s) {

		// Moving North
		if (s.equalsIgnoreCase("W")) {
			if ((_p.getRow() - 1) >= 0 && _m.getMaze()[_p.getRow() - 1][_p.getCol()]) {
				_p.setPos(_p.getRow() - 1, _p.getCol());
				return true;
			} else {
				return false;
			}
		}
		// Moving South
		if (s.equalsIgnoreCase("S")) {
			if ((_p.getRow() + 1) < _m.getMaze().length && _m.getMaze()[_p.getRow() + 1][_p.getCol()]) {
				_p.setPos(_p.getRow() + 1, _p.getCol());
				return true;
			} else {
				return false;
			}
		}
		// Moving East
		if (s.equalsIgnoreCase("D")) {
			if ((_p.getCol() + 1) < _m.getMaze()[0].length && _m.getMaze()[_p.getRow()][_p.getCol() + 1]) {
				_p.setPos(_p.getRow(), _p.getCol() + 1);
				return true;
			} else {
				return false;
			}
		}
		// Moving West
		if (s.equalsIgnoreCase("A")) {
			if ((_p.getCol() - 1) >= 0 && _m.getMaze()[_p.getRow()][_p.getCol() - 1]) {
				_p.setPos(_p.getRow(), _p.getCol() - 1);
				return true;
			} else {
				return false;
			}
		}

		return false;
	}
	
	private void moveMinotaur() { //this method finds the best move for the minotaur and moves him
		int rDist = _p.getRow() - _t.getRow();
		int cDist = _p.getCol() - _t.getCol();
		int r = _t.getRow();
		int c = _t.getCol();
		
		// Minotaur moving North
		if(rDist < 0 && _m.getMaze()[r - 1][c]) {
			_t.setPos(r - 1, c);
		}

		// Minotaur moving South.
		if(rDist > 0 && _m.getMaze()[r +1][c]) {
			_t.setPos(r + 1, c);
		}
		// Minotaur moving East
		if(cDist > 0 && _m.getMaze()[r][c + 1]) {
			_t.setPos(r, c + 1);
		}
		// Minotuar moving west
		if(cDist < 0 && _m.getMaze()[r][c - 1]) {
			_t.setPos(r, c - 1);
		}
	}
	
	public boolean death() { // this method checks to see if the player is dead 
		if(_t.getRow() == _p.getRow() &&
				_t.getCol() == _p.getCol()) {
			return true;
		}
		return false;
	}

	public boolean victory() { // this method checks to see if the player is on the exit and won.
		if (_p.getRow() == _m.getExit()[0] && _p.getCol() == _m.getExit()[1])
			return true;
		return false;
	}
}
