import java.util.Scanner;

public class Loop{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number");
	int num1 = input.nextInt();
	
	for (int p = 0; p <= 5; p++){
	if (p == 3){
	 continue;
}

	System.out.print(p);
}







}

}