import java.util.Scanner;

public class Order{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

     int sentinelValue = -2;
     
       do{

	System.out.print("Enter a number: ");
	int numOne = input.nextInt();

	System.out.print("Enter a number: ");
	int numTwo = input.nextInt();

	System.out.print("Enter a number: ");
	int numThree = input.nextInt();

		if (numThree > numTwo && numTwo > numOne){
 			System.out.print("the numbers are in increasing order");
		}else{
    			System.out.print("the numbers are in decreasing order");
		}
		System.out.print("Enter -2 to end the program or any number to continue");
		sentinelValue = input.nextInt();
	

	}while (sentinelValue != -2);


}




}