import java.util.Scanner;

 public class Palindrome{    
   public static void main(String[] args){

  Scanner input = new Scanner(System.in);

   System.out.print("Enter a three digit number: ");
  int userInput = input.nextInt();

  int number1= userInput % 10;
 
  int number2 = userInput % 100;

  int number3 = number2 / 10;

  int number4 = number1 / 100;

  if (number1 == number2) {
   System.out.print("number is a palindrome");
       }else {
    System.out.print("number is not a palindrome");
}
    }
 }