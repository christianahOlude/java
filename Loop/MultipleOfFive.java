import java.util.Scanner;

public class MultipleOfFive{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int sentinelValue = -1;
		
		do{
			System.out.print("Enter a number: ");
			int numberOne = input.nextInt();
			System.out.print("Enter a number: ");
			int numberTwo = input.nextInt();
			System.out.print("Enter a number: ");
			int numberThree = input.nextInt();
			
			
			if (numberOne % 5 == 0 ){
				System.out.print("number is a multiple of 5");
			}
			else{
				System.out.print("number is not a multiple of 5");
			}
		
                		System.out.print("Enter -1 to end the program or any number to continue");
				sentinelValue = input.nextInt();
	

			}while (sentinelValue != -1);        
	}
}