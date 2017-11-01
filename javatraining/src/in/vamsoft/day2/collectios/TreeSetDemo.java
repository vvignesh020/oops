package in.vamsoft.day2.collectios;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    Set<Student> treeset = new TreeSet<>();
    Student s1 = new Student(1, "jk", 98);
    Student s2 = new Student(2, "jj", 56);
    Student s3 = new Student(3, "jd", 59);
    Student s4 = new Student(1, "jk", 98);

    treeset.add(s1);
    treeset.add(s2);
    treeset.add(s3);
    treeset.add(s4);

    System.out.println(treeset);
    Set<Student> markset = new TreeSet<>(new MarkComparitor());
    markset.add(s1);
    markset.add(s2);
    markset.add(s3);
    markset.add(s4);
    System.out.println(markset);
    Set<Employee> empset = new TreeSet<>(new SalaryCompare());
    Employee e1 = new Employee(1, "jk", 25000);
    Employee e2 = new Employee(2, "JAYA", 35000);
    Employee e3 = new Employee(3, "praveen", 15000);
    Employee e4 = new Employee(4, "vignesh", 23000);
    empset.add(e1);
    empset.add(e2);
    empset.add(e3);
    empset.add(e4);

    System.out.println(empset);
  }
}
