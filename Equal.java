import java.util.Scanner;

public class Equal{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
int num2 = input.nextInt();

System.out.print("Enter a number: ");
int num3 = input.nextInt();

int sentinelValue = -1;

if (num1 == num2){
	System.out.print("numbers are equal");
}else if
	(num1 == num3){
	System.out.print("numbers are equal");
}else if
	(num1 != num2){
	System.out.print("numbers are not equal");
}else if
	(num1 != num3){
	System.out.print("numbers are not equal");
	}
System.out.print("enter -1 to stop or any number to continue");
      sentinelValue = input.nextInt();

   
}



}