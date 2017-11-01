package in.vamsoft.day1.exception;

public class SalaryException extends Exception {

  enum SalaryErrorCode {
    min_lvel, max_level;
  }

  /**
   * .
   *
   */
  SalaryErrorCode errorcode;

  /**
   * .
   *
   */
  public SalaryException() {
    super();

  }

  /**
   * @param message.
   * @param errorCode.
   */
  public SalaryException(String message, SalaryErrorCode errorCode) {
    super(message);
    errorcode = errorCode;

  }

  /**
   * @return.
   */
  public SalaryErrorCode getErrorCode() {
    return errorcode;
  }

}
