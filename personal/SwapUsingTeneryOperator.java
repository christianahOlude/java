import java.util.Scanner;

public class SwapUsingTernary {
 public static void main(String[] args){
 
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	System.out.print("Enter a number: ");
	int num2 = input.nextInt();

	System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
	num1 = (num1 != num2) ? (num1 + num2) - (num2 = num1) : num1; 

	System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2); 
} 
}