 import java.util.Scanner;

public class CreditCardValidator {
	public static void main(String[] args) {

	}

	public static boolean validateCreditCard(int[] cardNumber) {

		int sum = 0;

		for (int i = 0; i < cardNumber.length; i++) {

			if (cardNumber[i] == 4) {
				System.out.print("Visa Cards");
			} else if (cardNumber[i] == 5) {
				System.out.print("Mastercard Cards");
			} else if (cardNumber[i] == 6) {
				System.out.print("Discover Cards");
			} else if (cardNumber[i] == 37) {
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

