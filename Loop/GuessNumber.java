
import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){

	Random enter = new Random();
	Scanner input = new Scanner(System.in);

		int number = 50;
		int userInput = 0;

	do{

			System.out.print("Enter a number btw 0 to 100: ");
			userInput = input.nextInt();

			if (number == userInput){
			System.out.println("userInput is correct");

	  		 }else 
			if (number < userInput){
			System.out.println("userInput is too high");
			}else 
			if (number > userInput){
			System.out.println("userInput is too low");
			}


	   }while   (number != userInput);
		


	}


}