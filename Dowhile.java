import java.util.Scanner;

public class Dowhile{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
	int sentinelValue = -1;
   
      
	do {

      	System.out.print("Enter a number: ");
        int num1 = input.nextInt();

     	System.out.print("Enter a number: ");
       	int num2 = input.nextInt();
	
	int sum = num1 + num2;
        System.out.println(sum);

	System.out.println("Enter -1 to end the program or any number to continue");
	sentinelValue = input.nextInt();

	}while (sentinelValue != -1);

  }

}