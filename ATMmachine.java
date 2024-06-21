import java.util.Scanner;

class Account{
    //default value taken
    float balance=5000;
    int PIN=1234;
}

class ATM extends Account{
    boolean flag = true;
    Scanner sc = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your 4-digit PIN >(1234)");
        int input = sc.nextInt();
        if (PIN == input) {
            while (flag) {
                Interface();
            }
        } else {
            System.out.println("!! Incorrect, try again.");
            checkPin();
        }
    }

    public void checkBalance() {
        System.out.println("Balance: Rs " + balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance, check balance!!");
        } else {
            System.out.println("Rs " + amount + " withdrawn successfully.");
            balance -= amount;
        }
    }

    public void deposit(int amount) {
        System.out.println("Rs " + amount + " diposited in your account.");
        balance += amount;
    }

    public void Interface() {
        System.out.println("\n------== Choose action ==------");
        System.out.println("\t1. A/C Balance");
        System.out.println("\t2. Withdraw");
        System.out.println("\t3. Deposit");
        System.out.println("\t4. Exit");
        int choice = sc.nextInt();
        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();
            withdraw(amount);
        } else if (choice == 3) {
            System.out.println("Enter deposite amount");
            int amount = sc.nextInt();
            deposit(amount);
        } else if (choice == 4) {
            System.out.println("Thanks for using our ATM.");
            flag=false;
            return;
        } else {
            System.out.println("Invalid option, try again !!");
        }
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println();
        System.out.println("******** Welcome to ATM ********");
        atm.checkPin();
    }
}
