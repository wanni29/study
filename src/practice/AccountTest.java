package practice;

class Account {
    private int regNumber;
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

    }
}
