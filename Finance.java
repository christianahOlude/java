import java.util.Scanner;

public class futureInvestment {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

futureinvestment = 0;

	System.out.print("Enter the investment amount: ");
	float investmentamount= input.nextFloat();

	System.out.print("Enter annual interest in percentage: ");
	float annualinterest= input.nextFloat();

	System.out.print("Enter the number of years: ");
	int numberofyears  = input.nextInt();

	futureinvestment = investmentamount * (numberofyears + annualinterest);
	System.out.print(futureinvestment);



 }
}