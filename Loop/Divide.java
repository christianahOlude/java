import java.util.Scanner;

public class Divide{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sentinelValue = -1;
		
		do{
			System.out.print("Enter a number: ");
			int userInput = input.nextInt();
			System.out.print("Enter a number: ");
			int userInput = input.nextInt();
			System.out.print("Enter a number: ");
			int userInput = input.nextInt();
			
			
			if (userInput % 5 == 0 && userInput % 11 == 0){
				System.out.print("number is divisible by 5 and 11\n");
			}
			else{
				System.out.print("number is not divisible by 5 and 11\n");
			}
                		System.out.print("Enter -1 to end the program or any number to continue");
		             sentinelValue = input.nextInt();
	

	    }while (sentinelValue != -1);	
		
    		 
	}
}

