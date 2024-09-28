package bank_package;

//My abstract superclass
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return this.getClass().getSimpleName(); // Returns the class name (e.g., "SavingsAccount")
    }

    public abstract double calculateYearlyInterest(); // Abstract method to be overridden

    public String infoString() {
        return String.format("Account Number: %s, Balance: %.2f", accountNumber, balance);
    }
}