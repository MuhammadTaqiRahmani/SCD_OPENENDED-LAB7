// Defined class for Customer or Users to use the ATM class functionalities.
// Inheriting the Thread class for multithreading
public class Customer extends Thread {
    // shared Resources
      private ATM atm;
      private String transactionType;
      private int amount;
  // Constructor for the proper usage of resources and A header of Customer
      public Customer(ATM atm, String transactionType, int amount) {
          this.atm = atm;
          this.transactionType = transactionType;
          this.amount = amount;
      }
  // Using the run method from Thread class to process the threads parallely from ATM class.
      @Override
      public void run() {
          if (transactionType.equals("deposit")) {
              atm.deposit(amount);
          } else if (transactionType.equals("withdraw")) {
              atm.withdraw(amount);
          } else if (transactionType.equals("checkbalance")) {
              atm.checkBalance();
          } else {
              System.out.println(Thread.currentThread().getName() + "  Invalid transaction type");
          }
      }
  }
  