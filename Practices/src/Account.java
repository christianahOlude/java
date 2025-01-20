public class Account {
    private String name; // instance variable
    private double balance;

    // Account constructor that receives two parameter
    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // instance variable balance keeps its default initial value of 0.0
    public void setName(String name) {
        this.name = name; // store the name
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

}

        // method to retrieve the name from the object 
        //public String getName() {
           // return name; // return value of name to caller
       // }
//}
