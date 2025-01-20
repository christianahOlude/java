import java.util.Scanner;

public class SelectedDepartment{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Select a number 1). IT 2). HR 3). Finance: ");
	int userselecteddepartment = scan.nextInt();

	System.out.print("Select a number 1). Manager 2). Analyst 3). Intern: ");
	int userselectedrole = scan.nextInt();
	
	switch (userselecteddepartment){
		

		case 1:
	 		   switch(userselectedrole){

	  	case 1 -> System.out.println("Manage tech");
	 		
		case 2 -> System.out.println("Analyse tech");

		case 3 -> System.out.println("Learn tech");
		}
			
	      
		case 2:
				switch(userselectedrole){

		case 1 -> System.out.println("Manage resources");
			
		case 2 -> System.out.println("Analyse resources");
			
		case 3 -> System.out.println("Intern resources");
			}


		case 3:
				switch(userselectedrole){

		case 1 -> System.out.println("Manage finance");
			
		case 2 -> System.out.println("Analyse finance");

		case 3 -> System.out.println("Intern in a finance company");
			}
		}	
    }
}

	