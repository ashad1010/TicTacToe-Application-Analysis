package GameFile;
import java.util.*;

//Creating a slice for variable PlayerInput in main method
public class Slice1 {

	public static void main(String[] args)
	{
		//Record time before program starts execution and store it
		long StartTime = System.nanoTime();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Player X will start. Please enter a spot for X, from 1 to 9:");
		
		//Record time after last instruction before user input and store it
		long EndTime = System.nanoTime();
		
		long ExecutionTime = EndTime - StartTime;
		System.out.println("\n(Execution time for this program iteration in nanoseconds: "+ExecutionTime+")");


			int PlayerInput;

			PlayerInput = input.nextInt();

			if (!(PlayerInput > 0 && PlayerInput <= 9)) {
				System.out.println("Sorry! Please enter a number from 1 to 9 again!");
			}
			else
			{
				System.out.println("PlayerInput="+PlayerInput);
			}
			
			
		
	}

}
