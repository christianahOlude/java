import java.util.Scanner;

public class Shapes{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Enter first length: ");
		int firstLength = input.nextInt();

		System.out.print("Enter second length: ");
		int secondLength = input.nextInt();

		System.out.print("Enter third length: ");
		int thirdLength = input.nextInt();

		if(firstLength == secondLength && secondLength == thirdLength){
		System.out.print("Equilateral Triangle");
		}
	
		if(firstLength == secondLength && firstLength != thirdLength){
		System.out.print("Isosceles Triangle");
		}
		
		if(firstLength != secondLength && secondLength != thirdLength){
		System.out.print("Isosceles Triangle");
		}



}
}