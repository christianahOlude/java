import java.util.Random;
import java.util.Scanner;

public class GuessNumberWithoutLoop{
	public static void main(String[] args){

	Random enter = new Random();
	Scanner input = new Scanner(System.in);

		int number = 50;
		



			System.out.print("Enter a number btw 0 to 100: ");
			int userInput = input.nextInt();

			if (number == userInput){
			System.out.println("userInput is correct");

	  		 }else 
			if (number < userInput){
			System.out.println("userInput is too high");
			}else 
			if (number > userInput){
			System.out.println("userInput is too low");
			}
	}
}