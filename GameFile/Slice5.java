package GameFile;
import java.util.*;
//Creating a slice for the Row and Won variables
public class Slice5 {
	public static String[] GameBoard  = new String[9];
	static String GameOver()
	{
		for (int i = 0; i < 8; i++) {
			String Row = "";
			switch (i) {
			case 0:
				Row = GameBoard[0] + GameBoard[1] + GameBoard[2];
				break;
			case 1:
				Row = GameBoard[3] + GameBoard[4] + GameBoard[5];
				break;
			case 2:
				Row = GameBoard[6] + GameBoard[7] + GameBoard[8];
				break;
			case 3:
				Row = GameBoard[0] + GameBoard[3] + GameBoard[6];
				break;
			case 4:
				Row = GameBoard[1] + GameBoard[4] + GameBoard[7];
				break;
			case 5:
				Row = GameBoard[2] + GameBoard[5] + GameBoard[8];
				break;
			case 6:
				Row = GameBoard[0] + GameBoard[4] + GameBoard[8];
				break;
			case 7:
				Row = GameBoard[2] + GameBoard[4] + GameBoard[6];
				break;
			}
			//Testing the XXX value
			Row="XXX";
			if (Row.equals("XXX")) {
				return "X";
			}
			else if (Row.equals("OOO")) {
				return "O";
			}
		}
		return "";	
	}
	public static void main(String[] args)
	{ 
		//Record time before program starts execution and store it
			long StartTime = System.nanoTime();
			
		String Won = "";
		Won = GameOver();
		
		if (Won.equalsIgnoreCase("D")) {
			System.out.println("This game is a draw!");
		}
		else {
			System.out.println("Player " + Won + " has won the game!");
		}
		
		//Record time after last instruction before user input and store it
		long EndTime = System.nanoTime();
				
		long ExecutionTime = EndTime - StartTime;
		System.out.println("\n(Execution time for this program iteration in nanoseconds: "+ExecutionTime+")");
	}
}
