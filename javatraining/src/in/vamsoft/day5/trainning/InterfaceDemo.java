package in.vamsoft.day5.trainning;

interface I1 {
  public default void m() {
    System.out.println("m in I1");

  }
}

interface I2 {
  public default void m() {
    System.out.println("m in I2");
  }
}


public class InterfaceDemo implements I1, I2 {
  public static void main(String[] args) {
InterfaceDemo i=new InterfaceDemo();
i.m();
  }

  @Override
  public void m() {
    I1.super.m();
  }

}
