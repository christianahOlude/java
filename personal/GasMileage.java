import java.util.Scanner;

public class GasMileage{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	boolean stop = true;

	while(stop){ 			
	System.out.print("Enter the miles driven: ");
	double milesDriven = input.nextDouble();

	System.out.print("Enter the gallon used: ");
	double gallonsUsed = input.nextDouble();

	double milesPerGallon = milesDriven / gallonsUsed;
	System.out.println(milesPerGallon);

	System.out.println("Do you want to stop, enter -1 to stop and any number to continue: ");
	int userInput = input.nextInt();
		if(userInput == -1){ 
			stop = false;
			}
	}
	}
}