import java.util.Scanner;

public class Greet{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Can i greet,please choose an option \n1: English \n2: Yoruba \n3: Igbo");

        int answer = input.nextInt();


	switch (answer){
	
	case 1: 
	System.out.print("\n1: morning \n2: afternoon \n3: night");
        int english = input.nextInt();
	
	switch (english){
	
	case 1:
	  System.out.print("good morning");
	break;

	case 2:
	   System.out.print("good afternoon");
	break;

	case 3:
	  System.out.print("good night");
         break;
         }
	 break;

	
	case 2:
	System.out.print("\n1: aro \n2: osan \n3: ale");
	int yoruba = input.nextInt();

	switch (yoruba){

	case 1:
	  System.out.print("ekaaro"); 
	break;

	case 2:
	 System.out.print("ekaasan");
	break;

	case 3:
	 System.out.print("ekaale");
	break;
	}
        break;

	
	
	case 3:
	System.out.print("\n1: otutu \n2: ehihe \n3: abile");
	int igbo = input.nextInt();

	switch (igbo){

	case 1:
	 System.out.print("otutu oma");
	break;

	case 2:
	System.out.print("ehihe oma");
	break;

	case 3:
	System.out.print("abile oma");
	break;
	  }
        }
      }
   }
