package ocp.study.part1.fromWhiz.testsBook.chapter12;

/**
 * @Author matus.korenek
 * @Date 6.1.2018
 */

enum DaysOff {
      Thanksgiving, PresidentsDay, ValentinesDay
}
public class Vacation {
      public static void main(String ...unused) {
            final DaysOff input = DaysOff.Thanksgiving;
            switch (input) {
                  default:
                  case ValentinesDay:
                        System.out.print("1");
                  case PresidentsDay:
                        System.out.print("2");
            }
      }
}
