package in.vamsoft.day2.collectios;

/**
 * @author vamsoft.
 *
 */
public class Student implements Comparable<Student> {
  int rollno;
  String name;
  int mark;

  /**
   * @param rollno.
   * @param name.
   * @param mark.
   */
  public Student(int rollno, String name, int mark) {
    super();
    this.rollno = rollno;
    this.name = name;
    this.mark = mark;
  }

  @Override
  public String toString() {
    return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]\n";
  }

  @Override
  public int hashCode() {
    System.out.println("Student.hashCode()");
    final int prime = 31;
    int result = 1;
    result = (prime * result) + rollno;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println("Student.equals()");
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Student other = (Student) obj;
    if (rollno != other.rollno) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Student o) {
    if (rollno < o.rollno) {
      return -1;
    } else if (rollno > o.rollno) {
      return 1;
    }
    return 0;
  }
}
