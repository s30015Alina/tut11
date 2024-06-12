class Employee extends User {
    private static int employeeIdCounter = 1;
    private int employeeId;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = employeeIdCounter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Client addClient(String firstName, String lastName, BankAccount account) {
        return new Client(firstName, lastName, account);
    }

    public void depositToAccount(BankAccount account, double amount) {
        account.deposit(amount);
    }
}
