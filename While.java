import java.util.Scanner;

public class While{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int sentinelValue = -1;
	int number = 0;
	do {

      	System.out.print("Enter a number or (Enter -1 to end the program): ");
        number = input.nextInt();
	
	if (number > 0) {
		System.out.println("Number is positive");
	}else if(number < 0){
		System.out.println("Number is negative");
	} else {
		System.out.println("Number is zero");
	}


	}while (number != sentinelValue);

  }

}