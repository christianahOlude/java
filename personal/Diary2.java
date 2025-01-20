import java.util.Scanner;

public class Diary2{
	
public static void main(String[] args){
	mainMenu();
	}

public static void mainMenu(){
	Scanner input = new Scanner(System.in);
	String options = """
	dear user, do you want to >>>>
	1. Create Diary
	2. Lock Diary
	3. Unlock Diary
	0. Exit
	""";
	print(options);
	int answer = input.nextInt();

	/**switch(answer){
	case 1 -> createDiary();
		}**/
	}

public static void print(String enter){
	System.out.println(enter);
}
}