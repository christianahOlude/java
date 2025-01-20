import java.util.Scanner;

public class EvenNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int sentinelValue = -1;
		
		do{
			System.out.print("Enter a number: ");
			int number1 = input.nextInt();
			System.out.print("Enter a number: ");
			int number2 = input.nextInt();
			System.out.print("Enter a number: ");
			int number3 = input.nextInt();
			
			
			if (number1 % 2 == 0){
				System.out.print("number is even\n");
			}
			else{
				System.out.print("number is odd\n");
			}
                		
		System.out.print("Enter -1 to end the program or any number to continue");
		sentinelValue = input.nextInt();
	

	}while (sentinelValue != -1);
		

       }
}