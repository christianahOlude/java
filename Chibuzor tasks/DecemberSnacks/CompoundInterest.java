import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter initialInvestment: ");
        double initialInvestment = input.nextDouble();

        System.out.println("Enter monthly contribution: ");
        double monthlyContribution = input.nextDouble();

        System.out.println("Enter years: ");
        int years = input.nextInt();

        System.out.println("Enter estimated interest rate: ");
        double estimatedInterestRate = input.nextDouble();
        estimatedInterestRate = estimatedInterestRate / 100;

        System.out.println("Enter compound frequency: ");
        double compoundFrequency = input.nextDouble();

        double compoundInterest = getCompoundInterest(initialInvestment, monthlyContribution, years, estimatedInterestRate, compoundFrequency);
        System.out.println("Compound Interest is: " + compoundInterest);
    }

        public static double getCompoundInterest(double initialInvestment, double monthlyContribution, int years, double estimatedInterestRate, double compoundFrequency) {
            double compoundInterest = initialInvestment * Math.pow((1 + estimatedInterestRate / compoundFrequency), (compoundFrequency / years)) + monthlyContribution * (((Math.pow((1 + estimatedInterestRate / compoundFrequency), (compoundFrequency * years)) - 1) / (estimatedInterestRate / compoundFrequency)));
            return compoundInterest;
        }



}
