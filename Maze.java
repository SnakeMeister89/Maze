package mod;

public class Maze {

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
	
	// private boolean[][][] _mazeList;
	// private int[][] _plyStartLocations;
	// private int[][] _minStartLocations;
	// private int[][] _exit;
	// private int[][] _sword;
	
	// currentLocations
	private int[] _plyStartLocations = {0,2};
	private int[] _minStartLocations = {5,9};
	private int[] _exit = {5,0};
	//private int[] _sword;
	
	
	public boolean[][] getMaze() { return _curMaze; }
	public int[] getPlyStart() { return _plyStartLocations; }
	public int[] getMinStart() { return _minStartLocations; }
	public int[] getExit() { return _exit; }
	// public int[] getSword();
	
	//public void setCurMaze(int mazeNum) { }
}
