import java.util.*;
class BankAccount implements AccountOperations {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Amount to transfer should be positive");
        }
        if (this.balance < amount) {
            throw new AccountOperationException("Insufficient funds");
        }
        this.balance -= amount;
        toAccount.deposit(amount);
        Transaction transaction = new Transaction(this, toAccount, amount);
        this.transactions.add(transaction);
        toAccount.addTransaction(transaction);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount to deposit should be positive");
        }
        this.balance += amount;
        Transaction transaction = new Transaction(null, this, amount);
        this.transactions.add(transaction);
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }
}
