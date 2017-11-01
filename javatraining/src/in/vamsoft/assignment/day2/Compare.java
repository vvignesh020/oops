package in.vamsoft.assignment.day2;

import java.util.Comparator;

public class Compare implements Comparator<Customer> {

  @Override
  public int compare(Customer o1, Customer o2) {
    int t;
    t = ((Integer) o1.getId()).compareTo(o2.getId());
    if (t == 0) {
      t = (o1.getName().compareTo(o2.getName()));
    }
    if (t == 0) {
      t = ((Integer) o1.getPhone()).compareTo(o2.getPhone());
    }

    return t;
  }
}
