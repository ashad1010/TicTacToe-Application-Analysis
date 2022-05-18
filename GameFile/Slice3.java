package GameFile;
import java.util.*;

//Creating a dynamic slice for public variable PlayerChoice which switches after turns, in this case the value to switch will be X

public class Slice3 {
	static String PlayerChoice;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Record time before program starts execution and store it
				long StartTime = System.nanoTime();
	
		PlayerChoice = "X";
		
		if (PlayerChoice.equals("X")) {
			PlayerChoice = "O";
		}
		else {
			PlayerChoice = "X";
		}
		System.out.println(PlayerChoice + "! It's your turn! Please pick an empty spot from 1 to 9");

		//Record time after last instruction before user input and store it
		long EndTime = System.nanoTime();
		
		long ExecutionTime = EndTime - StartTime;
		System.out.println("\n(Execution time for this program iteration in nanoseconds: "+ExecutionTime+")");
	}

}
