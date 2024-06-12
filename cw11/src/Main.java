
public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Admin", "One");


            Employee emp1 = admin.addEmployee("Employee", "One");
            Employee emp2 = admin.addEmployee("Employee", "Two");

            BankAccount acc1 = new BankAccount();
            BankAccount acc2 = new BankAccount();
            BankAccount acc3 = new BankAccount();
            BankAccount acc4 = new BankAccount();

            Client client1 = emp1.addClient("Client", "One", acc1);
            Client client2 = emp1.addClient("Client", "Two", acc2);
            Client client3 = emp2.addClient("Client", "Three", acc3);
            Client client4 = emp2.addClient("Client", "Four", acc4);

            // 4. Wpłać pieniądze na te konta
            emp1.depositToAccount(acc1, 1000);
            emp1.depositToAccount(acc2, 2000);
            emp2.depositToAccount(acc3, 3000);
            emp2.depositToAccount(acc4, 4000);
            acc1.transfer(acc2, 200);
            printBalances(acc1, acc2, acc3, acc4);

            acc2.transfer(acc3, 500);
            printBalances(acc1, acc2, acc3, acc4);

            acc3.transfer(acc4, 1000);
            printBalances(acc1, acc2, acc3, acc4);

            acc4.transfer(acc1, 1500);
            printBalances(acc1, acc2, acc3, acc4);

            acc1.transfer(acc3, 300);
            printBalances(acc1, acc2, acc3, acc4);

            acc2.transfer(acc4, 400);
            printBalances(acc1, acc2, acc3, acc4);

            acc3.transfer(acc1, 500);
            printBalances(acc1, acc2, acc3, acc4);

            acc4.transfer(acc2, 600);
            printBalances(acc1, acc2, acc3, acc4);

            acc1.transfer(acc4, 700);
            printBalances(acc1, acc2, acc3, acc4);

            acc2.transfer(acc3, 800);
            printBalances(acc1, acc2, acc3, acc4);

        } catch (AccountOperationException e) {
            e.printStackTrace();
        }
    }

    private static void printBalances(BankAccount... accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Balance: " + account.checkBalance());
        }
        System.out.println();
    }
}