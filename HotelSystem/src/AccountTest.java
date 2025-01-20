import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.println(myAccount);

        System.out.println("Enter the name: ");
        String theName = sc.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.println(myAccount.getName());
    }
}
