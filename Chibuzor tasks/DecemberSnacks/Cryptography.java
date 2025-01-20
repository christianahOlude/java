import java.util.Scanner;

public class Cryptography {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter message to be encrypted: ");
		String message = input.nextLine();

		System.out.print("Enter the key: ");
		int key = input.nextInt();

		String encrypted = encrypteWords(message, key);
		System.out.println("Encrypted words: " + encrypted);
		decrypteWords(encrypted, key);
	}

	public static String encrypteWords(String message, int key) {

		String encrypted = "";

		for (int index = 0; index < message.length(); index++) {
			char temp = message.charAt(index);
			temp += key;
			encrypted += temp;
		}
		return encrypted;

	}

	public static void decrypteWords(String encrypted, int key) {
		String decrypted = "";

		for (int index = 0; index < encrypted.length(); index++) {
			char temp = encrypted.charAt(index);
			temp -= key;
			decrypted += temp;
		}

		System.out.print(decrypted);

	}
}