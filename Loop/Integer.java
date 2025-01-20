import java.util.Scanner;

public class Integer{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sentinelValue = -2;
	
		
			do{
			System.out.print("Enter a number: ");
			int numberOne = input.nextInt();
			System.out.print("Enter a number: ");
			int numberTwo = input.nextInt();
			System.out.print("Enter a number: ");
			int numberThree = input.nextInt();
			
			
			if (number1 % 5 == 0 && number1 % 11 == 0){
				System.out.print("number is divisible by 5 and 11\n");
			}
			else{
				System.out.print("number is not divisible by 5 and 11\n");
			     }
				
		System.out.print("Enter -2 to end the program or any number to continue");
		sentinelValue = input.nextInt();
	

	}while (sentinelValue != -2);
	
		
	}
}