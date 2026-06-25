package accountbank;

public class Accounts {

    private double balance;
    private double overdraft;

    public Accounts() {
        overdraft = 10000;
    }

    public Accounts(double balance) {
        this.balance = balance;
        this.overdraft = 10000;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) throws BalanceException {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (amount <= balance + overdraft) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            throw new BalanceException(
                    "Insufficient funds. Overdraft limit exceeded.");
        }
    }

    @Override
    public String toString() {
        return "Accounts [balance=" + balance +
                ", overdraft=" + overdraft + "]";
    }
}