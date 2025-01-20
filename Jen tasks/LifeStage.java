import java.util.Scanner;

public class LifeStage{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your age: ");
	int userage = scan.nextInt();

	if (userage < 12){
	System.out.print("Child");
	}
	else if (userage < 17){
	System.out.print("Teen");
	}
	else if (userage < 64){
	System.out.print("Adult");
	}
	else if (userage > 65){
	System.out.print("Senior");
	}



}
}