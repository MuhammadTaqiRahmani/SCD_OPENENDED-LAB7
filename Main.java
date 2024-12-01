// Main class for whole system.
public class Main {
    // Main method used for calling of all functions of ATM and Customers, and creating the threads for Customer class
      public static void main(String[] args) {
        // Creating ATM Object
          ATM atm = new ATM(1000);
        // Creating the Threads for Customers 
          Thread customer1 = new Customer(atm, "deposit", 500);
          Thread customer2 = new Customer(atm, "withdraw", 300);
          Thread customer3 = new Customer(atm, "checkbalance", 0);
          Thread customer4 = new Customer(atm, "withdraw", 1500);
  
        // Defining the Customers as Threads
          customer1.setName("Customer 1");
          customer2.setName("Customer 2");
          customer3.setName("Customer 3");
          customer4.setName("Customer 4");
  
        // Running the Threads parallely 
          customer1.start();
          customer2.start();
          customer3.start();
          customer4.start();
      }
  }
  