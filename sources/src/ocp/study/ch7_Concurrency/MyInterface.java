package ocp.study.ch7_Concurrency;

public interface MyInterface {

  default void someDefault() {
    // You can call an abstract method from within a default one.
    test();
  }

  void test();
}
