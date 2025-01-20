import java.util.Scanner;

public class TicTacToe{
	private static String[][] board= new String[3][3];
	private static Scanner input = new Scanner(System.in);
	private static boolean isWinner = false;
	private static String winner = "";
	private static  int counter = 0;

	public static void main(String[] args){
		setBoard();
		display();
		playGame();

	}
	public static boolean checkForDraw(){
		boolean isEmpty = true;
		for(int count=0; count<board.length; count++){
			for(int counter=0; counter<board[count].length; counter++){
				if(board[count][counter] == "EMPTY") isEmpty=false;
			}
			
		}
		return isEmpty;
	}
	public static void display(){
		System.out.println("-------------------");
		
		for(int count=0; count<board.length; count++){
			System.out.print("|");
			for(int counter=0; counter<board[count].length; counter++){
				if(board[count][counter] != "EMPTY") System.out.print("  " + board[count][counter] +"  ");
				else  System.out.print( board[count][counter]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------------------");
		}
	}
	public static void setBoard(){
		for(int count=0; count<board.length; count++){
			for(int counter=0; counter<board[count].length; counter++){
				if(board[count][counter] == null)board[count][counter]=Value.EMPTY.name();
			}
			
		}
	}

	public static void playGame(){
		System.out.println("Player One Uses X While Player Two Uses O ");
		while(true){
			if(isWinner) break;
			collectInputForX();
		if(counter == 9){
			 System.out.println("The Game is A Draw");	
			break;
		}
			if(isWinner) break;
			collectInputForY();
			
		if(counter == 9){
			 System.out.println("The Game is A Draw");	
			break;
		}
		}
		
		if(isWinner)System.out.println(winner + " is the winner");

	}
	public static void checkForWinner(){

		if(board[0][0] != "EMPTY" && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
		 winner =board[0][0];
		 isWinner=true;
		}
		else if(board[0][2] !="EMPTY" &&  board[0][2] == board[1][1] && board[0][2] == board[2][0]){
		 winner =board[0][2];
		 isWinner=true;
		}
		else if(board[0][0] != "EMPTY" && board[0][0] == board[0][1] && board[0][0] == board[0][2]){
		 winner =board[0][0];
		isWinner=true;
		}
		else if(board[1][0] !="EMPTY" && board[1][0] == board[1][1] && board[1][0] == board[1][2]){
 		winner =board[1][0];
		isWinner=true;
		}
		else if(board[2][0] != "EMPTY" && board[2][0] == board[2][1] && board[2][0] == board[2][2]){
 		winner =board[2][0];
		isWinner=true;
		}
		else if(board[0][0] != "EMPTY" && board[0][0] == board[1][0] && board[0][0] == board[2][0]){
 		winner =board[0][0];
		isWinner=true;
		}
		if(board[0][1] !="EMPTY" && board[0][1] == board[1][1] && board[0][1] == board[2][1]){
		 winner =board[0][1];
		isWinner=true;
		}
		if(board[0][2] != "EMPTY" && board[0][2] == board[1][2] && board[0][0] == board[2][2]){
		 winner =board[0][2];
		isWinner=true;
		}

	}
	public static void collectInputForX(){
		int row=0;
		int column=0;
		counter++;
		System.out.println("Player One Choose Row You want play: ");
			 row = input.nextInt();
			System.out.println("Player One Choose Row You want play: ");
			 column= input.nextInt();
			board[row][column] = Value.X.name();
			display();
			checkForWinner();
	}
	public static void collectInputForY(){
		int row=0;
		int column=0;
		counter++;
		System.out.println("Player Two Choose Row You want play: ");
			 row = input.nextInt();
			System.out.println("Player Two Choose Row You want play: ");
			 column= input.nextInt();
			board[row][column] = Value.O.name();
			checkForWinner();
			display();
	}
} 