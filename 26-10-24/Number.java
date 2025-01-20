import java.util.Random;
import java.util.Scanner;

public class Number{
public static void main(String[] args){

Random random = new Random();
Scanner input = new Scanner(System.in);

int number = random.nextInt(1, 20);

int userInput = 0;

while (userInput != number){
	System.out.print("Enter a number: ");
	 userInput = input.nextInt();

	if (userInput > number){
		System.out.println("Too high, try again.");
	}

  else if (userInput < number){
		System.out.println("Too low,try again.");
  }
	else{
		System.out.print("Correct");
}

	


  } 
    


   }
 }