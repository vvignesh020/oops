package in.vamsoft.day3.training;

import java.util.Scanner;

public class Producer extends Thread {
  Consumer consumer;
  private int number;

  public Producer(String name) {
    super(name);
    // TODO Auto-generated constructor stub
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }

  public void run() {
    try {
      Scanner s = new Scanner(System.in);
      int num;
      System.out.println("please enter the number :");
      while ((num = s.nextInt()) > 0) {
        System.out.println("the number read by producer" + num);
        this.number = num;
        synchronized (consumer) {
          consumer.notify();
        }
        synchronized (this) {
          wait();
        }
      }
      s.close();
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }

}
