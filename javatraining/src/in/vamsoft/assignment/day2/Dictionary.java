package in.vamsoft.assignment.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
  public static void main(String[] args) {
    Map<String, String> maps = new HashMap<>();
    maps.put("java",
        "a general-purpose computer programming language designed to produce programs that will run on any computer system.");
    maps.put("compiler",
        "a person who produces a list or book by assembling information or written material collected from other sources.");
    maps.put("positive",
        "consisting in or characterized by the presence rather than the absence of distinguishing features.");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    if (maps.containsKey(word)) {
      System.out.println(maps.get(word));
    } else {
      System.out.println("invalid word");
    }
    sc.close();
  }

}
