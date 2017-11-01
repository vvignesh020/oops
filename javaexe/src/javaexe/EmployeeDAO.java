package javaexe;

import java.util.List;

/**
 * employeeDAO is an interface.
 * @author vamsoft.
 *
 */
public interface EmployeeDAO {

  boolean addEmployee(Employee emp);

  boolean removeEmployee(int empid);

  Employee findEmployee(int empid);

  List<Employee> allEMployee();

}