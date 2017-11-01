package in.vamsoft.assignment.day2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CustomerTest {
  public static void main(String[] args) {
    List<Customer> list = new LinkedList<>();
    Customer c1 = new Customer(1, "jaya", 851364531, "chennai");
    Customer c2 = new Customer(3, "kumar", 851364521, "chennai");
    Customer c3 = new Customer(2, "vignesh", 851364511, "chennai");
    Customer c4 = new Customer(4, "power", 851364551, "chennai");
    list.add(c1);
    list.add(c2);
    list.add(c3);
    list.add(c4);

    System.out.println(list);
    Collections.sort(list, new Compare());
    System.out.println(list);
  }

}
