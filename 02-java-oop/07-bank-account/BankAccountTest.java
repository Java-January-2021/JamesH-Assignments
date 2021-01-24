public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount James = new BankAccount();
        James.deposit(100.00, "savings");
        James.withdraw(105.00, "savings");
        James.withdraw(90.00, "savings");
        James.deposit(50.00, "checking");
        James.printTotalBalance();

    }
}