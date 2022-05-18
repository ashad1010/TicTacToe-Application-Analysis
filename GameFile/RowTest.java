/* Name: Ashad Ahmed
 * ID: 100745913
 * Course: SOFE 3980U
 * Assignment 1 - Test Class
 */
package GameFile;
	
import static org.junit.jupiter.api.Assertions.*;
	
import org.junit.jupiter.api.Test;
	
	//Class to test the values of X and why in each row formation
	class RowTest {
	
		//Tests 1 and 2 - Horizontal Row Orientation
		@Test
		void testHorizontalX() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="X";
			board.GameBoard[1]="X";
			board.GameBoard[2]="X";
			
			assertEquals(board.GameOver(),"X");
		}
		
		@Test
		void testHorizontalO() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="O";
			board.GameBoard[1]="O";
			board.GameBoard[2]="O";
			
			assertEquals(board.GameOver(),"O");
		}
		
		//Tests 3 and 4 - Vertical Row Orientation
		@Test
		void testVerticalX() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="X";
			board.GameBoard[3]="X";
			board.GameBoard[6]="X";
			
			assertEquals(board.GameOver(),"X");
		}
		
		@Test
		void testVerticalO() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="O";
			board.GameBoard[3]="O";
			board.GameBoard[6]="O";
			
			assertEquals(board.GameOver(),"O");
		}
		
		//Tests 5 and 6 - Diagonal Row Orientation
		@Test
		void testDiagonalX() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="X";
			board.GameBoard[4]="X";
			board.GameBoard[8]="X";
			
			assertEquals(board.GameOver(),"X");
		}
		
		@Test
		void testDiagonalO() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="O";
			board.GameBoard[4]="O";
			board.GameBoard[8]="O";
			
			assertEquals(board.GameOver(),"O");
		}
		
		//Test 7 - A draw with no winners in a row
		@Test
		void testDraw() {
			TicTacToe board = new TicTacToe();
			board.GameBoard[0]="X";
			board.GameBoard[1]="O";
			board.GameBoard[2]="O";
			
			assertEquals(board.GameOver(),"D");
		}
	
	
	}
