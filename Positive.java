import java.util.Scanner;

public class Number{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

do{

System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
int num2 = input.nextInt();

System.out.print("Enter a number: ");
int num3 = input.nextInt();

int sentinelValue = -1;

if (number1 < 0){
System.out.print("number is negative");
}
else if (number2 > 0){
System.out.print("number is positive");
}
else if (number3 == 0){
System.out.print("number is zero");
}
System.out.printf("%d%n,%d%n,%d, is negative,is positive,is zero");

System.out.println("Enter -1 to end the program or any number to continue");
	sentinelValue = input.nextInt();

	}while (sentinelValue != -1); 
}
}

