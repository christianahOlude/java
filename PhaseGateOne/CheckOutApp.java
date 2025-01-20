import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckOutApp{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Date date = new Date();

        String cashierName;
        String customerName;
        double VAT_RATE = 17.50 / 100;

        print("Customer name: ");
        customerName = input.nextLine();
        print("cashier name: ");
        cashierName = input.nextLine();

        List <String> itemsList = new ArrayList<>();
        double total = 0.0;

        while(true){

	    print("what do you want to buy: ");
            String items = input.nextLine();

            print("How many pcs: ");
            double pieces = input.nextDouble();

            print("price per piece: ");
            double price = input.nextDouble();

            double itemTotal = pieces * price;
            total += itemTotal;

            itemsList.add(String.format("\t%s\t%.2f\t%.2f\t%.2f",items, pieces, price, itemTotal));

            print("do u want to buy something else? (yes/no): ");
            String userInput = input.nextLine();
            if ( userInput.equalsIgnoreCase("yes"))  break;
            input.nextLine();
        }

        double discount = getDiscount(total);
        double vat = VAT_RATE * total;
        double billTotal = (total - discount) + vat;
        invoice(cashierName, customerName, date, itemsList, total, discount, vat, billTotal);
    }

    public static void print(String message){
        System.out.println(message);
    }
    private static double getDiscount(double total){
        Scanner input = new Scanner(System.in);
        print("enter discount: ");
        double discount = input.nextDouble();
        return total * (discount/100);
    }
    private static  void invoice(String cashierName, String customerName, Date date, List <String> itemList, double total, double discount, double vat, double billTotal){
        Scanner input = new Scanner(System.in);

        print("====================================");
        print("CHRISTY STORE\nMAIN BRANCH\nLOCATION: 312 SEMICOLON WAY.\nTEL: 000000");
        System.out.printf("CASHIER: %s%nCUSTOMER NAME: %s%nDATE: %s%n", cashierName, customerName, date);
        print("====================================");
        print("\tITEM\tQTY\tPRICE\tTOTAL(NGN)");

        for (String item : itemList){
            print(item);
        }
        print("-------------------------------------------");
        System.out.printf("SUBTOTAL: %.2f%n", total);
        System.out.printf("DISCOUNT: %.2f%n", discount);
        System.out.printf("VAT: %.2f%n", vat);
        print("-------------------------------------------");
        System.out.printf("BILL TOTAL %.2f%n", billTotal);
        print("============================================");
        System.out.printf("THIS IS NOT A RECEIPT %.2f%n", billTotal);

	print("How much did the customer give to you: ");
	String amountPaid = input.nextLine(); 
}
        private static  void receipt(String cashierName, String customerName, Date date, List <String> itemList, double total, double discount, double vat, double billTotal){

        print("====================================");
        print("CHRISTY STORE\nMAIN BRANCH\nLOCATION: 312 SEMICOLON WAY.\nTEL: 000000");
        System.out.printf("CASHIER: %s%nCUSTOMER NAME: %s%nDATE: %s%n", cashierName, customerName, date);
        print("====================================");
        print("\tITEM\tQTY\tPRICE\tTOTAL(NGN)");

        for (String item : itemList){
            print(item);
        }
        print("-------------------------------------------");
        System.out.printf("SUBTOTAL: %.2f%n", total);
        System.out.printf("DISCOUNT: %.2f%n", discount);
        System.out.printf("VAT: %.2f%n", vat);
        print("-------------------------------------------");
        System.out.printf("BILL TOTAL %.2f%n", billTotal);
	System.out.printf("AMOUNT PAID %.2f%n");
	System.out.printf("BALANCE %.2f");
        print("============================================");
		print("THANK YOU FOR YOUR PATRONAGE");
	print("============================================");
   }
}
