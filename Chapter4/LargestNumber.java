import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 10;

	while (counter == 10){
	System.out.print("Enter a number");
	int number = input.nextInt();

	if (number > counter){
	System.out.print("Largest");
	}
	counter++;
	}




}
}