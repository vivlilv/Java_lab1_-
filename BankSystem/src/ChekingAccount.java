package bank_package;

//also Subclass of my BankAccount superclass
class CheckingAccount extends BankAccount {
    private double interestRate = 0.03; // 3% interest rate
    private double overdraftLimit = 500; // Overdraft limit for checking accounts

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateYearlyInterest() {
        return balance * interestRate; // Yearly interest calculation
    }

    public double getOverdraftLimit() {
        return overdraftLimit; // Overdraft limit for checking accounts
    }

    @Override
    public String infoString() {
        return super.infoString() + String.format(", Yearly Interest: %.2f, Overdraft Limit: %.2f",
                calculateYearlyInterest(), getOverdraftLimit());
    }
}
