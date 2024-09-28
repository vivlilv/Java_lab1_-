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
        return this.getClass().getSimpleName(); // Returns the class name (for instance - "SavingsAccount")
    }

    public abstract double calculateYearlyInterest(); //this method will be overriden in child classes

    public String infoString() {
        return String.format("Account Number: %s, Balance: %.2f", accountNumber, balance);
    }
}