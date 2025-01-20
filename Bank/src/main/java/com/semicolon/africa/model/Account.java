package main.java.com.semicolon.africa.model;

import main.java.com.semicolon.africa.exception.MyExceptionClass;

public class Account implements AccountInterface{

    private String accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int pin;

    public Account(double balance, String firstName, String lastName, String phoneNumber, int pin) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public double checkAccountBalance() {
        return balance;
    }

    public void checkAccountNumberLength(String accountNumber) {
        if(accountNumber.length() != 10) {
            System.out.println("Invalid account number");
        }
    }

    public void checkPhoneNumberLength(String phoneNumber) {
        if(phoneNumber.length() != 11) {
            throw new MyExceptionClass("Invalid phone number");
        }
    }

    public void checkPinLength(int pin) {
        if(pin != 4) {
            throw new MyExceptionClass("Invalid pin");
        }
    }

    @Override
    public void deposit(double amount) {

        if(amount < 0 ){
            throw new MyExceptionClass("Invalid deposit amount");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 0 || amount > balance){
            throw new MyExceptionClass("Invalid withdraw amount");
        }
        balance -= amount;
    }

    @Override
    public void transfer(double amount, Account destination) {
        if(amount < 0 || amount > balance){
            throw new MyExceptionClass("Invalid withdraw amount");
        }

    }



}
