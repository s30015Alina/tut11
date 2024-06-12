class Transaction {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public Transaction(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public BankAccount getFromAccount() {
        return fromAccount;
    }

    public BankAccount getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", amount=" + amount +
                '}';
    }
}
