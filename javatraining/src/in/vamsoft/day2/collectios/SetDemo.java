package in.vamsoft.day2.collectios;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author vamsoft.
 *
 */
public class SetDemo {
  /**
   * @param args.
   */
  public static void main(String[] args) {
    Set<Student> intset = new LinkedHashSet<>();
    Student s1 = new Student(1, "jk", 98);
    Student s2 = new Student(2, "jj", 56);
    Student s3 = new Student(3, "jd", 59);
    Student s4 = new Student(1, "jk", 98);

    intset.add(s1);
    intset.add(s2);
    intset.add(s3);
    intset.add(s4);
    System.out.println(intset);
  }

}
