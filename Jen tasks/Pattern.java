import java.util.Scanner;

public class Pattern{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int userInput = input.nextInt();

	for(userInput = 1; userInput <= 5; userInput++){
	  for(int num = userInput; num > 0; num--){
		System.out.print(num); 
	  }
	System.out.println();
        }
    }
}