interface AccountOperations {
    double checkBalance();
    void transfer(BankAccount toAccount, double amount) throws AccountOperationException;
    void deposit(double amount);
}
