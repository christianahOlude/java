import java.util.Scanner;

public class NumberValues{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("enter a number: ");
int first = input.nextInt();
System.out.print("enter a number: ");
int second = input.nextInt();

double result = first ** second;

System.out.print(result);



 }
}