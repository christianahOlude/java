import java.util.Scanner;

public class AnnualIncome{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your annual income: ");
	int taxbracket = scan.nextInt();
	

	if(taxbracket < 9875){
	System.out.print("10");
	}
	else if (taxbracket < 40125){
	System.out.print("12");
	}
	else if (taxbracket < 85525){
	System.out.print("22");
	}
	else if (taxbracket > 85526){
	System.out.print("24");
	}
}
}