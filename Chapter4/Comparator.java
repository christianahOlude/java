import java.util.Scanner;

public class Comparator{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	int sentinelValue = -1;	
	do{
	
	System.out.print("Enter a number: ");
	int numberOne = scan.nextInt();

	System.out.print("Enter a number: ");
	int numberTwo = scan.nextInt();

	if (numberOne == numberTwo){
	System.out.println("0");
	}
	
	else if (numberOne > numberTwo){
	System.out.println("1");
	}

	else
	System.out.println("-1");

	System.out.print("Enter a number or Enter -1 to end the program: ");
        sentinelValue = scan.nextInt();

	}while (sentinelValue != -1);


       }
}