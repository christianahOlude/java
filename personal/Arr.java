import java.util.Scanner;

public class Arr{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int[] numbers = new int[number];

	for(int num = number;num > 0; num--){
		System.out.print(num);
		}
	}
}