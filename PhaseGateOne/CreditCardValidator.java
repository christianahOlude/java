 import java.util.Scanner;

public class CreditCardValidator {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter credit card number: ");
	String cardNumber = sc.nextLine();

	validateCreditCard();
	}

	public static boolean validateCreditCard(int [] cardNumbers) {

		int sum = 0;

		for (int i = 0; i < cardNumbers.length; i++) {

			if (cardNumbers[i] == 4) {
				System.out.print("Visa Cards");
			} else if (cardNumbers[i] == 5) {
				System.out.print("Mastercard Cards");
			} else if (cardNumbers[i] == 6) {
				System.out.print("Discover Cards");
			} else if (cardNumbers[i] == 37) {
				System.out.print("American Express Cards");
			}
		}
		return true;
	}
	public static boolean validateCreditCardLength(int[] cardNumber) {

		if (cardNumber.length < 13 && cardNumber.length > 16) {
			return false;
		} else {
			return true;
		}
	}
}

