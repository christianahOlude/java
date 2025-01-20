package main.java.com.semicolon.africa.model;
import java.util.ArrayList;
import java.util.List;


public class Bank {

    private List<Account> accountList = new ArrayList<Account>();

    public Bank(Account account) {
        this.accountList.add(account);
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public double getBalance() {
        double balance = 0;
        for(Account account : accountList) {
           balance = account.getBalance();
        }
        return balance;
    }
}
