package view;

import mod.Maze;
import mod.Minotaur;
import mod.Player;

public class StringMap { // this method turns all the information on the other class into a string so that it can be seen


	private final String _wall = "o"; // sets a wall to look like something
	private final String _path = "x";// sets a path to look like something
	private final String _ply = "P";// sets the player to look like something
	private final String _min = "M";// sets the minotaur to look like something
	private final String _exit = "E";// sets the exit to look like something
	private final String _space = "     ";// sets a space to look like something
	private Maze _maze; //initalizes the maze
	private Player _plyr;//initalizes the player
	private Minotaur _mint;//initalizes the minotaur
	
	public StringMap(Maze m, Player p, Minotaur t) { // String Map constructor that declears all the information
		_maze = m;
		_plyr = p;
		_mint = t;
	}
	
	public String generateMap() { // this method generates the maze and sets it equal to a string
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
