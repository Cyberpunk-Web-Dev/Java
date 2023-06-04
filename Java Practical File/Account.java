import java.util.Scanner;

public class Account{
    private int ac_no;
    private String name;
    private String ac_name;
    private double balance;

    
    public Account(int ac_no, String name, String ac_name, double balance) {
        this.ac_no = ac_no;
        this.name = name;
        this.ac_name = ac_name;
        this.balance = balance;
    }

    public void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    
    public void display() {
        System.out.println("Account Number: " + ac_no);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Type: " + ac_name);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account(123456890, "GULSHAN KUMAR", "Digi Savings A/c", 5000.00);
        account.display();
        account.withdrawal();
        account.deposit();
        account.display();
    }
}
