import java.util.Scanner;

public class IsEven{
	public static void main(String... args){
	
       evenOrOdd();

	}

public static void evenOrOdd(){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

		if(number % 2 == 0){
		System.out.print(true);
		}	
		else{
		System.out.print(false);
		}
	}


}