import java.util.Scanner;

public class FutureInvestment {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double futureinvestment;

	System.out.print("Enter the investment amount: ");
	double investmentamount= input.nextDouble();

	System.out.print("Enter annual interest in percentage: ");
	float annualinterest= input.nextFloat();

	System.out.print("Enter the number of years: ");
	float numberofyears  = input.nextFloat();

	futureinvestment = investmentamount * (1 + annualinterest);
 	System.out.print(futureinvestment);




 }
}