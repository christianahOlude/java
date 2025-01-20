import java.util.Scanner;

  public class Information{
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);

    System.out.print("Enter your name");
     String enter = input.nextLine();

	System.out.print("Enter the price");
        double userinput = input.nextDouble();

     
     System.out.printf("Welcome the %s ---------------%n", enter );
    
 
       System.out.printf("Amount is %s%n ----------------", userinput );


}


}