package java_tasks;

public class BankAccount {

    private String account;
    protected int balance;

    public BankAccount(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public static void test() {
        System.out.println("This is static method of class java.BankAccount");
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawMoney(int value) {
        Boolean notEmpty = checkIfNotEmpty(value);
        if (notEmpty) {
            balance = balance - value;
        }
    }

    public void topUpBalance(int value) {
        balance = balance + value;
    }

    private Boolean checkIfNotEmpty(int value) {
        if (balance <= 0) return false;
        int resultBalance = balance - value;
        if (resultBalance < 0) return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        if (this.account.equals(((BankAccount) obj).account)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return account.hashCode() + balance;
    }
}
