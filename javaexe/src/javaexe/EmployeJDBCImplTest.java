/**
 * 
 */
package javaexe;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**.
 * @author vamsoft.
 *
 */
public class EmployeJDBCImplTest {
  static EmployeeDAO dao;

  /**.
   * @throws java.lang.Exception.
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    dao = EmployeeDAOFactory.createEmployeeDAO();
  }

  /**
   * @throws java.lang.Exception.
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**.
   * @throws java.lang.Exception.
   */
  @Before
  public void setUp() throws Exception {
  }

  /**.
   * @throws java.lang.Exception.
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Test method for
   * {@link javaexe.EmployeJDBCImpl#addEmployee(javaexe.Employee)}.
   */
  @Test

  public void testAddEmployee() {
    Employee emp = new Employee(104, "siva", 12000,
        LocalDate.parse("12-10-2017", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 90);
    boolean result = dao.addEmployee(emp);
    assertTrue(result);
  }

  /**
   * Test method for {@link javaexe.EmployeJDBCImpl#removeEmployee(int)}.
   */
  @Test
  public void testRemoveEmployee() {
    int empid = 104;
    boolean result = dao.removeEmployee(empid);
    assertTrue(result);

  }

  /**
   * Test method for {@link javaexe.EmployeJDBCImpl#findEmployee(int)}.
   */
  @Test
  public void testFindEmployee() {
    int empid = 105;
    
    Employee emp=dao.findEmployee(empid);
    assertNotNull(emp);
    assertEquals(empid, emp.getEmpid());

  }

  /**
   * Test method for {@link javaexe.EmployeJDBCImpl#allEMployee()}.
   */
  @Test
  public void testAllEMployee() {
    List<Employee> list=dao.allEMployee();
    assertTrue(list.size()>0 );
    assertNotNull(list.get(0));
  }

  /**
   * Test method for {@link javaexe.EmployeJDBCImpl#EmployeJDBCImpl()}.
   */
  @Test
  public void testEmployeJDBCImpl() {
  }

}
