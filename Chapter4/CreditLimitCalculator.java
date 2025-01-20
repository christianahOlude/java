import java.util.Scanner;

public class CreditLimitCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter customer's account number: ");
	int accountnumber = input.nextInt();

	System.out.print("Enter beginning balance: ");
	int beginningbalance = input.nextInt();
	
	System.out.print("Enter charges: ");
	int charges = input.nextInt();

	System.out.print("Enter credits: ");
	int credits = input.nextInt();

	System.out.print("Enter allowed credit limit: ");
	int creditlimit = input.nextInt();

	int newbalance = beginningbalance + (charges - credits);
	System.out.println("The new balance is: " + newbalance);

	if (newbalance > creditlimit){
	System.out.print("Credit limit exceeded");
	}
	
}
}