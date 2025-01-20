import java.util.Scanner;

public  class TicTacTo{
	private static String[][] board = new String[3][3];
	private static Scanner scanner = new Scanner(System.in);
	private static boolean isWinner = false;
	public static void display(){
		System.out.println("-------");
		
		for(int count=0; count<board.length; count++){
			System.out.print("|");
			for(int counter=0; counter<board[count].length; counter++){
				if(board[count][counter] == null)System.out.print(" ");
				else  System.out.print(board[count][counter]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------");
		}
	}
	public static void collectInputForPlayerX(){
		System.out.println("Enter A Row (0,1 or 2) for player X: ");
			int row = scanner.nextInt();
		System.out.println("Enter A Column (0,1 or 2) for player X: ");
			int column = scanner.nextInt();
		board[row][column]= "X";
		display();
		
	}
	
	public static void collectInputForPlayerY(){
		System.out.println("Enter A Row (0,1 or 2) for player Y: ");
			int row = scanner.nextInt();
		System.out.println("Enter A Column (0,1 or 2) for player Y: ");
			int column = scanner.nextInt();
		board[row][column]= "O";
		display();
		
	}

	public static void checkForWinner(){

		if(board[0][0] != null && board[0][0] ==board[1][1] && board[0][0] ==board[2][2]){
		 System.out.printf("Player %s Won The Game ",board[0][0]);
		 isWinner=true;
		}
		else if(board[0][2] != null &&  board[0][2] ==board[1][1] && board[0][2] ==board[2][0]){
		 System.out.printf("Player %s Won The Game ",board[0][2]);
		 isWinner=true;
		}
		else if(board[0][0] != null && board[0][0] ==board[0][1] && board[0][0] ==board[0][2]){
		 System.out.printf("Player %s Won The Game ",board[0][0]);
		isWinner=true;
		}
		else if(board[1][0] != null && board[1][0] ==board[1][1] && board[1][0] ==board[1][2]){
 		System.out.printf("Player %s Won The Game ",board[1][0]);
		isWinner=true;
		}
		else if(board[2][0] != null && board[2][0] ==board[2][1] && board[2][0] ==board[2][2]){
 		System.out.printf("Player %s Won The Game ",board[2][0]);
		isWinner=true;
		}
		else if(board[0][0] != null && board[0][0] ==board[1][0] && board[0][0] ==board[2][0]){
 		System.out.printf("Player %s Won The Game ",board[0][0]);
		isWinner=true;
		}
		if(board[0][1] != null && board[0][1] ==board[1][1] && board[0][1] ==board[2][1]){
		 System.out.printf("Player %s Won The Game ",board[0][1]);
		isWinner=true;
		}
		if(board[0][2] != null && board[0][2] ==board[1][2] && board[0][0] ==board[2][2]){
		 System.out.printf("Player %s Won The Game ",board[0][2]);
		isWinner=true;
		}

	}

	public static void main(String[] args){
		display();
		for(int count =0;  count<3; count++){
			collectInputForPlayerX();
			checkForWinner();
			if(isWinner) break;
			collectInputForPlayerY();
			checkForWinner();
			if(isWinner) break;
		}
		
	}	
		
}
