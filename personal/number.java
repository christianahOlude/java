import java.util.Scanner;

public class Number{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int [] arr = new int[5];

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for(number = arr.length; number > 0; number--){
		System.out.print(number);
		}
	}
}