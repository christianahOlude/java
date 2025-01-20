import java.util.Scanner;

public class Kata{
	public static void main(String... args){
	int result = minus();
	System.out.println("The result for subtraction is: "+result);
	
	int quotient = divide();
	System.out.println("The quotient is: "+quotient); 

}

public static int minus(){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter a number: ");
	int numberTwo = input.nextInt();

	int result = numberOne - numberTwo;
		return result;
		}

public static int divide(){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter a number: ");
	int numberTwo = input.nextInt();

	if(numberTwo == 0){
	return 0;
	}
	
	int quotient = numberOne / numberTwo;
	 return quotient;

	}

} 