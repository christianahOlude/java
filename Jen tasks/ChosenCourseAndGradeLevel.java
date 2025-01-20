import java.util.Scanner;

public class ChosenCourseAndGradeLevel{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Select a number 1). Math 2). Science 3). History: ");
	int chosencourse = scan.nextInt();

	System.out.print("Select a number 1). Freshman 2). Sophomore 3). junior 4). Senior: ");
	int gradelevel = scan.nextInt();
	
	switch (chosencourse){


		case 1:
	 		   switch(gradelevel){

	  	case 1 -> System.out.println("Instructor mathematics");
	 		
		case 2 -> System.out.println("Instructor maths");

		case 3 -> System.out.println("Instructor math");

		case 4 -> System.out.println("Instructor mathes");
		}
			
	      
		case 2:
				switch(gradelevel){

		case 1 -> System.out.println("Instructor sciences");
			
		case 2 -> System.out.println("Instructor science");
			
		case 3 -> System.out.println("Instructor scien");

		case 4 -> System.out.println("Instructor sci");
		}
			
			


		case 3:
				switch(gradelevel){

		case 1 -> System.out.println("Instructor history");
			
		case 2 -> System.out.println("Instructor host");

		case 3 -> System.out.println("Instructor hist");

		case 4 -> System.out.println("Instructor his");
		}
			
			
		}	
    
	
		



      }	
    }