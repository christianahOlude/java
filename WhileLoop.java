import java.util.Scanner;

public class WhileLoop{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
   
    int positiveNumber = 0;
    int negativeNumber = 0;
    int zeroNumber = 0;

      int number = 1;
    
    while (number <= 10){

    System.out.print("Enter a number: ");
    int userInput = input.nextInt();
    
     if (userInput <= 0){
       negativeNumber++;

      }
       else if (userInput == 0){
        zeroNumber++;
      
        }
         else{
            positiveNumber++;
        }
        
           number++;

        }

       System.out.println("Negative number is :" + negativeNumber);
       System.out.println("Positive number is :" + positiveNumber);
       System.out.println("Zero number is :" + zeroNumber);
      
    }
 }