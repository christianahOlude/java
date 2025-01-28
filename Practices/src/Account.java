public class Account {

    private String accountName;
    private int age;
    private int pin;
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, String accountName, int age, int pin){
        this.accountName = accountName;
        this.age = age;
        this.pin = pin;
        this.accountNumber = accountNumber;

    }
    public boolean balance(double balance){
        this.balance = balance;
        return true;
    }

    public void depositMoney(double amount) {
        balance += amount;
    }

    public void checkBalance(double balance) {
        if(balance < 0){
            System.out.println("You don't have enough money");
        }
        else{
            System.out.println("Your account balance is " + balance);
        }

    }

    public boolean checkPinIsCorrect(int pin) {
        return pin == this.pin;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
