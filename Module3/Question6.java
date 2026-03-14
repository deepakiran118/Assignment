package Module3;

class BankAccount {
    int accountNumber;
    double balance;
    void deposit(double amt) {
        balance += amt;
    }
    void withdraw(double amt) {
        if(balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn:"+amt);
        }else{
            System.out.println("Insufficient balance!");
        }
    }
}
public class Question6 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.balance);
    }
}
