package bank_package;
import java.util.ArrayList; 
import java.util.List;      
import java.util.Random;    
import java.util.Map;       
import java.util.HashMap;   

class Bank {
    public static void main(String[] args) {
        // Creating subcollections of bank accounts
        List<BankAccount> savingsAccounts = new ArrayList<>();
        List<BankAccount> checkingAccounts = new ArrayList<>();

        // Randomly create and add instances to collections
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            savingsAccounts.add(new SavingsAccount("SavingAcc-" + (i + 1), 1000 + rand.nextInt(10000)));
            checkingAccounts.add(new CheckingAccount("CheckingAcc-" + (i + 1), 1000 + rand.nextInt(10000)));
        }

        // Top-level collection containing subcollections
        Map<String, List<BankAccount>> bankCollections = new HashMap<>();
        bankCollections.put("SavingsAccounts", savingsAccounts);
        bankCollections.put("CheckingAccounts", checkingAccounts);

        // Output initial state of the collections
        printBankCollections(bankCollections);
    }

    // Print collections
    public static void printBankCollections(Map<String, List<BankAccount>> collections) {
        for (String name : collections.keySet()) {
            List<BankAccount> accounts = collections.get(name);
            double totalYearlyInterest = accounts.stream().mapToDouble(BankAccount::calculateYearlyInterest).sum();
            System.out.printf("\n%s - Total Yearly Interest: %.2f\n", name, totalYearlyInterest);
            for (BankAccount account : accounts) {
                System.out.println(account);
            }
        }
    }
}
