import java.util.Scanner;

  public class Energy{
     public static void main(String[] args){

 	Scanner input = new Scanner(System.in);
        
          Double energy;

 	System.out.print("Enter  a number in kg: ");
 	  double num1 = input.nextDouble();

   	System.out.print("Enter  a number: ");
  	 double initialTemperature = input.nextDouble();

  	System.out.print("Enter  a number : ");
 	  double finalTemperature = input.nextDouble();

   	energy = num1*(finalTemperature - initialTemperature)*4184;

         System.out.printf("The energy needed is: ",energy);
  
         System.out.print(energy);
          
  


  }
}