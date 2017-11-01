package in.vamsoft.day3.training;

public class ThreadFactorial {
  public static void main(String[] args) {
    Producer producer=new Producer("producer");
    Consumer consumer=new Consumer("consumer");
    producer.setConsumer(consumer);
    consumer.setProducer(producer);
    consumer.start();
    producer.start();
  }

}
