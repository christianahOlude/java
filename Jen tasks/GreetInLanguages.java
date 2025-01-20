import java.util.Scanner;

public class GreetInLanguages{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Can i greet,please choose an option \n1: English \n2: Yoruba \n3: Igbo");

        int answer = input.nextInt();

	switch (answer){
	
	case 1: 
	System.out.print("How are you");
	break;

	case 2:
	System.out.print("Bawo ni");
	break;

	case 3:
	System.out.print("kedu");
	break;


	}
    }
}