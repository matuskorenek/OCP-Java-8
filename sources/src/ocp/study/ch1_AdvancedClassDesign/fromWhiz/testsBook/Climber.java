package ocp.study.ch1_AdvancedClassDesign.fromWhiz.testsBook;

/**
 * @Author matus.korenek
 * @Date 7.1.2018
 */
interface Climb {
      boolean isTooHigh(int height, int limit);
}
public class Climber {
      public static void main(String[] args) {
//            check((h, l) -> h.toString(), 5);
            check((h, l) -> h > l, 5);
      }
      private static void check(Climb climb, int height) {
            if(climb.isTooHigh(height, 10))
                  System.out.println("too high");
            else  System.out.println("ok");
      }
}
