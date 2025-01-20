import java.util.Scanner;

public class TemperatureRange{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter temperature in celsius: ");
	int temperature = scan.nextInt();

	if (temperature < 10){
	System.out.print("cold");
	}
	else if (temperature <= 25){
	System.out.print("warm");
	}
	else if (temperature > 25){
	System.out.print("hot");
	}
	
    }
}