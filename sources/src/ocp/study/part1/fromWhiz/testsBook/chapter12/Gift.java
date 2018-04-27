package ocp.study.part1.fromWhiz.testsBook.chapter12;

/**
 * @Author matus.korenek
 * @Date 6.1.2018
 */
interface Toy { String play(); }
public class Gift {
      public static void main(String ...unused) {
            abstract class Robot {}
            class Transformer extends Robot implements Toy {
                  public String name = "GiantRobot";
                  public String play() { return "DinosaurRobot"; }
            }
            Transformer prime = new Transformer() {
                  @Override
                  public String play() {
                        return name;
                  }
            };
            System.out.print(prime.play() + " " + prime.name);
      }
}
