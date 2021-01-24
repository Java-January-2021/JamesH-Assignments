import java.util.Random;
public class BankAccount {
    private String accountNumber;
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private static int accounts = 0;
    private static double totalMoney = 0;
    public BankAccount() {
        this.accountNumber = createAccountNum();
        System.out.println("New account: " + this.accountNumber);
        accounts++;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public static int totalNumOfAccounts() {
        return accounts;
    }
    public static double totalMoneyOfAccounts() {
        return totalMoney;
    }
    private String createAccountNum() {
		String randomNum = "";
		Random rand = new Random();
		for(int i = 0; i<10; i++) {
			randomNum += rand.nextInt(10);
		}
        return randomNum;
    }
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public void deposit(double amount, String account) {
        if(account.equals("checking")) {
        this.checkingBalance += amount;
        System.out.println("New checking ballance: " + getCheckingBalance());
        }
        else if(account.equals("savings")) {
            this.savingsBalance += amount;
            System.out.println("New savings ballance: " + getSavingsBalance());
        }
    }
    public void withdraw(double amount, String account) {
        if(account.equals("checking")) {
            if(amount <= this.checkingBalance) {
                this.checkingBalance -= amount;
                System.out.println("New checking ballance: " + getCheckingBalance());
            }
            else System.out.println("Insufficient funds. Balance is: " + getCheckingBalance());
        }
        else if(account.equals("savings")) {
            if(amount <= this.savingsBalance) {
                this.savingsBalance -= amount;
                System.out.println("New savings ballance: " + getSavingsBalance());
            }
            else System.out.println("Insufficient funds. Balance is: " + getSavingsBalance());
        }
    }
    public void printTotalBalance() {
        System.out.println("Total balance: " + (getCheckingBalance() + getSavingsBalance()));
    }
}