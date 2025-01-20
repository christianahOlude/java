import java.util.Scanner;

 public class Sum{
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);
    
	int sum = 0;

     System.out.print("Enter the first number");
       int number1 = input.nextInt();
     
       System.out.print("Enter the second number");
        int number2 = input.nextInt();
      
         sum = number1 + number2; 

          System.out.print(sum); 




}


}