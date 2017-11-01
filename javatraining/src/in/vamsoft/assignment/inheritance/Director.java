package in.vamsoft.assignment.inheritance;

public class Director extends Manager {
  private double budjet;

  public Director(int empid, String name, int ssn, double salary, String department,
      double budjet) {
    super(empid, name, ssn, salary, department);
    this.budjet = budjet;
  }

  public double getBudjet() {
    return budjet;
  }

}
