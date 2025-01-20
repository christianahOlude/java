import java.util.Scanner;

public class IceCreamMenu{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Select a number 1). Ice cream 2). Sundae 3). Shake: ");
	int dessert = scan.nextInt();

	System.out.print("Select a number 1). Chocolate 2). Vanilla 3). Strawberry: ");
	int flavor = scan.nextInt();
	
	switch (dessert){


		case 1:
	 		   switch(flavor){

	  	case 1 -> System.out.println("You choose ice cream with chocolate");
	 		
		case 2 -> System.out.println("you choose ice cream with vanilla");

		case 3 -> System.out.println("You choose ice cream with strawberry");
		}
			
	      
		case 2:
				switch(flavor){

		case 1 -> System.out.println("You choose sundae with chocolate");
			
		case 2 -> System.out.println("You choose sundae with vanilla");
			
		case 3 -> System.out.println("You choose sundae with strawberry");
		}
			
			


		case 3:
				switch(flavor){

		case 1 -> System.out.println("You choose shake with chocolate flavor");
			
		case 2 -> System.out.println("You choose shake with vanilla flavor");

		case 3 -> System.out.println("you choose shake with strawberry");
		}
			
			
		}	
}
}
    