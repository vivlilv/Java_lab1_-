package bank_package;


// SavingsAccount subclass that extends BankAccount
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = 0.04; // Assume a 4% interest rate
    }

    @Override
    public double calculateYearlyInterest() {
        return balance * interestRate;
    }

    // Individual method specific to SavingsAccount
    public double getSavingsBonus() {
        return balance * 0.02; // Additional 2% bonus for savings
    }

    @Override
    public String toString() {
        return super.toString() + " | Savings Bonus: " + getSavingsBonus();
    }
}
