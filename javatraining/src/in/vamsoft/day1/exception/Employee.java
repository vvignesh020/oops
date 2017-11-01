package in.vamsoft.day1.exception;

import in.vamsoft.day1.exception.SalaryException.SalaryErrorCode;

/**
 * @author vamsoft.
 *
 */
public class Employee {
  int empid;
  String empname;
  double empsalary;
  int empage;

  /**
   * @return
   */
  public int getEmpid() {
    return empid;
  }

  /**
   * @param empid
   */
  public void setEmpid(int empid) {
    this.empid = empid;
  }

  /**
   * @return
   */
  public String getEmpname() {
    return empname;
  }

  /**
   * @param empname
   */
  public void setEmpname(String empname) {
    this.empname = empname;
  }

  /**
   * @return
   */
  public double getEmpsalary() {
    return empsalary;
  }

  /**
   * @param empsalary
   * @throws SalaryException
   */
  public void setEmpsalary(double empsalary) throws SalaryException {
    if (empsalary < 25000) {
      throw new SalaryException("below the inital salary", SalaryErrorCode.min_lvel);

    } else if (empsalary > 300000) {
      throw new SalaryException("above maximum salary", SalaryErrorCode.max_level);
    }
    setEmpsalary(300000);
    this.empsalary = empsalary;
  }

  /**
   * @return
   */
  public int getEmpage() {
    return empage;
  }

  /**
   * @param empage
   */
  public void setEmpage(int empage) {

    this.empage = empage;
  }

}
