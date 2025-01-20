package main.java.com.semicolon.africa.model;

public interface AccountInterface {

    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount, Account destination);
}
