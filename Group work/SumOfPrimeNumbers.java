import java.util.Scanner;

public class SumOfPrimeNumbers{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int numbers = input.nextInt();

	int primenumbers = 1;

	while(numbers > 100){
		if(numbers / 1 == 1){
		System.out.print(primenumbers);
		}
	}
	}
}


	