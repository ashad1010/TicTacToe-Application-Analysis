package GameFile;
import java.util.*;

//Creating a slice for the Restart variable in the main method
import java.util.Scanner;

public class Slice4 {

	private static String Restart = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Record time before program starts execution and store it
		long StartTime = System.nanoTime();
		
		do {
			
		System.out.print("Would you like to play again? (Y/N):");
		

		//Record time after last instruction before user input and store it
		long EndTime = System.nanoTime();
		
		long ExecutionTime = EndTime - StartTime;
		System.out.println("\n(Execution time for this program iteration in nanoseconds: "+ExecutionTime+")");
		
		Restart = input.next();
		
		}while(Restart.equalsIgnoreCase("y"));
	}

}
