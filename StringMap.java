package view;

import mod.Maze;
import mod.Minotaur;
import mod.Player;

public class StringMap {


	private final String _wall = "o";
	private final String _path = "x";
	private final String _ply = "P";
	private final String _min = "M";
	private final String _exit = "E";
	private final String _space = "     ";
	// private final String _sword = "S";
	private Maze _maze;
	private Player _plyr;
	private Minotaur _mint;
	
	public StringMap(Maze m, Player p, Minotaur t) {
		_maze = m;
		_plyr = p;
		_mint = t;
	}
	
	public String generateMap() {
		 String map = "";
		 for(int r = 0; r < _maze.getMaze().length; r++) {
			 for(int c = 0; c < _maze.getMaze()[0].length; c++) {
				 if(_plyr.getRow() == r && _plyr.getCol() == c) {
					 map += _ply + _space;
				 }
				 else if(_mint.getRow() == r && _mint.getCol() == c) {
					 map += _min + _space; 
				 }
				 else if(_maze.getExit()[0] == r && _maze.getExit()[1] == c) {
					 map += _exit + _space; 
				 }
				 else if(_maze.getMaze()[r][c]) {
					 map += _path + _space;
				 }
				 else {
					map += _wall + _space; 
				 }
			 }
			 map += "\n";
		 }
		 map += "\n";
		
		 
		 
		 
		 
		 return map;
	}
	
}
