package ocp.study.ch1_AdvancedClassDesign.fromWhiz;

/**
 * @Author matus.korenek
 * @Date 17.11.2017
 */
public class Whiz {
      static int y = 1;
      public static void main(String[] args) {
            abstract class Cal {
                  public abstract int calc(int x);
            }
            Cal c = new Cal() {
                  public int calc(int x) { return x-y; }
            };
            System.out.println(c.calc(2));
      }
}
