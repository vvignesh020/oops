package in.vamsoft.day3.training;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class rThread implements Runnable {
  public rThread(String jobname) {
    super();
    this.jobname = jobname;
  }

  String jobname;

  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }

  }

}

class cThread implements Callable<Integer>{

  @Override
  public Integer call() throws Exception {
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      sum +=i;
    }
    return sum;
  }
  
}
public class ExecutorThread {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service=Executors.newFixedThreadPool(2);
    service.execute(new rThread("job1"));
    service.execute(new rThread("job2"));
    service.execute(new rThread("job3"));
    service.execute(new rThread("job4"));
    service.execute(new rThread("job5"));
    Future<Integer> result=service.submit(new cThread());
    System.out.println(result.get());
    service.shutdown();
    
  }
}
