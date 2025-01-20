import java.util.Scanner;

  public class Bmi{
   public static void main(String[] args){

	Scanner input = new Scanner(System.in);
           
            double weightInKilogram = 0;
	    double heightInMeters = 0;

	System.out.print("Enter a number: ");
        double weight = input.nextDouble();

	System.out.print("Enter a number: ");
	double height = input.nextDouble();
	
	weightInKilogram = weight * 0.45359237;
	
	heightInMeters = height * 0.0254;
	
	bmi = weightInKilogram / (heightInMeters * heightInMeters);
	System.out.print(bmi);
        
        
	}
}