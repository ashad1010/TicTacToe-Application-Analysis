package GameFile;
import java.util.*;

/*Creating a slice for variable GameBoard Array (without any elements) in the DisplayBoard method
 *to see if array elements and board layout prints accurately
 */
public class Slice2 {

	public static String[] GameBoard  = new String[9];
	
		static String[] DisplayBoard()
		{
			System.out.println("             ");
			System.out.println("  " + GameBoard[0] + " | " + GameBoard[1] + " | " + GameBoard[2] + "  ");
			System.out.println(" ---+---+---");
			System.out.println("  " + GameBoard[3] + " | " + GameBoard[4] + " | " + GameBoard[5] + "  ");
			System.out.println(" ---+---+---");
			System.out.println("  " + GameBoard[6] + " | " + GameBoard[7] + " | " + GameBoard[8] + "  ");
			System.out.println("             ");
			
			return GameBoard;
		}
		public static void main(String[] args)
		{
			//Record time before program starts execution and store it
			long StartTime = System.nanoTime();
			
			DisplayBoard();

			//Record time after last instruction before user input and store it
			long EndTime = System.nanoTime();
			
			long ExecutionTime = EndTime - StartTime;
			System.out.println("\n(Execution time for this program iteration in nanoseconds: "+ExecutionTime+")");
		}
	}


