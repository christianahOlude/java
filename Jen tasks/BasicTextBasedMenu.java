import java.util.Scanner;

public class BasicTextBasedMenu{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Select a number 1). Add 2). View 3). Delete 4). Quit: ");
	int options = scan.nextInt();

	int sentinelvalue = -1;

	do{
	  if(options == 1){
		System.out.println("You choose the Menu");
	  }
	  if(options == 2){
		System.out.println("You choose to View");
	  }
	  if(options == 3){
		System.out.println("You choose to Delete");
	  }
	  if(options == 4){
		System.out.println("You choose to Quit");
	  }
	
	System.out.println("Enter -1 to stop or any number to continue");
	sentinelvalue = scan.nextInt();
	
	}while (sentinelvalue != -1);
		
}
}

	