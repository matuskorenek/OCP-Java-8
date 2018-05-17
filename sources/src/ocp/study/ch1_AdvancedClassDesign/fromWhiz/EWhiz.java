package ocp.study.ch1_AdvancedClassDesign.fromWhiz;

/**
 * @Author matus.korenek
 * @Date 18.2.2018
 */
interface I {
      default boolean equals1(Object O) {
            return true;
      }
      static void method() {

      }
}

class A implements I {
      public boolean equals1(Object O) {
            return false;
      }
}

public class EWhiz {

      public static void main(String[] args) {
            A a = new A();
            I ia = new A();
            I i = new I() {};

            System.out.println(a.equals1(ia) + " " + i.equals1(ia));
      }
}
