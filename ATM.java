// ATM class for defining the operations and restrictions of ATM
public class ATM {
    int sharedAccountBalance;

// A predefined constructor for ATM for defining the shared resource and usage of ATM operations
    public ATM(int balance) {
        this.sharedAccountBalance = balance;
    }

// Deposit function for ATM in synchronized manner
    public synchronized void deposit(int amount) {
        try {
            System.out.println(Thread.currentThread().getName() + "  Depositing: " + amount);
            // Delay the process for completely one by one thread completion
            Thread.sleep(500);
            sharedAccountBalance += amount;
            System.out.println(Thread.currentThread().getName() + "  Balance after deposit: " + sharedAccountBalance);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "  Deposit interrupted.");
        }
    }
// Withdraw function for ATM in synchronized manner
    public synchronized void withdraw(int amount) {
        try {
            System.out.println(Thread.currentThread().getName() + "  Withdrawing: " + amount);
            // Delay the process for completely one by one thread completion
            Thread.sleep(500);
            if (amount <= sharedAccountBalance) {
                sharedAccountBalance -= amount;
                System.out.println(Thread.currentThread().getName() + "  Balance after withdrawal: " + sharedAccountBalance);
            } else {
                System.out.println(Thread.currentThread().getName() + "  Insufficient funds! Current balance: " + sharedAccountBalance);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "  Withdrawal interrupted.");
        }
    }
// checkBalance function for ATM in synchronized manner
    public synchronized void checkBalance() {
        try {
            // Simulate delay in fetching balance
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + "  Current Balance: " + sharedAccountBalance);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "  Balance check interrupted.");
        }
    }
}

