package in.vamsoft.day3.training;

public class Account {
  double balance;

  public Account(double balance) {
    super();
    this.balance = balance;
  }

  public double getBalance() {
    return balance;

  }

  /**
   * @param amount.
   */
  public void withdraw(double amount) {
    if ((balance - amount) >= 0) {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      balance -= amount;
      System.out.println("withdrawl by thread" + Thread.currentThread().getName()
          + "successfull. the balance is" + getBalance());

    } else {
      System.out.println("insufficent balance for thread " + Thread.currentThread().getName()
          + ". the balance is" + getBalance());
    }

  }
}
