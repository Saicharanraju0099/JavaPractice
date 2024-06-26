
public class Bank {
  static int CurrentBalance = 1000;

  public static void greetcustomer() {
    System.out.println("hello, Welcome");
  }

  public void deposit(int amount) {
    CurrentBalance = CurrentBalance + amount;

    System.out.println("Amount deposited successfully");
  }

  public static void withdrawal(int amount) {
    CurrentBalance = CurrentBalance - amount;
    System.out.println("Amount withdrawal successfully");
  }

  public int CurrentBalance() {
    return CurrentBalance;
  }

  public static void main(String[] args) {
    Bank bank = new Bank();
    greetcustomer();
    System.out.println("Current Balance is " + bank.CurrentBalance());
    bank.deposit(500);

    bank.withdrawal(300);
    System.out.println("Current Balance is " + bank.CurrentBalance());

  }
}