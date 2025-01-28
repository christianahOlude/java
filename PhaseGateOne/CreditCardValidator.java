 import java.util.Scanner;

public class CreditCardValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter credit card number: ");
		String cardNumber = sc.nextLine();

		//validateCreditCard();
	}

	public static boolean validateCreditCard(int[] cardNumbers) {

		int sum = 0;

		for (int cardNumber : cardNumbers) {

			if (cardNumber == 4) {
				System.out.print("Visa Cards");
			} else if (cardNumber == 5) {
				System.out.print("Mastercard Cards");
			} else if (cardNumber == 6) {
				System.out.print("Discover Cards");
			} else if (cardNumber == 37) {
				System.out.print("American Express Cards");
			}
		}
		return true;
	}

	public static boolean validateCreditCardLength(int[] cardNumber) {

		return true;
	}
}

