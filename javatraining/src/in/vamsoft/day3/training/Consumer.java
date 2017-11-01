package in.vamsoft.day3.training;

public class Consumer extends Thread {
  Producer producer;
  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setProducer(Producer producer) {
    this.producer = producer;
  }

  public Consumer(String name) {
    super(name);
  }

  public void run() {
    for (int i = 0; i <= 5; i++) {
      try {
        synchronized (this) {
          wait();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      int fact = factorial(producer.getNumber());
      System.out.println("factorial of the value is:" + fact);
      synchronized (producer) {
        producer.notify();
      }

    }
  }

  public int factorial(int num) {
    int fact =1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
