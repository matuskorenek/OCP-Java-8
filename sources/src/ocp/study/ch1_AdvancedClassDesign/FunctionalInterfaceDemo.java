package ocp.study.ch1_AdvancedClassDesign;

public class FunctionalInterfaceDemo {

  @FunctionalInterface
  public interface MyDefInterface {
      default void defdoIt() { System.out.println("defdoIt"); }
      static void statdoIt() { System.out.println("statdoIt");}
      void doItNow();  // SAM
  }


  public static void main(String[] args) {
    MyDefInterface myDefInterface = () -> System.out.println("just do it");

    myDefInterface.defdoIt();
    myDefInterface.doItNow();
    MyDefInterface.statdoIt();
  }
}
