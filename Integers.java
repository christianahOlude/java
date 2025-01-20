import java.util.Scanner;
  
  public class Integers{
   public static void main(String[] args){

   Scanner input = new Scanner(System.in);

 	System.out.print("Enter a number");
  	 int userInput = input.nextInt();

	int enter = userInput % 10;
         
         int press = userInput % 100;
         
          int gross = press / 10;

           int result = userInput / 100;
      
   System.out.printf("%d, %d, %d,%d%n",enter, press,gross,result);
        
       int sum = result + gross + userInput;   
       System.out.print(result + gross + enter);      
         

  }

}