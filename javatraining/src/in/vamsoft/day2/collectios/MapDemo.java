package in.vamsoft.day2.collectios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    System.out.println(map.put(1, "a"));
    System.out.println(map.put(2, "b"));
    System.out.println(map.put(3, "c"));
    System.out.println(map.put(4, "d"));
    System.out.println(map.put(1, "e"));

    System.out.println(map);
    System.out.println(map.get(3));
    System.out.println(map.containsValue("e"));
    System.out.println(map.keySet());
    System.out.println(map.values());

    Set<Entry<Integer, String>> m = map.entrySet();
    for (Entry<Integer, String> e : m) {
      System.out.println(e.getKey() + " " + e.getValue());
    }
  }
}
