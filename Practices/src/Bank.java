import java.util.List;

public class Bank {

    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account accounts) {
        this.accounts.add(accounts);
    }
}
