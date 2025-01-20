import java.util.Scanner;

public class EligibleAge{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your age: ");
	int userage = scan.nextInt();

	if (userage > 18){
	System.out.print("vote");
	}
	else if (userage > 16){
	System.out.print("drive");
	}
	else if (userage > 21){
	System.out.print("drink");
	}
}
}