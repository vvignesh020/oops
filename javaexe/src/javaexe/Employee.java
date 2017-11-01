package javaexe;

import java.time.LocalDate;
import org.apache.log4j.Logger;

public class Employee {
  private static final Logger logger = Logger.getLogger(Employee.class);
  int empid;
  String name;
  double salary;
  LocalDate date;
  int dep;

  /**
   * @return returns the enployee id from get method.
   */
  public int getEmpid() {
    if (logger.isDebugEnabled()) {
      logger.debug("entering getEmpid()");
      logger.debug("exiting getEmpid()");
      logger.debug("returning: " + empid);
    }
    return empid;
  }

  public void setEmpid(int empid) {
    if (logger.isDebugEnabled()) {
      logger.debug("entering setEmpid(int)");
      logger.debug("empid: " + empid);
    }
    this.empid = empid;
    if (logger.isDebugEnabled()) {
      logger.debug("exiting setEmpid()");
    }
  }

  public String getName() {
    if (logger.isDebugEnabled()) {
      logger.debug("entering getName()");
      logger.debug("exiting getName()");
      logger.debug("returning: " + name);
    }
    return name;
  }

  /**
   * @param name
   */
  public void setName(String name) {
    if (logger.isDebugEnabled()) {
      logger.debug("entering setName(String)");
      logger.debug("name: \"" + name + "\"");
    }
    this.name = name;
    if (logger.isDebugEnabled()) {
      logger.debug("exiting setName()");
    }
  }

  public double getSalary() {
    if (logger.isDebugEnabled()) {
      logger.debug("entering getSalary()");
      logger.debug("exiting getSalary()");
      logger.debug("returning: " + salary);
    }
    return salary;
  }

  public void setSalary(double salary) {
    if (logger.isDebugEnabled()) {
      logger.debug("entering setSalary(double)");
      logger.debug("salary: " + salary);
    }
    this.salary = salary;
    if (logger.isDebugEnabled()) {
      logger.debug("exiting setSalary()");
    }
  }

  public LocalDate getDate() {
    if (logger.isDebugEnabled()) {
      logger.debug("entering getDate()");
      logger.debug("exiting getDate()");
      logger.debug("returning: " + date);
    }
    return date;
  }

  public void setDate(LocalDate date) {
    if (logger.isDebugEnabled()) {
      logger.debug("entering setDate(LocalDate)");
      logger.debug("date: " + date);
    }
    this.date = date;
    if (logger.isDebugEnabled()) {
      logger.debug("exiting setDate()");
    }
  }

  public int getDep() {
    if (logger.isDebugEnabled()) {
      logger.debug("entering getDep()");
      logger.debug("exiting getDep()");
      logger.debug("returning: " + dep);
    }
    return dep;
  }

  public void setDep(int dep) {
    if (logger.isDebugEnabled()) {
      logger.debug("entering setDep(int)");
      logger.debug("dep: " + dep);
    }
    this.dep = dep;
    if (logger.isDebugEnabled()) {
      logger.debug("exiting setDep()");
    }
  }

  public Employee() {

  }

  public Employee(int empid, String name, double salary, LocalDate date, int dep) {
    super();
    this.empid = empid;
    this.name = name;
    this.salary = salary;
    this.date = date;
    this.dep = dep;
  }

  @Override
  public String toString() {
    if (logger.isDebugEnabled()) {
      logger.debug("entering toString()");
      logger.debug("exiting toString()");
      logger.debug("returning: " + ("Employee [empid=" + empid + ", name=" + name + ", salary="
          + salary + ", date=" + date + ", dep=" + dep + "]"));
    }
    return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", date=" + date
        + ", dep=" + dep + "]";
  }

}
