import java.util.Scanner;

public class cryptography{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter message to be encrypted: ");
	String message = input.nextLine();

	System.out.print("Enter the key: ");
	int key = input.nextInt();

	String encrypted = "";
	
	for(int index = 0; index <= message.length(); index++){
	char temp = message.charAt(index);
	encrypted += (temp += key);
	}
	System.out.print(encrypted);

	}
}