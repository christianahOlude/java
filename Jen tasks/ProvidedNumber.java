import java.util.Scanner;

public class ProvidedNumber{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int userprovidednumber = scan.nextInt();
	
	switch (userprovidednumber){

	case 1:
	 if(userprovidednumber == 1){
	 System.out.print("Monday");
	}
	case 2:
	 if(userprovidednumber == 2){
	System.out.print("Tuesday");
	}
	case 3:
	 if(userprovidednumber == 3){
	System.out.print("Wednesday");
	}
	case 4:
	 if(userprovidednumber == 4){
	 System.out.print("Thursday");
	}
	case 5:
	 if(userprovidednumber == 5){
	System.out.print("Friday");
	}
	case 6:
	 if(userprovidednumber == 6){
	System.out.print("Saturday");
	}
	case 7:
	 if(userprovidednumber == 7){
	System.out.print("Sunday");
	}

	}

}

}
