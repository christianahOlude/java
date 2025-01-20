import java.util.Scanner;

public class SumWithoutThePlusSign{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	System.out.print("Enter a number: ");
	int num2 = input.nextInt();


	System.out.println(addNumbers(num1, num2));
	}

	public static int addNumbers(int num1, int num2){
                 return num1 - -(num2);
		
	}

	
}