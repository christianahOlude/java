import java.util.Scanner;

public class ValidatingUserInput{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	while(true){
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if(number == 1 || number == 2) break;
	}
	
}
}