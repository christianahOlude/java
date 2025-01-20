import javax.xml.namespace.QName;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("Christy",50.00 );

        System.out.printf("%s balance: $ %n", myAccount.getName());

        System.out.println();
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        Account account = new Account("Christy",50.00);
        Bank bank = new Bank();
        bank.setAccounts(account);
    }
}
