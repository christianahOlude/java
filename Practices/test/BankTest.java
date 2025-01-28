import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank = new Bank("First Bank");

//    @BeforeEach
//    void setUp() {
//        bank = new Bank("First Bank");
//        bank.createAnAccount("Christi", 25, 1234);
//    }

    @Test
    public void testThatAnAccountIsCreated() {
        Account account = new Account(1000000001, "Christi", 25, 1234);
        bank.createAnAccount("Christi", 25, 1234);
        assertNotNull(account, "Account created");
    }

    @Test
    public void testThatMoneyIsDeposited() {
        Bank bank = new Bank("First Bank");
        Account account = new Account(1000000001, "Christi", 25, 1234);
        account.depositMoney(1000.00);
        assertNotNull(account, "Deposit successful");
    }

    @Test
    public void testThatMoneyIsInTheAccount() {
        Account account = new Account(1000000001, "Christi", 25, 1234);
        account.depositMoney(1000.00);
        account.checkBalance(1000.00);
        assertTrue(account.balance(1000.00));

    }

    @Test
    public void testThatPinIsInCorrect() {
        Account account = new Account(1000000001, "Christi", 25, 1234);
        account.checkPinIsCorrect(2345);
        assertFalse(account.checkPinIsCorrect(2345));
    }

    @Test
    public void testThatPinIsCorrect() {
        Account account = new Account(1000000001, "Christi", 25, 1234);
        account.checkPinIsCorrect(1234);
        assertTrue(account.checkPinIsCorrect(1234));
    }

    @Test
    public void testThatWithdrawsMoney(){
        Account account = new Account(1000000001, "Christi", 25, 1234);
        account.depositMoney(1000.00);
        account.checkBalance(1000.00);
        account.withdrawMoney(200.00);
        assertTrue(account.balance(800.00));
    }

    @Test
    public void testThatFindAccount(){
        Bank bank = new Bank("First Bank");
        bank.createAnAccount("Christi", 25, 1234);
        long foundAccount = 100000000;
        Account account = bank.findAccount(foundAccount);
        assertNotNull(account, "Account found");
    }


}