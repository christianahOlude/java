import java.util.Scanner;
import java.util.Date;

public class CheckOutApp1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	Date date = new Date();

	print("Customer's name: ");
	String name = input.next();

	print("What did the user buy: ");
	String item = input.next();

	print("How many pieces: ");
	int piece = input.nextInt();

	print("How much per unit: ");
	int unit = input.nextInt();

	print("Do you want to add more items : ");
	String add = input.next();
	
	print("What did the user buy: ");
	String item1 = input.next();

	print("How many pieces: ");
	String piece1 = input.next();

	print("How much per unit: ");
	int unit1 = input.nextInt();

	print("Do you want to add more items : ");
	String item2 = input.next();

	print("What is your name: ");
	String cashierName = input.next();

	print("How much discount will he got: ");
	int customerDiscount = input.nextInt();

	print("SEMICOLON STORES \n MAIN BRANCH \n LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS \n TEL: 03293828343\n date");

	}
public static void print(String word){
	System.out.print(word);
}
}