class Client extends User {
    private static int clientIdCounter = 1;
    private int clientId;
    private BankAccount account;

    public Client(String firstName, String lastName, BankAccount account) {
        super(firstName, lastName);
        this.clientId = clientIdCounter++;
        this.account = account;
    }

    public int getClientId() {
        return clientId;
    }

    public BankAccount getAccount() {
        return account;
    }
}
