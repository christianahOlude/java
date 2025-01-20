import java.util.Scanner;
public class Numbers{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int userNumber = input.nextInt();

		int largest = userNumber;
		int smallest = userNumber;
		int userResponse;

		do {
			System.out.print("Enter number: ");
			number = input.nextInt();

			if (number > largest){
				largest = userNumber;
			}

			if (number < smallest){

				smallest = userNumber;
			}

			System.out.print("Enter 0 to stop or any other number: ");
			userResponse = input.nextInt();

		} while (userResponse != 0);

		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);

	}
}