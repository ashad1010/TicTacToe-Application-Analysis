/* Name: Ashad Ahmed
 * ID: 100745913
 * Course: SOFE 3980U
 * Assignment 1 - Game Class
 */

//Declare Package
package GameFile;

import java.util.*;

//Class for the Java game
public class TicTacToe
{
	//String to restart game after it has ended
	private static String Restart = "";
	//Utilize an array for all slots in which X or O will be entered by the user
	public static String[] GameBoard  = new String[9];
	//Variable that stores either X or O 
	static String PlayerChoice;

	//Layout of the board first with array elements in square brackets []
	/*
	 * [0]|[1]|[2]
	 * ---+---+---
	 * [3]|[4]|[5]
	 * ---+---+---
	 * [6]|[7]|[8]
	 * 
	 */

	//Method to Display the board
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

	//Method to decide all winning combinations of input on array
	static String GameOver()
	{
		for (int i = 0; i < 8; i++) {

			//String for winning row, whether horizontal, vertical or diagonal
			String Row = "";

			switch (i) {
			//Horizontal
			case 0:
				Row = GameBoard[0] + GameBoard[1] + GameBoard[2];
				break;
			case 1:
				Row = GameBoard[3] + GameBoard[4] + GameBoard[5];
				break;
			case 2:
				Row = GameBoard[6] + GameBoard[7] + GameBoard[8];
				break;
			//Vertical
			case 3:
				Row = GameBoard[0] + GameBoard[3] + GameBoard[6];
				break;
			case 4:
				Row = GameBoard[1] + GameBoard[4] + GameBoard[7];
				break;
			case 5:
				Row = GameBoard[2] + GameBoard[5] + GameBoard[8];
				break;
			//Diagonal
			case 6:
				Row = GameBoard[0] + GameBoard[4] + GameBoard[8];
				break;
			case 7:
				Row = GameBoard[2] + GameBoard[4] + GameBoard[6];
				break;
			}

			//Return value based on winner
			//If X creates a line of 3 first, X is passed onto the main method
			if (Row.equals("XXX")) {
				return "X";
			}

			//If X creates a line of 3 first, X is passed onto the main method
			else if (Row.equals("OOO")) {
				return "O";
			}
		}

		//For loop to keep checking if there is still space on the game board for more entries
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(GameBoard).contains(String.valueOf(i + 1))) {
				break;
			}
			//Returns a D if all entries have been filled, and no strike-through for any player (Draw)
			else if (i == 8) {
				return "D";
			}
		}

		//Determine who's turn is next
		System.out.println(PlayerChoice + "! It's your turn! Please pick an empty spot from 1 to 9:");

		//Return statement for the GameOver class
		return "";
	}

	//Main Method
	public static void main(String[] args)
	{

		try (Scanner input = new Scanner(System.in)){
			
			//Record time before program starts execution and store it
			long StartTime = System.nanoTime();
			do {
				PlayerChoice = "X";
				String Won = "";

				for (int a = 0; a < 9; a++) {
					GameBoard[a] = String.valueOf(a + 1);
				}

				//Call DisplayBoard method to display the game board
				System.out.println("---Tic Tac Toe Game---");
				DisplayBoard();

				System.out.println("Player X will start. Please enter a spot for X, from 1 to 9:");
				
			//Record time after last instruction before user input and store it
			long EndTime = System.nanoTime();
			
			long ExecutionTime = EndTime - StartTime;
			System.out.println("\n(Execution time for this program iteration in nanoseconds: "+ExecutionTime+")");

				//The users will not be prompted to enter anything once someone has won
				while (Won == "") {
					int PlayerInput;

					//Taking user input for X or O
					PlayerInput = input.nextInt();

					//Prompt re-entry if user enters a number outside of tile range
					if (!(PlayerInput > 0 && PlayerInput <= 9)) {
						System.out.println("Sorry! Please enter a number from 1 to 9 again");
						continue;
					}

					//Check if string turn (X or O) has already been entered on an array spot
					if (GameBoard[PlayerInput - 1].equals(String.valueOf(PlayerInput))) {
						//If the spot is empty assign the turn string to it
						GameBoard[PlayerInput - 1] = PlayerChoice;

						//Change from X to O and vice versa after a slot has been assigned a turn
						if (PlayerChoice.equals("X")) {
							PlayerChoice = "O";
						}
						else {
							PlayerChoice = "X";
						}

						DisplayBoard();

						//Store the return value from if statements in GameOver
						Won = GameOver();
					}
					else {
						System.out.println("This position has already been used, please try again:");
					}
				}

				//Display result after winner gets a variable from GameOver
				if (Won.equalsIgnoreCase("D")) {
					System.out.println("This game is a draw!");
				}
				else {
					System.out.println("Player " + Won + " has won the game!");
				}

				
				//Ask user(s) if they want to play again
				System.out.print("Would you like to play again? (Y/N):");
				Restart = input.next();
				
			}while(Restart.equalsIgnoreCase("y"));

		}
	}
}
