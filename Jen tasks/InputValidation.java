import java.util.Scanner;

public class InputValidation{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	int sum = 0;

	System.out.print("Enter a number: ");
	int firstNumber = scan.nextInt();

	 System.out.print("Enter a number: ");
	 int secondNumber = scan.nextInt();

	if (secondNumber <= firstNumber){
	  System.out.print("Retry, second number must be greater than first number");
	}else {for(int counter = firstNumber; counter < secondNumber; counter++){
	if(counter % 2 == 0){
	sum += counter; 
	}
	}
	System.out.print(sum);

     }
}
}