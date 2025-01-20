import java.util.Scanner;

public class Grades{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	
	int stop = -1;
	int counter = 0;
	
	while (counter < 5){

	System.out.print("Enter a grade");
	int grade = scan.nextInt();

	
	if (grade < 50){
	System.out.print("D");
	}else if   (grade >= 50 && grade <= 60){
	System.out.print("C");
	}else if  (grade > 60 && grade <= 80){
	System.out.print("B");
	}else if (grade < 80 && grade <= 100){
	System.out.print("A");
	}
	}
	System.out.print("Enter -1 to stop or any number to continue");
	stop = scan.nextInt();
	
	System.out.print(grade);
	int grades = scan.nextInt();
	switch(grades){
	case 50 -> System.out.print("C"); 
	case 70 -> System.out.print("B");
	case 100 -> System.out.print("A");
	case 1 -> System.out.print("well done");
}



}
}