public class Account {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String accountNumber;

    public Account(String firstName, String lastName, String dateOfBirth, String phoneNumber, String accountNumber) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void getFirstName(String name) {
        this.firstName = name;
    }
    public void getLastName(String name) {
        this.lastName = name;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
