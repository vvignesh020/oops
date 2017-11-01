package in.vamsoft.day2.collectios;

import java.util.Comparator;

public class MarkComparitor implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.mark < o2.mark) {
      return -1;
    } else if (o1.mark > o2.mark) {
      return 1;
    }
    return 0;
  }

}
