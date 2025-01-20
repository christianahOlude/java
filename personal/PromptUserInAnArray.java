import java.util.Scanner;

public class PromptUserInAnArray{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int userInput = input.nextInt(); 

	int[] arr = new int[userInput];

	for(int number = 0; number < userInput; number++){
		System.out.print(number);
		}
	}
}