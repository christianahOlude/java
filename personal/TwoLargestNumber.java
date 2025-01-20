import java.util.Scanner;

public class TwoLargestNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int number = 0;
	int largest;

	for(number = 0; number <= 10;number++){
		System.out.print("Enter number: ");	
		number = input.nextInt();
		}
	if(number > 0) System.out.print(largest);	

	}
}