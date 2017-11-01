package in.vamsoft.day4.trainning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter text ");
    System.out.println("type quit to exit");
    try {
      String tex = br.readLine();
      do {
        if (tex == "quit") {
          System.out.println("text edit is terminated");
          
        } else {
          System.out.println("your entered line is :/n" + tex);

        }
      } while (br.readLine() !="quit");
      br.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
