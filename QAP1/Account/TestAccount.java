package QAP1.Account;

public class TestAccount {
    public static void main(String[] args) {
        // create the two accounts

        Account acc1 = new Account("A100", "Joe", 5000);
        Account acc2 = new Account("A101", "Mary", 4000);

        // Displaying both balances by using getBalance() method.
        System.out.println();
        System.out.println("Initial Balances: ");
        System.out.println("Acc1 balance: " + acc1.getBalance());
        System.out.println("Acc2 balance: " + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display balance from both accounts again
        System.out.println();
        System.out.println("Balance after transfer: ");
        System.out.println("Acc1 balance: " + acc1.getBalance());
        System.out.println("Acc2 balance: " + acc2.getBalance());
    }
}
