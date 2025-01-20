import main.java.com.semicolon.africa.exception.MyExceptionClass;
import main.java.com.semicolon.africa.model.Account;
import main.java.com.semicolon.africa.model.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account = new Account(100000.00, "Ayomide", "Christiana", "0918170973", 1234);

    @Test
    public void testThatAccountCanBeCreated(){
        Bank bank = new Bank(account);
        System.out.println(bank.getAccountList());
        assertNotNull(bank.getAccountList());
    }

    @Test
    public void testThatMoneyIsInOurAcccountBalance(){
        Bank bank = new Bank(account);
        assertEquals(100000.00, bank.getBalance());
    }

    @Test
    public void testThatClientCanDeposit(){
        account.deposit(5000.00);
        assertEquals(105000.00,account.getBalance());
    }

    @Test
    public void testThatClientCanWithdraw(){
        account.deposit(5000.00);
        account.withdraw(10000.00);
        assertEquals(95000, account.getBalance());
    }

    @Test
    public void testNegativeValue(){
        assertThrows(MyExceptionClass.class, () -> account.deposit(-5000.00));
        assertThrows(MyExceptionClass.class, () -> account.withdraw(-5000.00));
    }

    @Test
    public void testThatPhoneNumberIs11(){
        assertThrows(MyExceptionClass.class, () -> account.checkPhoneNumberLength("1234543245587654"));
        assertThrows(MyExceptionClass.class, () -> account.checkPhoneNumberLength("12345"));

    }

    @Test
    public void testPinLength(){
        assertThrows(MyExceptionClass.class, () -> account.checkPinLength("12344"))

    }

}
