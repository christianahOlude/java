import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	System.out.print("Enter a number: ");
	int num2 = input.nextInt();

	System.out.print("Enter a number: ");
	int num3 = input.nextInt();

	System.out.print("Enter a number: ");
	int num4 = input.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("The maximum number is: " + max);
    }
}