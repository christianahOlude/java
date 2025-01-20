import java.util.Scanner;

public class MilesPerGallon{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

sentinelValue = -1;

System.out.print("Enter the gallons used: ");
int totalGallons = input.nextInt();

System.out.print("Enter the miles driven: ");
int totalMiles = input.nextInt();

int overallaveragemilesgallon = (totalMiles / totalGallons);
System.out.print("The overall average milesgallon was", overallaveragemlesgallon);

System.out.print("Enter -1 to stop or any number to continue");
System.out.print(sentinelValue);




}
}
