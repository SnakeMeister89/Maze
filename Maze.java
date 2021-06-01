package mod;

public class Maze { //this is the maze method which has all the information about the maze like the start and end location and the walls and paths

	private boolean [][] _curMaze =
		{
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	true, 	true, 	true, 	false, 	false, 	false},
		{false,		false, 	true, 	true, 	true, 	false, 	true, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	true, 	true, 	true, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	true, 	true, 	true},
		{true,		true, 	true, 	true, 	true, 	true, 	true, 	true, 	false, 	true},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	true, 	true, 	true},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
		{false,		false, 	false, 	false, 	false, 	false, 	false, 	false, 	false, 	false}
		};
	
	
	
	private int[] _plyStartLocations = {0,2};// this is the start locations in a maze that are stored in an array
	private int[] _minStartLocations = {5,9};// this is the start locations for the minotaur and it is stored in an array
	private int[] _exit = {5,0};// this is the end location in a maze that are stored in an array
	
	
	
	public boolean[][] getMaze() { return _curMaze; }// getter method that returns the maze
	public int[] getPlyStart() { return _plyStartLocations; }//getter method that returns the start locations
	public int[] getMinStart() { return _minStartLocations; }//getter method that returns the minotaurs start locations
	public int[] getExit() { return _exit; } //getter method that returns the exit location
	
}
