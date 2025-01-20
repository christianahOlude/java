import java.util.Scanner;

public class IsPrimeNumber{
	public static void main(String[] args){
	int quotient = divide();
	System.out.print("The quotient is: "+quotient); 
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