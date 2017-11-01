package in.vamsoft.day4.trainning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestOnStreams {
  public static void main(String[] args) throws IOException {

    BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bWriter = new BufferedWriter(new FileWriter("text.txt", true));
    BufferedReader fReader = new BufferedReader(new FileReader("text.txt"));
    System.out.println("enter your name :   ");
    String name = bReader.readLine();

    bWriter.write("name: " + name);
    bWriter.newLine();
    System.out.println("enter your age : ");
    String age = bReader.readLine();
    bWriter.write("age : " + age);
    bWriter.newLine();

    bReader.close();
    bWriter.close();

    String data = "";
    while ((data = fReader.readLine()) != null) {
      System.out.println(data);

    }
    fReader.close();
  }
}
