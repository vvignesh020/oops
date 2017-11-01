package in.vamsoft.day3.training;

public class Banking implements Runnable {
  Account a;
  double withdrawalAmount;

  public Banking(Account a, double withdrawalAmount) {
    super();
    this.a = a;
    this.withdrawalAmount = withdrawalAmount;
  }

  @Override
  public void run() {
    System.out.println("balnce for:" + Thread.currentThread().getName() + " " + a.getBalance());
    synchronized (a) {
      a.withdraw(withdrawalAmount);

    }
  }

  public static void main(String[] args) {
    Account account = new Account(10000);
    Banking b1 = new Banking(account, 15000);
    Banking b2 = new Banking(account, 5000);
    Thread t1 = new Thread(b1, "transaction1");
    Thread t2 = new Thread(b2, "transaction2");
    t1.start();
    t2.start();
  }
}
