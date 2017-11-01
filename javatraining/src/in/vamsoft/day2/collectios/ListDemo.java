package in.vamsoft.day2.collectios;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author vamsoft.
 *
 */
public class ListDemo {
  /**
   * @param args.
   */
  public static void main(String[] args) {
    List<Integer> marklist = new LinkedList<Integer>();
    marklist.add(10);
    marklist.add(30);
    marklist.add(40);
    marklist.add(60);
    int sum = 0;
    for (int marks : marklist) {
      sum += marks;
      System.out.println("sum of " + sum);
    }
    double average = sum / marklist.size();
    System.out.println("avearage" + average);
    System.out.println("the size of list" + marklist.size());

    System.out.println(marklist);
    Iterator<Integer> list = marklist.iterator();
    {
      while (list.hasNext()) {
        System.out.println(list.next() + " ");

      }
    }
    List<Student> ls = new LinkedList<>();
    Student s1 = new Student(1, "jk", 98);
    Student s2 = new Student(2, "jj", 56);
    Student s3 = new Student(3, "jd", 59);
    Student s4 = new Student(1, "jk", 98);

    ls.add(s1);
    ls.add(s2);
    ls.add(s3);
    ls.add(s4);
    Collections.sort(ls, new MarkComparitor());

    Collections.sort(marklist, Collections.reverseOrder());
    for (int marks : marklist) {
      System.out.println("______________________");
      System.out.println(marks);
    }
    for (Student ss : ls) {
      System.out.println(ss);

    }
    System.out.println("--------------------");
    Collections.sort(marklist);
    int p = Collections.binarySearch(marklist, 20);
    System.out.println(p);

  }

}
