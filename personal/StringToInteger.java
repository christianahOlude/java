import java.util.Scanner;

public class StringToInteger{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Input a number in string: ");
	String enter = input.nextLine();

	System.out.printf("The integer value is: %s",enter);	
	
	}
}