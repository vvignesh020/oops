package in.vamsoft.assignment.threads3;

import java.io.File;
import java.util.Scanner;

class Consumer extends Thread {
  Producer producer;
  private int number;

  public int  getNumber() {
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
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    return fact;
  }
}

class Producer extends Thread {
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

public class ThreadWait {
  public static void main(String[] args) {
    Producer producer = new Producer("producer");
    Consumer consumer = new Consumer("consumer");
    producer.setConsumer(consumer);
    consumer.setProducer(producer);
    consumer.start();
    producer.start();

  }

}
