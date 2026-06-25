package accountbank;

public class TestAccount {

    public static void main(String[] args) {

        Accounts ac = new Accounts(50000);

        System.out.println(ac);

        try {
            ac.withdraw(60001); // exceeds balance + overdraft
        }
        catch (BalanceException e) {
            e.printStackTrace();

            System.out.println(e);

            System.out.println(e.getMessage());
        }

        
    }
}